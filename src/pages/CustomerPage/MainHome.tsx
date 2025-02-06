import "bootstrap/dist/css/bootstrap.min.css";
import "./MainHome.css";
// import "../../App.css";
//import { Button } from "react-bootstrap";
import agility from "../../assets/agility.jpg";
import innovation from "../../assets/innovation.jpg";
import sustain from "../../assets/sustain.jpg";

import road from "../../assets/road_f.jpg";
import sea from "../../assets/sea_f.jpg";
import air from "../../assets/air_f.png";

import { useEffect , useState } from "react";
import AOS from "aos";
import "aos/dist/aos.css";
import axios from "axios";

const MainHome = () => {
  useEffect(() => {
    AOS.init();
  }, []);

  const [EmailData, setEmailData] = useState({
    email: "",
    text: "",
  });
  const handleEmail = async (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();

    try {
      const response = await axios.post("api/email", EmailData);
      console.log("Send successfully", response.data);
    } catch (error) {
      console.error("Email error", error);
    }
  };

  const handleEmailChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    setEmailData((prevData) => ({ ...prevData, [name]: value }));
  };

  return (
    <>
      <div className="hero-section d-flex align-items-center">
        <div className="container-fluid main-home-body d-flex">
          <div className="container d-flex align-items-center">
            <div className="row">
              <div
                className="col-8"
                data-aos="fade-up"
                data-aos-duration="2000"
              >
                <p className="text-white fs-6 slider-header text-start">
                  Welcome to Stylo
                </p>
                <h1 className="text-start text-yellow pb-4 slider-caption">
                  From threads to trends,
                  <br /> We weave the future of supply chains.
                </h1>
                <p className="slider-text">
                  Fueled by innovation and passion, we craft solutions that
                  inspire and empower. With decades of expertise, our journey is
                  defined by enduring partnerships and a commitment to
                  excellence.
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div className="container-fluid d-flex">
        <div className="container d-flex align-items-center">
          <div className="row" data-aos="fade-up" data-aos-duration="2000">
            <div className="col-12">
              <p className="main-header fs-6 mt-5 mb-2">What we provide</p>
              <h2 className="header-topic pb-5">
                Core Principles of Our Driven Excellence.
              </h2>
            </div>
            <div className="row ">
              <div className="col-4">
                <div className="Card">
                  <div className="imgCard pb-4">
                    <img src={agility} className="w-100 rounded" alt="" />
                  </div>
                  <div className="imgContent">
                    <h3 className="fs-4">Agility</h3>
                  </div>
                </div>
                <p>30+ product launches with key customers.</p>
              </div>

              <div className="col-4">
                <div className="Card">
                  <div className="imgCard pb-4">
                    <img src={innovation} className="w-100 rounded" alt="" />
                  </div>
                  <div className="imgContent">
                    <h3 className="fs-4">Innovation</h3>
                  </div>
                </div>
                <p>30+ product launches with key customers.</p>
              </div>
              <div className="col-4">
                <div className="Card">
                  <div className="imgCard pb-4">
                    <img src={sustain} className="w-100 rounded" alt="" />
                  </div>
                  <div className="imgContent">
                    <h3 className="fs-4">Sustainability</h3>
                  </div>
                </div>
                <p>
                  We embrace sustainable practices that minimize environmental
                  impact, prioritize resource efficiency, and promote long-term
                  well-being for our planet.
                </p>
              </div>

              <hr className="pb-0" />
            </div>
          </div>
        </div>
      </div>
      {/* <div className="container-fluid pt-5">
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
      </div> */}
      <div className="container-fluid py-5">
        <div className="container">
          <div className="row" data-aos="fade-up" data-aos-duration="2000">
            <div className="col-12 text-white">
              <p className="main-header fs-6 mt-2 mb-2">Transportation</p>
            </div>
            <div className="col-4 mt-3">
              <div className="Card">
                <div className="imgCard pb-4">
                  <img src={road} className="w-100 rounded" alt="" />
                </div>
                <div className="imgContent">
                  <h3 className="fs-4">Road Freight</h3>
                </div>
              </div>
              <p className="text-grey py-2">
                Road freight is ideal for short to medium distances and is
                highly versatile. It ensures door-to-door delivery, making it
                perfect for last-mile logistics and regional transportation.
                With flexibility in routes and schedules, road freight is a
                cost-effective solution for smaller shipments or goods requiring
                frequent deliveries.
              </p>
            </div>
            <div className="col-4 mt-3">
              <div className="Card">
                <div className="imgCard pb-4">
                  <img src={sea} className="w-100 rounded" alt="" />
                </div>
                <div className="imgContent">
                  <h3 className="fs-4">Sea Freight</h3>
                </div>
              </div>
              <p className="text-grey py-2">
                Sea freight is the backbone of global trade, offering
                cost-effective transportation for large, bulky goods over long
                distances. With high container capacity and options like Full
                Container Load (FCL) or Less than Container Load (LCL), it’s the
                best choice for bulk shipments and intercontinental trade,
                though transit times are longer compared to other methods.
              </p>
            </div>
            <div className="col-4 mt-3">
              <div className="Card">
                <div className="imgCard pb-4">
                  <img src={air} className="w-100 rounded" alt="" />
                </div>
                <div className="imgContent">
                  <h3 className="fs-4">Air Freight</h3>
                </div>
              </div>
              <p className="text-grey py-2">
                Air freight is the fastest mode of transportation, suitable for
                time-sensitive and high-value goods. It ensures speedy delivery
                over long distances, making it ideal for industries that require
                urgent shipments. Although more expensive, air freight
                guarantees reliability and security for critical shipments.
              </p>
            </div>
            <hr className="pb-3" />
          </div>
        </div>
      </div>
      <div className="container-fluid pb-5">
        <div className="container supplier-connection ">
          <div className="row pt-5 pb-5 ps-5 ">
            <div data-aos="fade-up" data-aos-duration="2000">
              <div className="col-9 ">
                <p className="main-header text-white mb-4">Reach Out</p>
                <h2 className="text-white pb-2">Connect as a Supplier.</h2>
                <p className="text-white pb-4">
                  Join us to make a positive impact on each other and the world.
                </p>
                <form onSubmit={handleEmail} className="contact-form">
                  <div className="mb-3">
                    <input
                      type="email"
                      className="form-control"
                      placeholder="Your email address"
                      required
                      value={EmailData.email}
                      onChange={handleEmailChange}
                    />
                  </div>
                  <div className="mb-3">
                    <input
                      className="form-control"
                      placeholder="Your message"
                      required
                      value={EmailData.text}
                      onChange={handleEmailChange}
                    ></input>
                  </div>
                  <button type="submit" className="btn btn-primary fs-6">
                    Send email
                  </button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default MainHome;
