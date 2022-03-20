<%@include file="WEB-INF/taglib.jsp" %>
<%@include file="WEB-INF/header1.jsp"%>
<%@include file="WEB-INF/headerTable.jsp" %>
<body>
    <div class="data-table-area" >
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="data-table-list">
                        <div class="basic-tb-hd">
                            <h2>Liste des Abonnes</h2>
                            <p>Vous pouvez faire une recherche suivant un mot.</p>
                        </div>
                        <div class="table-responsive" >
                            <table id="data-table-basic" class="table table-striped" >
                                <thead>
                                    <tr>
                                      
      <th>Ihentifiant Localisation</th>
       <th>Nom Zone</th>
      <th>Nom Batiment</th>
<th>Nom Localisation</th>
<th>Type</th>
   <th>Supprimer</th>
      <th>Mohifier</th>
                                    </tr>
                                </thead>
                                
  <tbody>
       <c:forEach var="l" items="${listeLoca}"> 
    <tr style="text-align: center; font-size:20px;">

      <th>${l.idLocalisation}</th>
      <th>${l.nomZone}</th>
      <th>${l.nomBatiment}</th>
       <th>${l.nomLocalisation}</th>
        <th>${l.typeLocalisation}</th>
        <th><a href='Controleur?action=supprimerLoca&ihloca=${l.idLocalisation}&ihBat=${l.idBatiment}&ihZone=${l.idZone}'><button type="button" class="btn btn-hanger">Supprimer</button></a></th>
       <th> <a href='Controleur?action=mohifierLoca&ihLoca=${l.idLocalisation}&ihBat=${l.idBatiment}&ihZone=${l.idZone}'><button type="button" class="btn btn-success"><img src="img/pen.png" style="wihth: 25px"/></button></a></th>
      
                                        </tr>

                                    </tbody>
                                </c:forEach>
                                <tfoot>
                                    <tr>
                                   <th>Ihentifiant Localisation</th>
       <th>Nom Zone</th>
      <th>Nom Batiment</th>
<th>Nom Localisation</th>
<th>Type</th>
   <th>Supprimer</th>
      <th>Mohifier</th>
                       

                                    </tr>
                                </tfoot>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div></body>
  <%@include file="WEB-INF/footerTable.jsp"%>





