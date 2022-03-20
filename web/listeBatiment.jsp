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
                            <h2>Liste des Batiments.</h2>
                            <p>Vous pouvez faire une recherche suvant le nom du Batiment ou de la Zone.</p>
                        </div>
                        <div class="table-responsive" >
                            <table id="data-table-basic" class="table table-striped" >
                                <thead>
                                    <tr>
                                        <th>#ID</th>
                                        <th>Nom Zone</th>
                                        <th>Nom Batiment</th>
                                        <th>Modifier</th>
                                        <th>Supprimer</th>
                                    </tr>
                                </thead>
                                <c:forEach var="bat" items="${listerBatiment}">  
                                <tbody>
                                    <tr>
                                        <td>${bat.idBatiment}</td>
                                        <td>${bat.nomZone}</td>
                                        <td>${bat.nomBatiment}</td>
                                        <td><a href='Controleur?action=supprimerBat&idBat=${bat.idBatiment}&idZone=${bat.idZone}'><button type="button" class="btn btn-danger">Supprimer</button></a>
     <td> <a href='Controleur?action=modifierBat&idBat=${bat.idBatiment}&idZone=${bat.idZone}'><button type="button" class="btn btn-success"><img src="template1/img/pen.png" style="width: 25px"/></button></a></td>
                                       
                                    </tr>
                                    
                                </tbody>
                                </c:forEach>
                                <tfoot>
                                    <tr>
                                        <th>#ID</th>
                                        <th>Nom Zone</th>
                                        <th>Nom Batiment</th>
                                        <th>Modifier</th>
                                        <th>Supprimer</th>
                                        
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

   


