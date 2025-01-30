import "bootstrap/dist/css/bootstrap.min.css";
import "../../App.css";
import axios from "axios";
import { useState } from "react";

const MainLogin = () => {
  const [loginData, setLoginData] = useState({
    userId: "",
    password: "",
    userType: "",
  });
  const [registerData, setRegisterData] = useState({
    firstName: "",
    lastName: "",
    email: "",
    password: "",
  });

  //form Submission
  const handleLogin = async (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();

    try {
      const response = await axios.post("api/login", loginData);
      console.log("Login successful", response.data);
    } catch (error) {
      console.error("Login error", error);
    }
  };

  const handleRegister = async (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();

    try {
      const response = await axios.post("api/register", registerData);
      console.log("Registration successful", response.data);
    } catch (error) {
      console.error("register error", error);
    }
  };

  ////////
  const handleLoginChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    setLoginData((prevData) => ({ ...prevData, [name]: value }));
  };
  const handleRegisterChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    setRegisterData((prevData) => ({ ...prevData, [name]: value }));
  };
  ////////

  return (
    <div className="container-fluid bg-dark py-4">
      <div className="container">
        <div className="row full-screen justify-content-center align-items-center">
          <div className="col-6 right py-4">
            <div className="form">
              <div className="text-center">
                <h6>
                  <span>Log In</span> <span>Sign Up</span>
                </h6>
                <input type="checkbox" className="checkbox" id="reg-log" />
                <label htmlFor="reg-log"></label>
                <div className="card-3d-wrap">
                  <div className="card-3d-wrapper">
                    <div className="card-front">
                      <div className="center-wrap">
                        <h4 className="heading">Log In</h4>
                        <form onSubmit={handleLogin}>
                          <div className="form-group">
                            <input
                              type="email"
                              className="form-style"
                              placeholder="Your User ID"
                              name="userId" 
                              value={loginData.userId}  
                              onChange={handleLoginChange}
                            />
                          </div>
                          <div className="form-group">
                            <input
                              type="password"
                              className="form-style"
                              placeholder="Your Password"
                              name="password" 
                              value={loginData.password}  
                              onChange={handleLoginChange}
                            />
                          </div>
                          <a href="#" className="submit-btn">
                            LOGIN
                          </a>
                        </form>
                      </div>
                    </div>
                    <div className="card-back">
                      <div className="center-wrap">
                        <h4 className="heading">Register</h4>
                        <form onSubmit={handleRegister}>
                          <div className="form-group">
                            <input
                              type="text"
                              className="form-style"
                              placeholder="First Name"
                              name="firstname" 
                              value={registerData.firstName}  
                              onChange={handleRegisterChange}
                            />
                          </div>
                          <div className="form-group">
                            <input
                              type="text"
                              className="form-style"
                              placeholder="Last Name"
                              name="lastname" 
                              value={registerData.lastName}  
                              onChange={handleRegisterChange}
                            />
                          </div>
                          <div className="form-group">
                            <input
                              type="text"
                              className="form-style"
                              placeholder="Email"
                              name="email" 
                              value={registerData.email}  
                              onChange={handleRegisterChange}
                            />
                          </div>
                          <div className="form-group">
                            <input
                              type="email"
                              className="form-style"
                              placeholder="Password"
                              name="password" 
                              value={registerData.password}  
                              onChange={handleRegisterChange}
                            />
                          </div>
                          <a href="#" className="submit-btn">
                            Register
                          </a>
                        </form>
                      </div>
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
export default MainLogin;
