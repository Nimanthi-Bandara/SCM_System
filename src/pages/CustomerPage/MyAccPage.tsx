import React, { useState } from "react";
import "./MyAccPage.css";
import { useNavigate } from 'react-router-dom';

const navigate = useNavigate();

const MyAccPage: React.FC = () => {
  const user = {
    name: "John Doe",
    phone: "+94 12 345 6789",
    email: "john.doe@example.com",
    address: "5th street, Colombo 03",
  };

  return (
    <div className="user-page-content">
      <div className="container-fluid pt-5">
        <div className="container">
          <div className="row">
            <div className="col-lg-8">
              <div className="mb-3">
                <div className="section-title">
                  <h4 className="section-title mt-4 mb-2">My Orders</h4>
                </div>
                <div className="row align-items-center mb-3">
                  <div className="col-lg-4">
                    <p className="mb-0">
                      <strong>Order ID:</strong> ORD123456
                    </p>
                  </div>
                  <div className="col-lg-4">
                    <button className="btn btn-success btn-sm w-80">
                      Order Details
                    </button>
                  </div>
                  <div className="col-lg-4">
                    <button className="btn btn-success btn-sm w-80" onClick={() => navigate('/order-track')}>
                      Track Order
                    </button>
                  </div>
                </div>
              </div>
            </div>
            {/*user profile*/}
            <div className="col-lg-4">
              <div className="profile-card text-center">
                <div className="profile-header text-center">
                  <div className="avatar-container">
                    <img
                      src="/api/placeholder/150/150"
                      alt="Profile"
                      className="profile-avatar"
                    />
                    <span className="status-badge"></span>
                  </div>
                  <h2 className="profile-name">{user.name}</h2>
                </div>

                <div className="profile-info">
                  <div className="info-item">
                    <i className="bi bi-person-circle fs-4"></i>
                    <div className="info-content">
                      <label>Full Name</label>
                      <p>{user.name}</p>
                    </div>
                  </div>
                  <div className="info-item">
                    <i className="bi bi-envelope-fill fs-4"></i>
                    <div className="info-content">
                      <label>Phone </label>
                      <p>{user.phone}</p>
                    </div>
                  </div>
                  <div className="info-item">
                    <i className="bi bi-envelope-fill fs-4"></i>
                    <div className="info-content">
                      <label>Email</label>
                      <p>{user.email}</p>
                    </div>
                  </div>
                  <div className="info-item">
                    <i className="bi bi-envelope-fill fs-4"></i>
                    <div className="info-content">
                      <label>Address</label>
                      <p>{user.address}</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default MyAccPage;
