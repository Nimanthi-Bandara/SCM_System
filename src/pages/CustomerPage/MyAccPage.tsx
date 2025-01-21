import React, { useState, useEffect } from 'react';
import "../../App.css";

interface UserProfile {
  name: string;
  email: string;
  phone: string;
  address: string;
}

// API functions for backend communication
const api = {
  fetchUserProfile: async (): Promise<UserProfile> => {
    try {
      const response = await fetch('/api/user/profile', {
        headers: {
          'Authorization': `Bearer ${localStorage.getItem('token')}`
        }
      });
      if (!response.ok) throw new Error('Failed to fetch profile');
      return response.json();
    } catch (error) {
      throw new Error('Error fetching profile data');
    }
  },

  updateUserProfile: async (data: UserProfile): Promise<UserProfile> => {
    try {
      const response = await fetch('/api/user/profile', {
        method: 'PUT',
        headers: {
          'Content-Type': 'application/json',
          'Authorization': `Bearer ${localStorage.getItem('token')}`
        },
        body: JSON.stringify(data)
      });
      if (!response.ok) throw new Error('Failed to update profile');
      return response.json();
    } catch (error) {
      throw new Error('Error updating profile data');
    }
  },

  logout: async () => {
    try {
      const response = await fetch('/api/auth/logout', {
        method: 'POST',
        headers: {
          'Authorization': `Bearer ${localStorage.getItem('token')}`
        }
      });
      if (!response.ok) throw new Error('Logout failed');
      localStorage.removeItem('token');
      window.location.href = '/login';
    } catch (error) {
      throw new Error('Error during logout');
    }
  }
};

const MyAccPage = () => {
  const [isEditing, setIsEditing] = useState(false);
  const [profile, setProfile] = useState<UserProfile | null>(null);
  const [tempProfile, setTempProfile] = useState<UserProfile | null>(null);
  const [isLoading, setIsLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);
  const [saveError, setSaveError] = useState<string | null>(null);

  useEffect(() => {
    const fetchProfile = async () => {
      try {
        setIsLoading(true);
        const data = await api.fetchUserProfile();
        setProfile(data);
        setTempProfile(data);
      } catch (err) {
        setError('Failed to load profile data. Please try again later.');
      } finally {
        setIsLoading(false);
      }
    };

    fetchProfile();
  }, []);

  const handleInputChange = (field: keyof UserProfile) => (
    e: React.ChangeEvent<HTMLInputElement>
  ) => {
    if (tempProfile) {
      setTempProfile({
        ...tempProfile,
        [field]: e.target.value,
      });
    }
  };

  const handleSave = async () => {
    if (!tempProfile) return;
    
    try {
      setSaveError(null);
      setIsLoading(true);
      const updatedProfile = await api.updateUserProfile(tempProfile);
      setProfile(updatedProfile);
      setTempProfile(updatedProfile);
      setIsEditing(false);
    } catch (err) {
      setSaveError('Failed to update profile. Please try again.');
    } finally {
      setIsLoading(false);
    }
  };

  const handleCancel = () => {
    setTempProfile(profile);
    setIsEditing(false);
    setSaveError(null);
  };

  if (isLoading && !profile) {
    return (
      <div className="account-container">
        <div className="account-card">
          <div className="loading">Loading profile data...</div>
        </div>
      </div>
    );
  }

  if (error) {
    return (
      <div className="account-container">
        <div className="error-message">{error}</div>
      </div>
    );
  }

  if (!profile || !tempProfile) return null;

  return (
    <div>   
    <div className="account-container">
      <div className="account-card">
        <div className="card-header">
          <h2 className="card-title">My Account</h2>
          <button 
            className="logout-button"
            onClick={api.logout}
            disabled={isLoading}
          >
            Logout
          </button>
        </div>

        <div className="card-content">
          {saveError && (
            <div className="error-message">{saveError}</div>
          )}

          <div className="form-group">
            <div className="input-group">
              <label>Name:</label>
              <input
                type="text"
                value={isEditing ? tempProfile.name : profile.name}
                onChange={handleInputChange('name')}
                disabled={!isEditing || isLoading}
                placeholder="Name"
              />
            </div>

            <div className="input-group">
              <label>Email:</label>
              <input
                type="email"
                value={isEditing ? tempProfile.email : profile.email}
                onChange={handleInputChange('email')}
                disabled={!isEditing || isLoading}
                placeholder="Email"
              />
            </div>

            <div className="input-group">
              <label>Phone:</label>
              <input
                type="tel"
                value={isEditing ? tempProfile.phone : profile.phone}
                onChange={handleInputChange('phone')}
                disabled={!isEditing || isLoading}
                placeholder="Phone"
              />
            </div>

            <div className="input-group">
              <label>Address:</label>
              <input
                type="text"
                value={isEditing ? tempProfile.address : profile.address}
                onChange={handleInputChange('address')}
                disabled={!isEditing || isLoading}
                placeholder="Address"
              />
            </div>
          </div>

          <div className="button-group">
            {isEditing ? (
              <>
                <button 
                  className="save-button"
                  onClick={handleSave} 
                  disabled={isLoading}
                >
                  {isLoading ? 'Saving...' : 'Save'}
                </button>
                <button 
                  className="cancel-button"
                  onClick={handleCancel}
                  disabled={isLoading}
                >
                  Cancel
                </button>
              </>
            ) : (
              <button 
                className="edit-button"
                onClick={() => setIsEditing(true)}
                disabled={isLoading}
              >
                Edit
              </button>
            )}
          </div>
        </div>
      </div>
    </div>
    </div>
  );
};


export default MyAccPage;