import { Container, Nav, Navbar, Button } from "react-bootstrap";
import { Link } from "react-router-dom";
import logo from "../assets/logo.png";
import user from "../assets/user.png";

const AdminNavBar = () => {
    <Navbar>
    <Container className="bg-transparent m-3">
      <Nav>
        <img src={logo} style={{ maxWidth: "4.5rem", height: "auto" }} alt="" />
        <Nav.Link as={Link} to="/admin/home">Home</Nav.Link>
        <Nav.Link as={Link} to="/admin/users">Users</Nav.Link>
        <Nav.Link as={Link} to="/admin/Orders">Orders</Nav.Link>
        <Nav.Link as={Link} to="/admin/inventory">Inventory</Nav.Link>
        <Nav.Link as={Link} to="/admin/reports">Reports</Nav.Link>
        <Nav.Link as={Link} to="/admin/sales">Sales</Nav.Link>
        <Nav.Link as={Link} to="/admin/plan">Production Plan</Nav.Link>
      </Nav>
      <Button style={{ width: "3rem", height: "3rem" }} variant="outline-primary" className="rounded-circle">
        <img src={user} alt="Profile" width="24" height="24" />
      </Button>
    </Container>
  </Navbar>
}

export default AdminNavBar

