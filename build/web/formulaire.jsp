<%-- 
    Document   : formulaire
    Created on : 11 déc. 2019, 00:02:51
    Author     : TOSHIBA
--%>
<%@include file="WEB-INF/taglib.jsp" %>
<%@include file="WEB-INF/header1.jsp"%>
<%@include file="WEB-INF/headerTable.jsp" %>
<%@include file="WEB-INF/headerForm.jsp" %>
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
<!--                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                        <i class="notika-icon notika-phone"></i>
                                    </div>
                                <div class="chosen-select-act fm-cmp-mg">
                               
                                    <select class="chosen" data-placeholder="Choisir un operateur telephonique" style="align-content: center;" name="tel1" required>
                                        <option value='Choisir un operateur telephonique'></option>
											<option value="77">77</option>
											<option value="76">76</option>
											<option value="78">78</option>
											<option value="76">70</option>
											<option value="33">33</option>
											
										</select>
                                </div>  
                                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                        <i class="notika-icon notika-phone"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" name="tel2" placeholder="Numero de telephone" onkeypress='return event.charCode >= 48 && event.charCode <= 57' max='7' min='7' required>
                                    </div>
                                </div>
                            </div>
                           </div>
                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-map"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" placeholder="Location">
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-next"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" placeholder="Postal Code">
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-mail"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" placeholder="Message">
                                    </div>
                                </div>
                            </div>
                        </div>-->
<!--                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-star"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" placeholder="Notification">
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-travel"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" placeholder="Flight">
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-dollar"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" placeholder="Dollar">
                                    </div>
                                </div>
                            </div>
                        </div>-->
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
                                        <option value='Choisir un operateur telephonique'></option>
                                                                                        <option value="Profil"></option>
											<option value="abonne">Abonne</option>
											<option value="administrateur">Administrateur</option>
											
										</select>
                                </div></div> 
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                             
                               <div class="chosen-select-act fm-cmp-mg">
                                    <select class="chosen" data-placeholder="" style="align-content: center;" name="tel1" required>
                                        <option value='Choisir un operateur telephonique'></option>
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
<!--                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int form-elet-mg res-mg-fcs">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-wifi"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" placeholder="Internet">
                                    </div>
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-cloud"></i>
                                    </div>
                                </div>
                            </div>-->
                            
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int form-elet-mg">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-edit"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control" placeholder="Layer">
                                    </div>
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-chat"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-element-list mg-t-30">
                        <div class="cmp-tb-hd">
                            <h2>Floating Labels</h2>
                            <p>Basic example for input groups with floating labels </p>
                        </div>
                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int float-lb floating-lb">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-support"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control">
                                        <label class="nk-label">Full Name</label>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int float-lb floating-lb">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-mail"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control">
                                        <label class="nk-label">Email Address</label>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int float-lb floating-lb">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-phone"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control">
                                        <label class="nk-label">Contact Number</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int float-lb form-elet-mg">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-wifi"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control">
                                        <label class="nk-label">Internet</label>
                                    </div>
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-cloud"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int float-lb form-elet-mg">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-house"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control">
                                        <label class="nk-label">Home Address</label>
                                    </div>
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-success"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                <div class="form-group ic-cmp-int float-lb form-elet-mg">
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-edit"></i>
                                    </div>
                                    <div class="nk-int-st">
                                        <input type="text" class="form-control">
                                        <label class="nk-label">Layer</label>
                                    </div>
                                    <div class="form-ic-cmp">
                                        <i class="notika-icon notika-chat"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            
            
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-element-list mg-t-30">
                        <div class="cmp-tb-hd">
                            <h2>Chosen</h2>
                            <p>Make long, unwieldy select boxes more user friendly.</p>
                        </div>
                        <div class="row">
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                <div class="nk-int-mk sl-dp-mn">
                                    <h2>Basic Example</h2>
                                </div>
                                <div class="chosen-select-act fm-cmp-mg">
                                    <select class="chosen" data-placeholder="Choose a Country...">
											<option value="United States">United States</option>
											<option value="United Kingdom">United Kingdom</option>
											<option value="Afghanistan">Afghanistan</option>
											<option value="Aland Islands">Aland Islands</option>
											<option value="Albania">Albania</option>
											<option value="Algeria">Algeria</option>
											<option value="American Samoa">American Samoa</option>
										</select>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                <div class="nk-int-mk sl-dp-mn sm-res-mg-t-10">
                                    <h2>Disabled Items</h2>
                                </div>
                                <div class="chosen-select-act fm-cmp-mg">
                                    <select class="chosen" data-placeholder="Choose a Country...">
											<option value="United States">United States</option>
											<option value="United Kingdom">United Kingdom</option>
											<option disabled value="Afghanistan">Afghanistan</option>
											<option disabled value="Aland Islands">Aland Islands</option>
											<option value="Albania">Albania</option>
											<option disabled value="Algeria">Algeria</option>
											<option value="American Samoa">American Samoa</option>
										</select>
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                <div class="nk-int-mk sl-dp-mn sm-res-mg-t-10">
                                    <h2>Multiple Example</h2>
                                </div>
                                <div class="chosen-select-act fm-cmp-mg">
                                    <select class="chosen" multiple data-placeholder="Choose a Country...">
											<option value="United States">United States</option>
											<option value="United Kingdom">United Kingdom</option>
											<option value="Afghanistan">Afghanistan</option>
											<option value="Aland Islands">Aland Islands</option>
											<option value="Albania">Albania</option>
											<option value="Algeria">Algeria</option>
											<option value="American Samoa">American Samoa</option>
										</select>
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
<%@include file="WEB-INF/footerForm.jsp" %>