import "bootstrap/dist/css/bootstrap.min.css";
import "../../App.css";
const MainAbout = () => {
  return (
    <div>
      <div className="about-header">
        <div className="container-fluid d-flex">
          <div className="container d-flex">
            <div className="row">
              <div className="col-12">
                <p className="fs-6 about-header-text text-white">Who We Are</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div className="container-fluid">
        <div className="container">
          <div className="row py-4">
            <div className="col-4">
              <img
                src="../../../src/assets/about-us.png"
                className="w-100"
                alt=""
              />
            </div>
            <div className="col-12 py-3">
              <p className="fs-6 pt-2">
                {" "}
                Welcome to Stylo, a cutting-edge platform that bridges the gap
                between customers and reliable apparel suppliers. Our mission is
                to simplify and streamline the supply chain process by
                connecting businesses with a network of trusted suppliers,
                enabling seamless collaboration and efficient product ordering.
              </p>
              <p className="fs-6 pt-2">
                We understand the complexities of sourcing high-quality apparel.
                That’s why we’ve created a system where customers can
                effortlessly find, evaluate, and partner with registered
                suppliers who meet their unique needs. From browsing supplier
                profiles to placing orders directly through our platform, we
                ensure a smooth and transparent experience every step of the
                way.
              </p>
              <p className="fs-6 pt-2">
                At Stylo, we prioritize reliability, efficiency, and user
                satisfaction. By fostering direct connections between customers
                and suppliers, we help businesses save time, reduce costs, and
                focus on what truly matters—delivering exceptional products to
                their end-users.
              </p>
              <p className="fs-6 pt-2 pb-5">
                Join us as we transform the apparel supply chain, making it
                smarter, faster, and more accessible for everyone.
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default MainAbout;
