import 'bootstrap/dist/css/bootstrap.min.css';
import '../../App.css';
import '../../assets/product-banner.png';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import casualTop from '../../assets/casual-top.png';
import cropTop from '../../assets/croptop-3.png';
import sportBra from '../../assets/sport-bra.png';
import hoodie from '../../assets/hoodie.png';



const MainProducts = () => {
    return (
        <div className="">
            <div id="carouselExample" className="carousel slide">
                <div className="carousel-inner">
                    <div className="carousel-item active">
                        <img src="../../../src/assets/product-banner.png" className="d-block w-100" alt="..."/>
                    </div>
                </div>
            </div>
            <div className="container-fluid py-5 product-desc-main">
                <div className="container">
                    <div className="row">
                        <div className="col-12">
                            <h4 className="fw-2 py-2">Elevate Your Style with Premium Garment Apparel</h4>
                            <p className="text-justified">Discover elegance and comfort with our exclusive collection of garment apparel.
                                Designed to suit every occasion, our range blends timeless style with premium quality materials.
                                From casual wear to formal attire, each piece is crafted to provide a perfect fit and unmatched durability.
                                Elevate your wardrobe with versatile and sustainable choices that redefine fashion. Experience the
                                perfect harmony of style and substance today</p>
                        </div>
                    </div>

                    {/* TOPS SECTION */}
                    <div className="row">
                        <div className="col-12">
                            <h2 className="text-green text-center fw-1">Tops</h2>
                            <p className="text-justified">Tops featured here are designed for every occasion, offering a blend of
                                style and comfort. Our collection includes casual tees, chic blouses, and trendy crop tops, crafted
                                with high-quality fabrics to ensure durability and elegance. Each piece is available in a range of
                                sizes, colors, and patterns, catering to diverse fashion preferences. Whether you're dressing up for
                                work or lounging at home, our tops promise to elevate your wardrobe effortlessly.</p>
                        </div>
                        <div className="col-12 pb-3">
                            <div className="accordion" id="accordionExample">
                                <div className="accordion-item">
                                    <h2 className="accordion-header">
                                        <button className="accordion-button btn-ligth" type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseTopAccordian" aria-expanded="true"
                                                aria-controls="collapseOne">
                                            <span className="fs-4">Explore Our Range of Premium Tops</span>
                                        </button>
                                    </h2>
                                    <div id="collapseTopAccordian" className="accordion-collapse collapse"
                                         data-bs-parent="#accordionExample">
                                        {/*show*/}
                                        <div className="accordion-body">
                                            <div className="row">
                                                <div className="col-lg-3 col-md-4 col-sm-6 pb-4">
                                                    <div className="card">
                                                        <div className="imgBox">
                                                            {/*<img src="../../assets/product-banner.png" className="mouse" alt=""/>*/}
                                                            <img src={cropTop} className="mouse" alt=""/>
                                                        </div>
                                                        <div className="contentBox">
                                                            <h3 className="fs-4">Crop Tops</h3>
                                                            <a href="#" className="buy">Browse More</a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div className="col-lg-3 col-md-4 col-sm-6 pb-4">
                                                    <div className="card">
                                                        <div className="imgBox">
                                                            {/*<img src="../../assets/product-banner.png" className="mouse" alt=""/>*/}
                                                            <img src={sportBra} className="mouse" alt=""/>
                                                        </div>
                                                        <div className="contentBox">
                                                            <h3 className="fs-4">Sport Bras</h3>
                                                            <a href="#" className="buy">Browse More</a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div className="col-lg-3 col-md-4 col-sm-6 pb-4">
                                                    <div className="card">
                                                        <div className="imgBox">
                                                            {/*<img src="../../assets/product-banner.png" className="mouse" alt=""/>*/}
                                                            <img src={casualTop} className="mouse" alt=""/>
                                                        </div>
                                                        <div className="contentBox">
                                                            <h3 className="fs-4">Casual Tops</h3>
                                                            <a href="#" className="buy">Browse More</a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div className="col-lg-3 col-md-4 col-sm-6 pb-4">
                                                    <div className="card">
                                                        <div className="imgBox">
                                                            {/*<img src="../../assets/product-banner.png" className="mouse" alt=""/>*/}
                                                            <img src={hoodie} className="mouse" alt=""/>
                                                        </div>
                                                        <div className="contentBox">
                                                            <h3 className="fs-4">Hoodies</h3>
                                                            <a href="#" className="buy">Browse More</a>
                                                        </div>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                {/*  BOTTOMS SECTION  */}

                    <div className="row">
                        <div className="col-12">
                            <h2 className="text-green text-center fw-1">Bottoms</h2>
                            <p className="text-justified">Our collection of bottoms is tailored to provide the perfect balance of
                                style and versatility for every wardrobe. From sleek trousers and cozy leggings to trendy skirts
                                and classic jeans, each piece is crafted with premium fabrics for all-day comfort and durability.
                                Available in a variety of sizes, fits, and designs, our bottoms suit any occasion, be it casual
                                outings or formal events. Discover the perfect pair to match your unique style!</p>
                        </div>
                        <div className="col-12">
                            <div className="accordion" id="accordionExample">
                                <div className="accordion-item">
                                    <h2 className="accordion-header">
                                        <button className="accordion-button btn-ligth" type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseOne" aria-expanded="true"
                                                aria-controls="collapseOne">
                                            <span className="fs-4">Explore Our Range of Premium Bottoms</span>
                                        </button>
                                    </h2>
                                    <div id="collapseOne" className="accordion-collapse collapse"
                                         data-bs-parent="#accordionExample">
                                        {/*show*/}
                                        <div className="accordion-body">
                                            <div className="row">
                                                <div className="col-lg-3 col-md-4 col-sm-6 pb-4">
                                                    <div className="card">
                                                        <div className="imgBox">
                                                            {/*<img src="../../assets/product-banner.png" className="mouse" alt=""/>*/}
                                                            <img src={cropTop} className="mouse" alt=""/>
                                                        </div>
                                                        <div className="contentBox">
                                                            <h3 className="fs-4">Crop Tops</h3>
                                                            <a href="#" className="buy">Browse More</a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div className="col-lg-3 col-md-4 col-sm-6 pb-4">
                                                    <div className="card">
                                                        <div className="imgBox">
                                                            {/*<img src="../../assets/product-banner.png" className="mouse" alt=""/>*/}
                                                            <img src={sportBra} className="mouse" alt=""/>
                                                        </div>
                                                        <div className="contentBox">
                                                            <h3 className="fs-4">Sport Bras</h3>
                                                            <a href="#" className="buy">Browse More</a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div className="col-lg-3 col-md-4 col-sm-6 pb-4">
                                                    <div className="card">
                                                        <div className="imgBox">
                                                            {/*<img src="../../assets/product-banner.png" className="mouse" alt=""/>*/}
                                                            <img src={casualTop} className="mouse" alt=""/>
                                                        </div>
                                                        <div className="contentBox">
                                                            <h3 className="fs-4">Casual Tops</h3>
                                                            <a href="#" className="buy">Browse More</a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div className="col-lg-3 col-md-4 col-sm-6 pb-4">
                                                    <div className="card">
                                                        <div className="imgBox">
                                                            {/*<img src="../../assets/product-banner.png" className="mouse" alt=""/>*/}
                                                            <img src={hoodie} className="mouse" alt=""/>
                                                        </div>
                                                        <div className="contentBox">
                                                            <h3 className="fs-4">Hoodies</h3>
                                                            <a href="#" className="buy">Browse More</a>
                                                        </div>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    )
}

export default MainProducts

