import "./SupOrderPage.css";

const SupOrderPage = () => {
  const orders = [
    { id: "ORD001", name: "Product A", quantity: 100, price: 25.99 },
    { id: "ORD002", name: "Product B", quantity: 50, price: 34.50 },
    { id: "ORD003", name: "Product C", quantity: 75, price: 19.99 },
    { id: "ORD004", name: "Product D", quantity: 200, price: 15.75 },
  ];

  return (
    <div>
      <div className="supplier-header">
        <div className="container-fluid d-flex">
          <div className="container d-flex">
            <div className="row">
              <div className="col-12">
                <p className="fs-6 text-white fst-italic">
                  Efficient orders, seamless supply – keeping your business
                  moving forward.
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div className="container-fluid d-flex">
        <div className="container d-flex">
          <div className="row">
            <div className="col-12">
              <table className="table table-hover">
                <thead>
                  <tr>
                    <th scope="col">Order ID</th>
                    <th scope="col">Order Name</th>
                    <th scope="col">Quantity</th>
                    <th scope="col">Unit Price</th>
                    <th scope="col">Total Price</th>
                    <th scope="col">Deadline</th>
                  </tr>
                </thead>
                <tbody>
                  {orders.map((order) => (
                    <tr key={order.id}>
                      <td>{order.id}</td>
                      <td>{order.name}</td>
                      <td>{order.quantity}</td>
                      <td>${order.price.toFixed(2)}</td>
                      <td>${(order.quantity * order.price).toFixed(2)}</td>
                    </tr>
                  ))}
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default SupOrderPage;
