import "bootstrap/dist/css/bootstrap.min.css";
import "../../App.css";

const MainHome = () => {
  return (
    // <div className='HomePage'>
    //   home
    //   <div className='img-container'>
    //     <img className='wallpaper' src={Wallpaper}/>
    //   </div>
    //   <div className='overlay'>
    //     <p>Welcome to Stylo</p>
    //     <h1>From threads to trends,We Weave The future of supply chains</h1>
    //   </div>
    // </div>
    <>
    
      <div className="hero-section d-flex align-items-center">
        <div className="container-fluid main-home-body d-flex">
          <div className="container d-flex align-items-center">
            <div className="row">
              <div className="col-8">
                <p className="text-white fs-6 slider-header text-start">
                  Welcome to Stylo
                </p>
                <h1 className="text-start text-yellow pb-4 slider-caption">
                  From threads to trends,
                  <br /> We weave the future of supply chains.
                </h1>
                <p className="slider-text">Fueled by innovation and passion, we craft solutions that inspire and empower. With decades of expertise, our journey is defined by enduring partnerships and a commitment to excellence.</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div className="container-fluid d-flex">
        <div className="container d-flex align-items-center">
          <div className="row">
            <div className="col-12">
              <p className="main-header fs-6 mt-5 mb-2">What we provide</p>
              <h2>Core Principles of Our Driven Excellence.</h2>
            </div>
            <div className="row">
              <div className="col-4">
                <p></p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div className="container-fluid pt-5">
        <div className="container">
          <div className="row">
            <div className="col-5">
              <img
                src="../../../src/assets/2150762229.jpg"
                className="w-100"
                alt=""
              />
            </div>
            <div className="col-7">
              <h3 className="text-white">
                Redefining Style, Empowering Supply Chains
              </h3>
              <p className="text-white fs-4 pt-3">
                At ours, we seamlessly connect fashion and technology. Our
                innovative supply chain solutions ensure that every thread,
                fabric, and design reaches its destination with precision and
                care. From sourcing raw materials to delivering the final
                masterpiece, we make the journey as stylish as the apparel
                itself.
              </p>
            </div>
          </div>
        </div>
      </div>
      <div className="container-fluid py-5">
        <div className="container">
          <div className="row">
            <div className="col-12 text-white">
              <h4 className="py-3">Transportation</h4>
            </div>
            <div className="col-4">
              <img
                src="../../../src/assets/trans-1.png"
                className="w-100"
                alt=""
              />
              <p className="text-white py-2">
                {" "}
                Road freight is ideal for short to medium distances and is
                highly versatile. It ensures door-to-door delivery, making it
                perfect for last-mile logistics and regional transportation.
                With flexibility in routes and schedules, road freight is a
                cost-effective solution for smaller shipments or goods requiring
                frequent deliveries.
              </p>
            </div>
            <div className="col-4">
              <img
                src="../../../src/assets/trans-2.png"
                className="w-100"
                alt=""
              />
              <p className="text-white py-2">
                Sea freight is the backbone of global trade, offering
                cost-effective transportation for large, bulky goods over long
                distances. With high container capacity and options like Full
                Container Load (FCL) or Less than Container Load (LCL), it’s the
                best choice for bulk shipments and intercontinental trade,
                though transit times are longer compared to other methods.
              </p>
            </div>
            <div className="col-4">
              <img
                src="../../../src/assets/trans-3.png"
                className="w-100"
                alt=""
              />
              <p className="text-white py-2">
                Air freight is the fastest mode of transportation, suitable for
                time-sensitive and high-value goods. It ensures speedy delivery
                over long distances, making it ideal for industries that require
                urgent shipments. Although more expensive, air freight
                guarantees reliability and security for critical shipments.
              </p>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default MainHome;
