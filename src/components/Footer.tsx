const Footer = () => {
  return (
  <div className="footer text-white bg-blur">
      <div className="container">
          <footer className="">
              <div className="row">
                  <div className="col-lg-4 col-md-2 mb-3">
                      <h6 className="text-white py-1 text-center px-5">FIND US ON</h6>
                      <ul className="nav flex-column my-2">
                          <li className="nav-item mb-2"><a href="#"
                                                           className="text-white text-center nav-link p-0">Facebook</a></li>
                          <li className="nav-item mb-2"><a href="#"
                                                           className="text-white text-center nav-link p-0">Instergram</a>
                          </li>
                          <li className="nav-item mb-2"><a href="#"
                                                           className="text-white text-center nav-link p-0">Twitter</a>
                          </li>
                          <li className="nav-item mb-2"><a href="#"
                                                           className="text-white text-center nav-link p-0">LinkedIn</a></li>
                          <li className="nav-item mb-2"><a href="#"
                                                           className="text-white text-center nav-link p-0">Tiktok</a></li>
                                                        
                      </ul>
                  </div>

                  <div className="col-lg-4 col-md-2 mb-3">
                      <h6 className="text-white py-1 text-center px-5">CONTACT US</h6>
                      <ul className="nav flex-column">
                          <li className="nav-item mb-2"><a href="#"
                                                           className="nav-link p-0 text-center text-white">+94 71 123 4567 <br/>+94 78 123 3456  </a></li>
                          <li className="nav-item mb-2"><a href="#"
                                                           className="nav-link p-0 text-center text-white">+94 11 564 7890</a>
                          </li>
                          <li className="nav-item mb-2"><a href="#"
                                                           className="nav-link p-0 text-center text-white">info@stylo.com</a>
                          </li>
                          
                      </ul>
                  </div>

                  <div className="col-lg-4 col-md-2 mb-3">
                      <h6 className="text-white py-1 text-center px-5">VISIT US</h6>
                      <ul className="nav flex-column">
                          <li className="nav-item mb-2"><a href="#"
                                                           className="nav-link p-0 text-center text-white">No.15, Sarasavi Rd, <br/> Kelaniya, Sri Lanka.</a></li>
                          <li className="nav-item mb-2"><a href="#"
                                                           className="nav-link p-0 text-center text-white">No.07, 11th street, <br/> Colombo 03, Sri lanka</a></li>
                      </ul>
                  </div>
              </div>

              <div className="d-flex flex-column flex-sm-row justify-content-between py-4 my-4 border-top">
                  <p>© 2024 Company, Inc. All rights reserved.</p>
              </div>
          </footer>
      </div>
  </div>
)
}

export default Footer;