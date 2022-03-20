
<%@include file="WEB-INF/taglib.jsp" %>
<%@include file="WEB-INF/header1.jsp"%>
<%@include file="WEB-INF/headerTable.jsp" %>
<%@include file="WEB-INF/headerForm.jsp" %>
    <script language= "JavaScript">

           function myFunction() {
           var liste= "<div class='chosen-select-act fm-cmp-mg'>";
               liste+="<select class="chosen" data-placeholder='Choisr un batiment' style='align-content: center;' name='idBaiment' required>"; 
               
            var choix=parseInt(document.getElementById("inputState").value);
             liste+= "<option value=''> Nom Batiment</option>";
        <c:forEach var='bat' items='${listerBatiment}'>
            if (choix === parseInt(${bat.idZone})) {

                liste += "<option value='${bat.idBatiment}'> ${bat.nomBatiment}  </option>";

            }
        </c:forEach>
            liste += "</select>";
            
            document.getElementById("afficheZone").innerHTML = liste;


        }
    </script>



<form  method="POST" action="Controleur" style="font-size:20px;">
                    <input type="hidden" name="action" value="enrLoca"/>
<div class="form-element-area">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-element-list">
                        <div class="basic-tb-hd">
                            
                            
                        </div>
                        <div class="cmp-tb-hd bcs-hd">
                            <h2>Formulaire d'ajout d'un Batiment</h2>
                        </div>
                        
              
                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">

                                <div class="chosen-select-act fm-cmp-mg">
                               
                                    <select class="chosen" data-placeholder="" id="inputState" style="align-content: center;" name="idZone" onchange="myFunction" required>
                                      
                                     <option value=""> Choix Zone</option>                                        
                                    <c:forEach var="zo" items="${listerZone}">
                                        <option value="${zo.idZone}"> ${zo.nomZone}  </option>
                                    </c:forEach>

				</select>
                                </div>
                            </div> 
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12" id="afficheZone">

                                    <div class="nk-int-st">
                                       
                                    </div>
                                    </div>
                                        
                        </div><br>
                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">

                                 <div class="nk-int-st">
                                <input type="text" class="form-control"name="nomLoca" placeholder="Nom Localisation" required>
                                    
                                </div>
                            </div> 
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">

                                      <div class="nk-int-st">
                                       <input type="text" class="form-control" name="typeLocalisation" placeholder="Type Localisation" required>
                                    </div>
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
		    </form>
<%@include file="WEB-INF/footerForm.jsp" %>








