<%@include file="WEB-INF/header1.jsp" %>
        
        
      <div class="container-login100" style="background-image: url('images/lampe.png'); background-attachment: fixed; ">
<!--            <div class="wrap-login100 p-l-100 p-r-100 p-t-200 p-b-30" style="background-image: url('images/bg.png'); background-color: #faf9f8; width: 1800px;"> -->
                <div class="top-bar">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-6 col-sm-6">
                                <div class="left-top">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
       
<div class="container"> 

    
<!--    <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="contact_form">
                      <div id="message">
                        <h2 class="title">Authentification</h2>
                    <c:if test="${!empty test}">
                        <p style="color: red">
                        <c:out value="${test}"/>
                        </p>
                    </c:if>
                    <form method="POST" action="Controleur">
                        <input type="hidden" name="action" value="connecte">                   
                      
                        
                            <fieldset class="row-fluid">
                                
                               
                                 <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                  <input  class="form-control" type="text"   placeholder="Login" name="login" required>
                                    
                                </div>
                                  <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <input  class="form-control"  type="password" placeholder="Password" name="passe" required>
                                    
                                </div>
                                  <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                     <select class="form-control" name="profil">
                                            <option value="administrateur">Administrateur</option>
                                            <option value="abonne">abonne</option>
                                            
                            </select>
                                    
                                </div>  
                                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4 text-center">
                                    <button <input type="submit"   class="btn btn-light btn-radius btn-brd grd1 btn-block"/>Connecter</button>
                                </div>
                            </fieldset>
                        </form>
                        </div>
                    </div>
 </div> </div>
</div>-->
    <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Page Authentification</h2>
                    <form method="POST" action="Controleur" methode="POST">
                        <input type="hidden" name="action" value="connecte"/>
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Login" name="login">
                        </div>
                        <!-- <div class="input-group">
                            <input class="input--style-3 js-datepicker" type="text" placeholder="Birthdate" name="birthday">
                            <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                        </div> -->
                        <!-- <div class="input-group">
                            <div class="rs-select2 js-select-simple select--no-search">
                                <select name="gender">
                                    <option disabled="disabled" selected="selected">Gender</option>
                                    <option>Male</option>
                                    <option>Female</option>
                                    <option>Other</option>
                                </select>
                                <div class="select-dropdown"></div>
                            </div>
                        </div> -->
                        <div class="input-group">
                            <input class="input--style-3" type="password" placeholder="Password" name="passe">
                        </div>
                        
                        <div class="p-t-10">
                            <button class="btn btn--pill btn--green" type="submit">Se Connecter</button>
                        </div>
                        <!-- <div class="p-t-10">
                            <button class="btn btn--pill btn--green" type="reset">Supprimer</button>
                        </div> -->
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
            
	
	
	<!-- Jquery JS-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>

    
                 

   <a href="#" id="scroll-to-top" class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>

    <!-- ALL JS FILES -->
    <script src="js/all.js"></script>
    <!-- ALL PLUGINS -->
    <script src="js/custom.js"></script>
    <script src="js/portfolio.js"></script>
    <script src="js/hoverdir.js"></script>    
<footer class="footer">
    <div class="container"></div>

</footer>  


</body>
</html>


                         