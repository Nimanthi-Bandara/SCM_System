import { Nav } from "react-bootstrap";
import { Link } from "react-router-dom";
import logo from "../assets/logo.png";
import user from "../assets/user.png";
import "bootstrap/dist/css/bootstrap.min.css";
import SupplierNavBar from "./SupplierNavBar";
import AdminNavBar from "./AdminNavBar";

// DEFAULT NAV BAR
const DefaultNavBar = () => (
  // <Navbar>
  //   <Container className="bg-transparent m-3">
  //     <Nav>
  //       <img className="" src={logo} style={{ maxWidth: "4.5rem", height: "auto" }} alt="Logo" />
  //       <Nav.Link as={Link} to="/" className="text-white">Home</Nav.Link>
  //       <Nav.Link as={Link} to="/about" className="text-white">About Us</Nav.Link>
  //       <Nav.Link as={Link} to="/products" className="text-white">Products</Nav.Link>
  //     </Nav>
  //     <Button style={{ width: "3rem", height: "3rem" }} variant="outline-primary" className="rounded-circle">
  //       <img src={user} alt="Profile" width="24" height="24" />
  //     </Button>
  //   </Container>
  // </Navbar>
  <div className="navbar-wrapper">
    <div className="container-fluid bg-blur">
      <div className="container">
        <nav className="navbar navbar-expand-lg bg-transparent">
          <div className="container-fluid">
            <img
              className=""
              src={logo}
              style={{ maxWidth: "4.5rem", height: "auto" }}
              alt="Logo"
            />
            <button
              className="navbar-toggler"
              type="button"
              data-bs-toggle="collapse"
              data-bs-target="#navbarNav"
              aria-controls="navbarNav"
              aria-expanded="false"
              aria-label="Toggle navigation"
            >
              <span className="navbar-toggler-icon"></span>
            </button>
            <div
              className="collapse navbar-collapse justify-content-end"
              id="navbarNav"
            >
              <ul className="navbar-nav">
                <li className="nav-item">
                  <Nav.Link
                    as={Link}
                    to="/"
                    className="text-white nav-link active"
                    aria-current="page"
                  >
                    Home
                  </Nav.Link>
                </li>
                <li className="nav-item">
                  <Nav.Link
                    as={Link}
                    to="/about"
                    className="text-white nav-link"
                  >
                    About Us
                  </Nav.Link>
                </li>
                <li className="nav-item">
                  <Nav.Link
                    as={Link}
                    to="/products"
                    className="text-white nav-link"
                  >
                    Products In Progress
                  </Nav.Link>
                </li>
              </ul>
            </div>
            <Link to="/myAccount">
              <button className="btn" type="button">
                <img
                  className=""
                  src={user}
                  style={{ maxWidth: "16px", height: "auto" }}
                  alt="Logo"
                />
              </button>
            </Link>
          </div>
        </nav>
      </div>
    </div>
  </div>
);

// ROLE BASED NAVBAR
const MainNavBar = () => {
  type UserRole = "user" | "manager" | "salesPer" | "supplier";
  const isLoggedIn = false; // Authentication state
  const userRole: UserRole = "user"; // User role logic

  if (!isLoggedIn) {
    return <DefaultNavBar />;
  }

  switch (userRole) {
    case "manager":
      return <ManagerNavBar />;
    case "customer":
      return <CustomerNavBar />;
    case "salesPer":
      return <SalesPerNavBar />;
    case "supplier":
      return <SupplierNavBar />;
    default:
      return <ManagerNavBar />;
  }
};

export default MainNavBar;
