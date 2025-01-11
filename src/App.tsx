import { Container } from "react-bootstrap";
import { Routes, Route } from "react-router-dom";
import MainHome from "./pages/MainPage/MainHome";
import MainNavBar from "./components/MainNavBar";
import MainAbout from "./pages/MainPage/MainAbout";
import MainProducts from "./pages/MainPage/MainProducts";

function App() {
  return (
    <>
      <MainNavBar />
      <Container className="">
        <Routes>
          <Route path="/" element={<MainHome />} />
          <Route path="/about" element={<MainAbout />} />
          <Route path="/products" element={<MainProducts />} />
        </Routes>
      </Container>
    </>
  );
}

export default App;
