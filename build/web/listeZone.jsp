<%@include file="WEB-INF/taglib.jsp" %>
<%@include file="WEB-INF/headerTable.jsp" %>

<body>
    <div class="data-table-area" >
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="data-table-list">
                        <div class="basic-tb-hd">
                            <h2>Liste des Zones</h2>
                            <p>Vous pouvez faire une recherche suvant le nom de la Zone.</p>
                        </div>
                        <div class="table-responsive" >
                            <table id="data-table-basic" class="table table-striped" >
                                <thead>
                                    <tr>
                                        <th>#ID Zone</th>
                                        <th>Nom Zone</th>
                                        <th>Modifier</th>
                                        <th>Supprimer</th>
                                    </tr>
                                </thead>
                                <c:forEach var="zo" items="${listerZone}"> 
                                <tbody>
                                    <tr>
                                        <td>${zo.idZone}</td>
                                        <td>${zo.nomZone}</td>
                                        <td><a href='Controleur?action=supprimerZone&idZone=${zo.idZone}'><img src="template1/img/del.png" style="width: 25px"/></td>
                                    <td> <a href='Controleur?action=modifierZone&idZone=${zo.idZone}'><img src="template1/img/pen.png" style="width: 25px"/></button></td>
                                       
                                    </tr>
                                    
                                </tbody>
                                </c:forEach>
                                <tfoot>
                                    <tr>
                                        <th>#ID Zone</th>
                                        <th>Nom Zone</th>
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