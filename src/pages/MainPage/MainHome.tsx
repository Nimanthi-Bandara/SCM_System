import Wallpaper from "../../assets/wallpaper.jpg";

const MainHome = () => {
  return (
    <div className="Container fluid p-0">
      <div className="position-fixed top-0 start-0 w-100 h-100" style={{ zIndex: -1 }}>
        <img
          className="img-fluid w-100 h-100 object-fit-cover"
          src={Wallpaper}
        />
      </div>
      <div className="position-absolute top-50 start-0 translate-middle-y ms-4 ms-md-5 text-white">
       <p className="">Welcome to Stylo</p> 
      <h1 className="display-5 fw-bold">From threads to trends, We weave the future of supply chains.</h1>
      </div>
    </div>
  );
};

export default MainHome;
