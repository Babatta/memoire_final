<%-- 
    Document   : headerAbonne
    Created on : 10 déc. 2019, 23:30:56
    Author     : TOSHIBA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <html lang="fr">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>memoire</title>

            <!-- Basic -->
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">   

            <!-- Mobile Metas -->
            <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

            <!-- Site Metas -->
            <title></title>  
            <meta name="keywords" content="">
            <meta name="description" content="">
            <meta name="author" content="">

            <!-- Bootstrap CSS -->
            <link rel="stylesheet" href="css/bootstrap.min.css">
            <!-- Site CSS -->
            <link rel="stylesheet" href="style_1.css">
            <!-- Responsive CSS -->
            <link rel="stylesheet" href="css/responsive.css">
            <!-- Custom CSS -->
            <link rel="stylesheet" href="css/custom.css">
            <link rel="stylesheet" href="style.css">
            <!-- Modernizer for Portfolio -->
            <script src="js/modernizer.js"></script>
            <!--[if lt IE 9]>
              <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
              <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
            <![endif]-->
            <script language= "JavaScript">
    var msg = ${message};
    alert ${message}; 
    if(msg!==null)
        alert(msg); 
</script>
        </head>
        <body>

            <div class="top-bar">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-6 col-sm-6">
                            <div class="left-top">
                                <div class="email-box">
                                    <a href="#"><i class="fa fa-envelope-o" aria-hidden="true"></i> projetmemoire@gmail.com</a>
                                </div>
                                <div class="phone-box">
                                    <a href="tel:1234567890"><i class="fa fa-phone" aria-hidden="true"></i> +221776235535</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <header class="header header_style_01">
                <nav class="megamenu navbar navbar-default">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="Controleur?action=bienvenu"><img src="images/logos/logo.png" alt="image"></a>
                        </div>
                        <div id="navbar" class="navbar-collapse collapse">
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="Controleur?action=connexion1" style="font-size: 140%">Déconnexion</a></li>
                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="Controleur?action=mdf&id=${idUser}" style="font-size: 140%">Modifier compte</a></li>
                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="Controleur?action=objet&id=${idUser}" style="font-size: 140%">Mes objets</a></li>
                            </ul>
                            <!--
                            <ul class="nav navbar-nav navbar-right">
                                <form action="Controleur" method="POST">
                                    <input type="hidden" value="mdf" name="action"/>
                                    <input type="hidden" value="${passe}" name="passe"/>
                                    <input type="hidden" value="${login}" name="login"/>
                                    <li><input type="submit" value="Modifier Compte" id="btn-mdf" ></li>
                                </form>
                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                                <form action="Controleur" method="POST">
                                    <input type="hidden" value="main" name="action"/>
                                    <input type="hidden" value="${passe}" name="passe"/>
                                    <input type="hidden" value="${login}" name="login"/>
                                    <li><input type="submit" value="Allumer ou Eteindre objets" id="btn-mdf" ></li>
                                </form>
                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                                <form action="Controleur" method="POST">
                                    <input type="hidden" value="rpc" name="action"/>
                                    <input type="hidden" value="${passe}" name="passe"/>
                                    <input type="hidden" value="${login}" name="login"/>
                                    <li><input type="submit" value="Rapport de consommation" id="btn-mdf" ></li>
                                </form>
                            </ul>-->
                        </div>
                    </div>
                </nav><br/>

            </header>