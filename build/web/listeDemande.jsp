<%@include file="WEB-INF/taglib.jsp" %>
<%@include file="WEB-INF/header1.jsp"%>
<%@include file="WEB-INF/headerTable.jsp" %>>

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
                                    <td>Identifiant</td>
                                    <td>Nom</td> 
                                    <td>Prenom</td>
                                    <td>Adresse</td> 
                                    <td>Email</td>
                                    <td>Telephone</td>
                                    <td>Contrat</td>
                                    <td>Supprimer</td>
                                    <td>Valider</td>

                                    </tr>
                                </thead>
                               <c:forEach var="pa" items="${listeDemande}"> 
                                    <tr>
                                    <td>${pa.idDmd}</td>
                                    <td>${pa.nom}</td>
                                    <td>${pa.prenom}</td>
                                    <td>${pa.adresse}</td>
                                    <td>${pa.email}</td>
                                    <td>${pa.tel}</td>
                                    <td><a href='Controleur?action=validerDmd&idDmd=${pa.idDmd}&nom=${pa.nom}&prenom=${pa.prenom}&adresse=${pa.adresse}&email=${pa.email}&tel=${pa.tel}'><button type="button" class="btn btn-success">Valider</button></a></td>
                                        <td> <a href='controleur?action=supprimerDmd&iidDmd=${pa.idDmd}'><button type="button" class="btn btn-danger">Supprimer</button></a></th>

                                        </tr>

                                    </tbody>
                                </c:forEach>
                                <tfoot>
                                    <tr>
                                    <td>Identifiant</td>
                                    <td>Nom</td> 
                                    <td>Prenom</td>
                                    <td>Adresse</td> 
                                    <td>Email</td>
                                    <td>Telepdone</td>
                                    <td>Contrat</td>
                                    <td>Supprimer</td>
                                    <td>Valider</td>  


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





















