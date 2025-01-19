import 'bootstrap/dist/css/bootstrap.min.css';
import '../../App.css'
const MainLogin = () => {
    return (

            <div className="container-fluid bg-dark py-4 pt-5">
                <div className="container">
                    <div className="row full-screen justify-content-center align-items-center">
                        <div className="col-6 right py-4">
                            <div className="form">
                                <div className="text-center">
                                    <h6><span>Log In</span> <span>Sign Up</span></h6>
                                    <input type="checkbox" className="checkbox" id="reg-log"/>
                                        <label htmlFor="reg-log"></label>
                                    <div className="card-3d-wrap">
                                        <div className="card-3d-wrapper">
                                            <div className="card-front">
                                                <div className="center-wrap">
                                                    <h4 className="heading">Log In</h4>
                                                    <div className="form-group">
                                                        <input type="email" className="form-style" placeholder="Your User ID"/>
                                                    </div>
                                                    <div className="form-group">
                                                        <input type="password" className="form-style" placeholder="Your Password"/>
                                                    </div>
                                                    <a href="#" className="submit-btn">LOGIN</a>
                                                </div>
                                            </div>
                                            <div className="card-back">
                                                <div className="center-wrap">
                                                    <h4 className="heading">Register</h4>
                                                    <div className="form-group">
                                                        <input type="text" className="form-style" placeholder="First Name"/>
                                                    </div>
                                                    <div className="form-group">
                                                        <input type="text" className="form-style" placeholder="Last Name"/>
                                                    </div>
                                                    <div className="form-group">
                                                        <input type="text" className="form-style" placeholder="Email"/>
                                                    </div>
                                                    <div className="form-group">
                                                        <input type="email" className="form-style" placeholder="Password"/>
                                                    </div>
                                                    <a href="#" className="submit-btn">Register</a>
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
export default MainLogin;