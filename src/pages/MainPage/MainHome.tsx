import 'bootstrap/dist/css/bootstrap.min.css';
import '../../App.css'

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
        <div className="container-fluid main-home-body d-flex">
          <div className="container d-flex align-items-center">
              <div className="row">
                  <div className="col-12">
                      <p className="text-white fs-5 text-start">
                          Welcome to Stylo
                      </p>
                      <h1 className="text-start text-yellow slider-caption">
                          From threads to trends,<br/> We weave the future of supply chains.
                      </h1>
                  </div>
              </div>
          </div>
        </div>
        <div className="container-fluid pt-5">
            <div className="container">
                <div className="row">
                    <div className="col-5">
                        <img src="../../../src/assets/2150762229.jpg" className="w-100" alt=""/>
                    </div>
                    <div className="col-7">
                        <p className="text-white">
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                            labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit
                            in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat
                            cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                            labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit
                            in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat
                            cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                            labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit
                            in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat
                            cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <div className="container-fluid py-5">
          <div className="container">
              <div className="row">
                  <div className="col-4">
                      <img src="../../../src/assets/2150762229.jpg" className="w-100" alt=""/>
                  </div>
                  <div className="col-4">
                      <img src="../../../src/assets/2150762229.jpg" className="w-100" alt=""/>
                  </div>
                  <div className="col-4">
                      <img src="../../../src/assets/2150762229.jpg" className="w-100" alt=""/>
                  </div>
              </div>
          </div>
        </div>
  </>
  )
}

export default MainHome


