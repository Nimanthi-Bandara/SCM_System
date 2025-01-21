import "bootstrap/dist/css/bootstrap.min.css";
import "../../App.css";
import React, { useState, useEffect } from "react";
import { Table, Container, Spinner, Alert } from "react-bootstrap";
import axios from "axios";

interface Order {
  orderId: string;
  orderName: string;
  quantity: number;
  unitPrice: number;
  totalPrice: number;
  deadline: string;
}

const SupOrderPage: React.FC = () => {
  const [orders, setOrders] = useState<Order[]>([]);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string | null>(null);

  // Function to fetch orders from backend
  const fetchOrders = async () => {
    try {
      setLoading(true);
      const response = await axios.get<Order[]>("/api/orders");  //backend url?
      setOrders(response.data);
      setError(null);
    } catch (err) {
      setError("Failed to fetch orders. Please try again later.");
      console.error("Error fetching orders:", err);
    } finally {
      setLoading(false);
    }
  };


  useEffect(() => {
    // connection to the backend
    const ws = new WebSocket("ws://backend-url/orders"); //backend url

    ws.onmessage = (event) => {
      const newOrder = JSON.parse(event.data);
      setOrders((prevOrders) => {
        // Check if order already exists
        const orderExists = prevOrders.some(
          (order) => order.orderId === newOrder.orderId
        );
        if (orderExists) {
          // Update existing order
          return prevOrders.map((order) =>
            order.orderId === newOrder.orderId ? newOrder : order
          );
        } else {
          // Add new order
          return [...prevOrders, newOrder];
        }
      });
    };

    // Clean up connection
    return () => {
      ws.close();
    };
  }, []);

  // Fetch initial orders when component mounts
  useEffect(() => {
    fetchOrders();
  }, []);

  // Format currency
  const formatCurrency = (amount: number): string => {
    return new Intl.NumberFormat("en-LK", {
      style: "currency",
      currency: "LKR",
    }).format(amount);
  };

  // Format date
  const formatDate = (dateString: string): string => {
    return new Date(dateString).toLocaleDateString("en-LK", {
      year: "numeric",
      month: "short",
      day: "numeric",
      hour: "2-digit",
      minute: "2-digit",
    });
  };

  if (loading) {
    return (
      <Container
        className="d-flex justify-content-center align-items-center"
        style={{ minHeight: "200px" }}
      >
        <Spinner animation="border" role="status">
          <span className="visually-hidden">Loading...</span>
        </Spinner>
      </Container>
    );
  }

  if (error) {
    return (
      <Container>
        <Alert variant="danger">{error}</Alert>
      </Container>
    );
  }

  return (
    <Container fluid className="mt-4">
      <Table striped bordered hover responsive>
        <thead>
          <tr>
            <th>Order ID</th>
            <th>Order Name</th>
            <th>Quantity</th>
            <th>Unit Price</th>
            <th>Total Price</th>
            <th>Deadline</th>
          </tr>
        </thead>
        <tbody>
          {orders.map((order) => (
            <tr key={order.orderId}>
              <td>{order.orderId}</td>
              <td>{order.orderName}</td>
              <td>{order.quantity}</td>
              <td>{formatCurrency(order.unitPrice)}</td>
              <td>{formatCurrency(order.totalPrice)}</td>
              <td>{formatDate(order.deadline)}</td>
            </tr>
          ))}
        </tbody>
      </Table>
    </Container>
  );
};

export default SupOrderPage;
