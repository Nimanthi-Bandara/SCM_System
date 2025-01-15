//import { Container } from "react-bootstrap";
import { Routes, Route, useLocation } from "react-router-dom";
import MainHome from "./pages/MainPage/MainHome";
import MainNavBar from "./components/MainNavBar";
import MainAbout from "./pages/MainPage/MainAbout";
import MainProducts from "./pages/MainPage/MainProducts";
import MainLogin from "./pages/MainPage/MainLogIn";
import Footer from "./components/Footer";

function App() {
  const location = useLocation();
  const isHomePage = location.pathname === '/';

  return (
      <div className={isHomePage ? 'home-page-background' : ''}>
          <MainNavBar />
          {/*<Container>*/}
              <Routes>
                  <Route path="/" element={<MainHome />} />
                  <Route path="/about" element={<MainAbout />} />
                  <Route path="/products" element={<MainProducts />} />
                  <Route path="/login" element={<MainLogin />} />
              </Routes>
          {/*</Container>*/}
          <Footer/>
      </div>
  );
}
export default App;
