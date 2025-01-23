import { Routes, Route, useLocation } from "react-router-dom";
import MainHome from "./pages/CustomerPage/MainHome.tsx";
import MainNavBar from "./components/MainNavBar";
import MainAbout from "./pages/CustomerPage/MainAbout.tsx";
import MainProducts from "./pages/CustomerPage/MainProducts.tsx";
import Footer from "./components/Footer";
import MainLogin from "./pages/MainPage/MainLogin.tsx";
import MyAccPage from "./pages/CustomerPage/MyAccPage.tsx";
import SupOrderPage from "./pages/SupplierPage/SupOrderPage.tsx";
// import CusOrderTracking from "./pages/CustomerPage/CusOrderTracking.tsx";

function App() {
  const location = useLocation();
  const isLoginPage = location.pathname === "/";

  return (
    <div className={location.pathname === "/home" ? "home-page-background" : ""}>
      {!isLoginPage && <MainNavBar />}
      {/*<Container>*/}
      <Routes>
        <Route path="/" element={<MainLogin />} />

        <Route path="/home" element={<MainHome />} />
        <Route path="/about" element={<MainAbout />} />
        <Route path="/products" element={<MainProducts />} />
        <Route path="/myAccount" element={<MyAccPage />} />

        <Route path="/supplier/orders" element={<SupOrderPage />} />
        {/* <Route path="/customer" element={<CusHomePage/>} />
                    <Route path="/track-package/:orderId" element={<CusOrderTracking/>} /> */}
      </Routes>
      {/*</Container>*/}
      {!isLoginPage && <Footer />}
    </div>
  );
}

export default App;
