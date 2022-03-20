




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
                    <input type="hidden" name="action" value="ajouterUser"/>
<div class="form-element-area">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-element-list">
                        <div class="basic-tb-hd">
                            
                            
                        </div>
                        <div class="cmp-tb-hd bcs-hd">
                            <h2>Formulaire d'ajout d'un Utilisateur</h2>
<!--                            <p>Place one add-on or button on either side of an input. You may also place one on both sides of an input. </p>-->
                        </div>
                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-support"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" name="prenom" placeholder="Prenom" required>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-support"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control"name="nom" placeholder="Nom" required>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-mail"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" name="adresse" placeholder="Adresse Email" required>
                                    </div>
                                </div>
                            </div>
                        </div>

               <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-example-wrap mg-t-30">
                       
                        <div class="row">
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                <div class="form-example-int form-example-st">
                                    <div class="form-group">
                                        <div class="nk-int-st">
                                            <input type="text" name="login" class="form-control input-sm" placeholder="Login">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                <div class="form-example-int form-example-st">
                                    <div class="form-group">
                                        <div class="nk-int-st">
                                            <input type="text" name="passe" class="form-control input-sm" placeholder="Mot de Passe">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int form-elet-mg res-mg-fcs">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-house"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" name="adresse" placeholder="Adresse" required>
                                    </div>
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-success"></i>
                                    </div>
                                </div>
                            </div>
                        </div></div><br>
                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
<!--                                <div class="form-group ic-cmp-int">
                                        <i class="notika-icon notika-phone"></i>
                                    </div>-->
                                <div class="chosen-select-act fm-cmp-mg">
                               
                                    <select class="chosen" data-placeholder="" style="align-content: center;" name="profil" required>
                                      
                                                                                        <option value=''>Profil</option>
											<option value="abonne">Abonne</option>
											<option value="administrateur">Administrateur</option>
											
										</select>
                                </div></div> 
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                             
                               <div class="chosen-select-act fm-cmp-mg">
                                    <select class="chosen" data-placeholder="" style="align-content: center;" name="tel1" required>
                                        <option value=''>Choisir un operateur telephonique</option>
											<option value="77">77</option>
											<option value="76">76</option>
											<option value="78">78</option>
											<option value="76">70</option>
											<option value="33">33</option>
											
										</select>
                               </div></div>
                                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
<!--                                <div class="form-group ic-cmp-int">
                                        <i class="notika-icon notika-phone"></i>
                                    </div>-->
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" name="tel2" placeholder="Numero de telephone" onkeypress='return event.charCode >= 48 && event.charCode <= 57' max='7' min='7' required>
                                    </div>
                                </div></div>

                    </div>
               </div><br>
               
                    <div class="form-example-int mg-t-15">
                            <div class="row">
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
        </div>
    </form>
<%@include file="WEB-INF/footerForm.jsp" %>









