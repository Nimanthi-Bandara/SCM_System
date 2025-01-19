import "bootstrap/dist/css/bootstrap.min.css";
import "../../App.css";
import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import { Form, Button } from "react-bootstrap";

const CusOrderTracking = () => {
  const [orderId, setOrderId] = useState(" ");
  const navigate = useNavigate();

  const trackOrderHandling = (e: React.FormEvent) => {
    e.preventDefault();
    if (orderId.trim()) {
      navigate(`/track-package/${orderId}`);
    }
  };
  return (
    <>
      <div className="container-fluid cus-home-body d-flex">
        <div className="container d-flex align-items-center">
          <div className="row">
            <div className="col-7">
              <h2>Seamless Solutions for Your Business.</h2>
              <br />
              <p>
                Empowering your business with seamless solutions—track, manage,
                and grow effortlessly with our reliable supply chain management
                system.
              </p>
            </div>
            <div className="col-5">
              <div className="track-order">
                <div className="card" style={{ width: "25rem" }}>
                  <div className="card-body">
                    <h5 className="card-title fs-5">Track Your Order</h5>
                    <p className="card-text fs-6">
                      Enter your order ID to track your package and view
                      detailed shipping information.
                    </p>
                    <Form onSubmit={trackOrderHandling}>
                      <Form.Group className="mb-3">
                        <Form.Control
                          type="text"
                          placeholder="Enter Order ID"
                          value={orderId}
                          onChange={(e) => setOrderId(e.target.value)}
                          required
                          className="form-control mb-3"
                        />
                      </Form.Group>
                      <Link to="/track-package/:orderId">
                      <Button
                        variant="primary"
                        type="submit"
                        className="track-button"
                      >
                        TRACK
                      </Button>
                      </Link>
                    </Form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default CusOrderTracking;

