<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fashi | Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Activate Bootstrap Modals via Data Attributes</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

    <%@ include file="commons-styles.jsp" %>

</head>

<body>
    <!-- Page Preloder -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <div id="preloder">
        <div class="loader"></div>
    </div>

    <%@ include file="admin-header.jsp" %>

    <!-- Product Shop Section Begin -->
    <section class="product-shop spad">
        <div class="container"> 
        <div class="col-lg-9 order-1 order-lg-2">
            <div class="row">

                <div class="col-lg-6 col-md-6 col-sm-8 order-2 order-lg-1 produts-sidebar-filter">
                    
                    </div>
                     <div class="col-lg-12 order-1 order-lg-2">
                    <div class="product-list">
                        <div class="row">

                            <c:forEach items="${products}" var="product">
                                    <div class="col-lg-4 col-sm-6">
                                        <div class="product-item">
                                            <div class="pi-pic">
                                                <img src="img/products/product-3.jpg" alt="">
                                            
                                                 <ul>
                                                 
                                                  <li class="w-icon active"><a href="#myModal" data-bs-toggle="modal"><i class="fa fa-remove"></i></a></li>
                                                    <%-- <li class="w-icon active"><a href="removeproduct?id=${product.id}"><i class="fa fa-remove"></i></a></li> --%>
                                                     <div id="myModal" class="modal fade" tabindex="-1">
                                                    <div class="modal-dialog">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <h5 class="modal-title">Confirmation</h5>
                                                                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                                                            </div>
                                                            <div class="modal-body">
                                                                <p>Do you want to delete this product permanently?</p>
                                                                <%-- <p class="text-secondary"><small>If you don't save, your changes will be lost.</small></p> --%>
                                                            </div>
                                                            <div class="modal-footer">
                                                        
                                                                <button type="button" style="background:#2B394A;color:white;" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                                                                <a href="removeproduct?id=${product.id}"> <button type="button" style="background:#d79681;color:white;" class="btn btn-primary">Delete</button></a>
                                                            
                                                            </div>
                                                        </div>
                                                    </div>
                                                    </div>
                                                    
                                                    <li class="quick-view"> <a href="editproduct?id=${product.id}"> <i class="fa fa-pencil-square-o"></i>EDIT PRODUCT</a></li>
                                                </ul>
                                            </div>
                                            <div class="pi-text">
                                                <div class="catagory-name">${product.categoryName}</div>
                                                <a href="#">
                                                    <h5>${product.name}</h5>
                                                </a>
                                                <div class="product-price">${product.price}</div>
                                            </div>
                                        </div>
                                    </div>

                            </c:forEach>

                            <%-- <c:if test = "${updated eq 1}">
                               <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
                                    Launch demo modal
                                    </button>

                                    <!-- Modal -->
                                    <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" >
                                    <div class="modal-dialog modal-dialog-centered" role="document">
                                        <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalCenterTitle">Modal title</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                            ...
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                            <button type="button" class="btn btn-primary">Save changes</button>
                                        </div>
                                        </div>
                                    </div>
                                    </div>
                                </c:if> --%>

                    <div class="loading-more">

                        <c:if test="${currentPage != 1}">
                            <a href="adminproducts?page=${currentPage-1}" class="previous" style="text-decoration:none;display: inline-block;padding: 8px 16px;background-color: #2B394A;color: black;" disabled>&laquo; Previous</a>
                        </c:if> 
                        <c:if test="${currentPage lt noOfPages}">
                            <a href="adminproducts?page=${currentPage+1}" class="next" style="text-decoration:none;display: inline-block;padding: 8px 16px; background-color:#d79681; color: white;" disabled>Next &raquo;</a>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
  
          </div>
    </section>

            <!-- Product Shop Section End -->

            <%@ include file="footer.jsp" %>
                <%@ include file="commons-js.jsp" %>
                    <script src="js/shop-categories.js" type="text/javascript"></script>
                    <script src="js/wishlist.js" type="text/javascript"></script>

</body>

</html>