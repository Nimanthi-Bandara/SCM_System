import { Container, Nav, Navbar, Button } from "react-bootstrap";
import { Link } from "react-router-dom";
import logo from "../assets/logo.png";
import user from "../assets/user.png";

const SalesPerNavBar = () => {
  <Navbar>
      <Container className="bg-transparent m-3">
        <Nav>
          <img src={logo} style={{ maxWidth: "4.5rem", height: "auto" }} alt="" />
          <Nav.Link as={Link} to="/sales/home">Home</Nav.Link>
          <Nav.Link as={Link} to="/sales/reports">Reports</Nav.Link>
          
        </Nav>
        <Button style={{ width: "3rem", height: "3rem" }} variant="outline-primary" className="rounded-circle">
          <img src={user} alt="Profile" width="24" height="24" />
        </Button>
      </Container>
    </Navbar>
}

export default SalesPerNavBar;

