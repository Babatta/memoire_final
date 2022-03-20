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
                                    <th>Prenom</th>
                                    <th>Nom</th>
                                    <th>Adresse</th>
                                    <th>Email</th>
                                    <th>telephone</th>
                                    <th>Login</th>
                                    <th>Passe</th>
                                    <th>Blocked</th>
                                     <th>Supprimer</th>
                                    <th>Visualiser ses Objets</th>
                                    </tr>
                                </thead>
                                <c:forEach var="ab" items="${listerAbonne}"> 
                                    <tbody>
                                        <tr>
                                        <td>>${ab.prenom}</td>
                                    <td>>${ab.nom}</td>
                                    <td>>${ab.adresse}</td>
                                    <td>>${ab.email}</td>
                                    <td>>${ab.tel}</td>
                                    <td>>${ab.login}</td>
                                    <td>>${ab.passe}</td>
                                    <td>>${ab.blocked}</td>
                                    <td><a href='Controleur?action=supprimerUser&id=${ab.idUser}'><img src="template1/img/del.png" style="width: 25px"/></a></td>
                                     <td> <a href='Controleur?action=visualiser&id=${ab.idUser}'><img src="template1/img/pen.png" style="width: 25px"/></a></td>

                                        </tr>

                                    </tbody>
                                </c:forEach>
                                <tfoot>
                                    <tr>
                                    <th>Prenom</th>
                                    <th>Nom</th>
                                    <th>Adresse</th>
                                    <th>Email</th>
                                    <th>telephone</th>
                                    <th>Login</th>
                                    <th>Passe</th>
                                    <th>Blocked</th>
                                    <th>Supprimer</th>
                                    <th>Visualiser ses Objets</th>

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




