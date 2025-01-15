import {  Nav } from "react-bootstrap";
import { Link } from "react-router-dom";
import logo from "../assets/logo.png";
// import user from "../assets/user.png";

const CustomerNavBar = () => (
  <div className="container-fluid bg-blur">
  <div className="container">
    <nav className="navbar navbar-expand-lg bg-transparent">
      <div className="container-fluid">
        <img className="" src={logo} style={{ maxWidth: "4.5rem", height: "auto" }} alt="Logo" />
        <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse justify-content-end" id="navbarNav">
          <ul className="navbar-nav">
            <li className="nav-item">
              <Nav.Link as={Link} to="/customer" className="text-white nav-link active" aria-current="page">Home</Nav.Link>
            </li>
            <li className="nav-item">
              <Nav.Link as={Link} to="/customer/products" className="text-white nav-link">Products</Nav.Link>
            </li>
            <li className="nav-item">
              <Nav.Link as={Link} to="/customer/history" className="text-white nav-link">Order History</Nav.Link>
            </li>
          </ul>
        </div>
        
      </div>
    </nav>
  </div>
</div>
);

export default CustomerNavBar;


