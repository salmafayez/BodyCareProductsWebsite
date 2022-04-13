<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fashi | Template</title>
    <%@ include file="commons-styles.jsp" %>

</head>

<body onload="checkInputs()">
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <%@ include file="header.jsp" %>


        <!-- Map Section Begin -->
        <!-- <div class="map spad">
        <div class="container">
            <div class="map-inner">
                <iframe
                    src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d48158.305462977965!2d-74.13283844036356!3d41.02757295168286!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89c2e440473470d7%3A0xcaf503ca2ee57958!2sSaddle%20River%2C%20NJ%2007458%2C%20USA!5e0!3m2!1sen!2sbd!4v1575917275626!5m2!1sen!2sbd"
                    height="610" style="border:0" allowfullscreen="">
                </iframe>
                <div class="icon">
                    <i class="fa fa-map-marker"></i>
                </div>
            </div>
        </div>
    </div> -->
        <!-- Map Section Begin -->

        <!-- Contact Section Begin -->
        <div class="container-fluid"
            style="background-image: url(img/background_img.jpg); background-repeat: no-repeat; background-size: cover;">
            <section class="contact-section spad">

                <!-- <div class="container px-5 py-5"  style="background-color: #f5f5f5"> -->
                <div class="container px-5 py-5"
                    style="border-style:solid; border-radius: 30px; background-color: #f5f5f5; border-color: #f5f5f5;">
                    <div class="row">

                        <div class="col-lg-5">
                            <div class="contact-title">
                                <h4>Contacts us</h4>
                                <!-- <p>We always here for you :).</p> -->
                            </div>
                            <div class="contact-widget">
                                <div class="cw-item">
                                    <div class="ci-icon">
                                        <i class="ti-location-pin"></i>
                                    </div>
                                    <div class="ci-text">
                                        <span>Address:</span>
                                        <p>60-49 Road 11378 New York</p>
                                    </div>
                                </div>
                                <div class="cw-item">
                                    <div class="ci-icon">
                                        <i class="ti-mobile"></i>
                                    </div>
                                    <div class="ci-text">
                                        <span>Phone:</span>
                                        <p>+65 11.188.888</p>
                                    </div>
                                </div>
                                <div class="cw-item">
                                    <div class="ci-icon">
                                        <i class="ti-email"></i>
                                    </div>
                                    <div class="ci-text">
                                        <span>Email:</span>
                                        <p>fatakat@gmail.com</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 offset-lg-1">
                            <div class="contact-form ">
                                <div class="leave-comment">
                                    <h4>Leave a comment</h4>
                                    <p>Our staff will call back later and answer your questions.</p>
                                    <form method="post" action="contactmessage" class="comment-form" id="contactForm" >
                                        <div class="row">
                                            <div class="ci-icon">
                                                <div class="ci-text ">
                                                    <div class="col-md-12">
                                                        <div class="group-input ">
                                                        
                                                            <input type="text"
                                                                style="margin-top:5px;border-color: #f5f5f5; border-radius: 10px;"
                                                                placeholder="Your name" name="contactName"
                                                                id="contactName" >
                                                                
                                                            <i class="fa fa-check-circle" aria-hidden="true"
                                                                style="top: 20px;right: 30px;"></i><br>
                                                            <i class="fa fa-exclamation-circle" aria-hidden="true"
                                                                style="top: 20px;right: 30px;"></i>
                                                            <small
                                                                style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                                        </div>
                                                    </div>
                                                    <div class="ci-text ">
                                                        <div class="col-md-12">
                                                            <div class="group-input ">

                                                             
                                                             <input style="margin-top:5px;border-color: #f5f5f5; border-radius: 10px;" type="email" id="contactEmail" name="contactEmail" placeholder="Your email" class="defaultBorders" required>
                                                               
                                                                  
                                                                <i class="fa fa-check-circle" aria-hidden="true"
                                                                    style="top: 20px;right: 30px;"></i><br>
                                                                <i class="fa fa-exclamation-circle" aria-hidden="true"
                                                                    style="top: 20px;right: 30px;"></i>
                                                                 <small
                                                                    style="color: rgb(238, 0, 0);font-size: 12px;"></small>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="ci-text ">
                                                    <div class="col-md-12">
                                                        <div class="group-input ">
                                                         
                                                            <textarea placeholder="Your message"
                                                                style="border-color: #f5f5f5; border-radius: 10px;margin-top:5px"
                                                                name="contactMessage" id="contactMessage"></textarea>
                                                            <i class="fa fa-check-circle" aria-hidden="true"
                                                                style="top: 20px;right: 30px;"></i><br>
                                                            <i class="fa fa-exclamation-circle" aria-hidden="true"
                                                                style="top: 20px;right: 30px;"></i>
                                                           <small
                                                                style="color: rgb(238, 0, 0);font-size: 12px;"></small>

                                                              </div>
                                                                </div>   
                                                            <button type="submit" class="site-btn"
                                                                style="border-style:solid; border-radius: 10px;  border-color: #f5f5f5;">Send
                                                                message</button>
                                                       
                                                </div>
                                            </div>
                                        </div>
                                </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
        </div>

        </section>
        </div>
        <!-- Contact Section End -->

        <%@ include file="footer.jsp" %>
        <%@ include file="commons-js.jsp" %>
        <script src="js/contactValidation.js" type="text/javascript"></script>

</body>

</html>