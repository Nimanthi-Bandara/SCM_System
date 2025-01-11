import { Container, Nav, Navbar, Button } from "react-bootstrap";
import { Link } from "react-router-dom";
import logo from "../assets/logo.png";

const CustomerNavBar = () => {
  return (
    <div>
      <Navbar>
        <Container className="bg-transparent mb-3">
          <Nav>
            <img
              className=""
              src={logo}
              style={{ maxWidth: "4.5rem", height: "auto" }}
            />
            <Nav.Link as={Link} to="/CustomerHome">
              Home
            </Nav.Link>
            <Nav.Link as={Link} to="/orderHistory">
              Order History
            </Nav.Link>
            <Nav.Link as={Link} to="/cusProducts">
              Products
            </Nav.Link>
          </Nav>
          <Button
            style={{ width: "3rem", height: "3rem" }}
            variant="outline-primary"
            className="rounded-circle"
          >
            <svg
              xmlns="http://www.w3.org/2000/svg"
              viewBox="0 0 24 24"
              fill="currentColor"
            >
              <path d="M12 12c2.761 0 5-2.239 5-5s-2.239-5-5-5-5 2.239-5 5 2.239 5 5 5zm0 2c-3.866 0-7 3.134-7 7 0 .552.448 1 1 1h12c.552 0 1-.448 1-1 0-3.866-3.134-7-7-7z" />
            </svg>
          </Button>
        </Container>
      </Navbar>
    </div>
  );
};

export default CustomerNavBar;
