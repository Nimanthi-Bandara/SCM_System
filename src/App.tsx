import { Routes, Route, useLocation } from "react-router-dom";
import MainHome from "./pages/CustomerPage/MainHome.tsx";
import MainNavBar from "./components/MainNavBar";
import MainAbout from "./pages/CustomerPage/MainAbout.tsx";
import MainProducts from "./pages/CustomerPage/MainProducts.tsx";
import Footer from "./components/Footer";
import MainLogin from "./pages/MainPage/MainLogin.tsx";
import CusOrderTracking from "./pages/CustomerPage/CusOrderTracking.tsx";

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

                    {/* <Route path="/customer" element={<CusHomePage/>} />
                    <Route path="/track-package/:orderId" element={<CusOrderTracking/>} /> */}
                </Routes>
            {/*</Container>*/}
            <Footer />
        </div>
    );
}

export default App;
