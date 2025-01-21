import { Nav } from "react-bootstrap";
import { Link } from "react-router-dom";
import logo from "../assets/logo.png";
import "bootstrap/dist/css/bootstrap.min.css";

// DEFAULT NAV BAR
const SupplierNavBar = () => (
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
                    to="/supplier/orders"
                    className="text-white nav-link active"
                    aria-current="page"
                  >
                    Orders
                  </Nav.Link>
                </li>
                <li className="nav-item">
                  <Nav.Link
                    as={Link}
                    to="/supplier/accepted"
                    className="text-white nav-link"
                  >
                    Accepted Orders
                  </Nav.Link>
                </li>
                <li className="nav-item">
                  <Nav.Link
                    as={Link}
                    to="/supplier/report"
                    className="text-white nav-link"
                  >
                    Report
                  </Nav.Link>
                </li>
                <li className="nav-item">
                  <Nav.Link
                    as={Link}
                    to="/supplier/plan"
                    className="text-white nav-link"
                  >
                    Production Plan
                  </Nav.Link>
                </li>
              </ul>
            </div>
        
          </div>
        </nav>
      </div>
    </div>
  </div>
);

export default SupplierNavBar;


