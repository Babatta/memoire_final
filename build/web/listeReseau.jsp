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
                            <h2>Liste des Reseaux.</h2>
                            <p>Vous pouvez faire une recherche suvant un nom.</p>
                        </div>
                        <div class="table-responsive" >
                            <table id="data-table-basic" class="table table-striped" >
                                <thead>
                                    <tr>
                                        <th>#ID Reseau</th>
                                        <th>Nom Reseau</th>
                                        <th>Supprimer</th>
                                        <th>Modifier</th>
                                        
                                    </tr>
                                </thead>
                                <c:forEach var="re" items="${listerReseau}">
                                <tbody>
                                    <tr>
                                        <td>${re.idReseau}</td>
                                        <td>${re.nomReseau}</td>
                                        <td><a href='Controleur?action=supprimerReseau&idReseau=${re.idReseau}'><img src="template1/img/del.png" style="width: 25px"/></td>
                                    <td> <a href='Controleur?action=modifierReseau&idReseau=${re.idReseau}'><img src="template1/img/pen.png" style="width: 25px"/></button></td>
                                       
                                    </tr>
                                    
                                </tbody>
                                </c:forEach>
                                <tfoot>
                                    <tr>
                                        <th>#ID Reseau</th>
                                        <th>Nom Reseau</th>
                                        <th>Supprimer</th>
                                        <th>Modifier</th>
                                        
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
    

   
 