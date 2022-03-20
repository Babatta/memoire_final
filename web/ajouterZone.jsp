
<%-- 
    Document   : formulaire
    Created on : 11 déc. 2019, 00:02:51
    Author     : TOSHIBA
--%>
<%@include file="WEB-INF/taglib.jsp" %>
<%@include file="WEB-INF/header1.jsp"%>
<%@include file="WEB-INF/headerTable.jsp" %>
<%@include file="WEB-INF/headerForm.jsp" %>
<form  method="POST" action="Controleur" style="font-size:20px;">
                    <input type="hidden" name="action" value="enrZone"/>
<div class="form-element-area">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-element-list">
                        
                        <div class="cmp-tb-hd bcs-hd">
                            <h2>Formulaire d'ajout d'une Zone.</h2>
<!--                            <p>Place one add-on or button on either side of an input. You may also place one on both sides of an input. </p>-->
                        </div>
                                <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-map"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" name="nomZone" placeholder="Zone" required>
                                    </div>
                                </div>
                            </div>
                       
                      
                                <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
                                </div>
                                <div class="col-lg-8 col-md-7 col-sm-7 col-xs-12">
                                    <button class="btn btn-success notika-btn-success">Enregistrer</button>
                                </div>
                            </div>
                        </div>
                         </div>
                    </div>
                </div>
            </div>
</form>
<%--<%@include file="WEB-INF/footerForm.jsp" %>--%>