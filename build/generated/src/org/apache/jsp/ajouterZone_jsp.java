package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class ajouterZone_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/header1.jsp");
    _jspx_dependants.add("/WEB-INF/headerTable.jsp");
    _jspx_dependants.add("/WEB-INF/headerForm.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"fr\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Basic -->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \n");
      out.write("\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <title>memoire</title>  \n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"template1/css/bootstrap.min.css\">\n");
      out.write("        <!-- Site CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"template1/style_1.css\">\n");
      out.write("        <!-- Responsive CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"template1/css/responsive.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"template1/css/custom.css\">\n");
      out.write("\n");
      out.write("        <!-- Modernizer for Portfolio -->\n");
      out.write("        <script src=\"template1/js/modernizer.js\"></script>\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"top-bar\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                        <div class=\"left-top\">\n");
      out.write("                            <div class=\"email-box\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i> projetmemoire@gmail.com</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"phone-box\">\n");
      out.write("                                <a href=\"tel:1234567890\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> +221773051891</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <header class=\"header header_style_01\">\n");
      out.write("            <nav class=\"megamenu navbar navbar-default\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                            <span class=\"sr-only\">Plateforme</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\"><img src=\"template1/images/logos/logo.png\" alt=\"image\"></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                        <table align=\"right\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                        <li><a  href=\"Controleur?action=dmd\" style=\"font-size: 150%\">Inscription</a></li>\n");
      out.write("\n");
      out.write("                                        <li><a href=\"Controleur?action=connexion1\" style=\"font-size: 150%\"> <!--<figure><img src=\"img/compteUser.png\" alt=\"image\" style=\"max-height: 85px;max-width: 85px\"><figcaption ></figcaption></figure>--> Connexion</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html class=\"no-js\" lang=\"\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>memoire</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("   \n");
      out.write("\t\t\n");
      out.write("    <link rel=\"shortcut icon\" type=\"template2/image/x-icon\" href=\"img/favicon.ico\">\n");
      out.write("    \n");
      out.write("\t\t\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900\" rel=\"stylesheet\">\n");
      out.write("   \n");
      out.write("\t\t\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/bootstrap.min.css\">\n");
      out.write("   \n");
      out.write("\t\t \n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\t\t \n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/owl.theme.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/owl.transitions.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/meanmenu/meanmenu.min.css\">\n");
      out.write("  \n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/animate.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/normalize.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/wave/waves.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/wave/button.css\">\n");
      out.write(" \n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/scrollbar/jquery.mCustomScrollbar.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/notika-custom-icon.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/jquery.dataTables.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/main.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/style.css\">\n");
      out.write("\n");
      out.write("    <script src=\"template2/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("            \n");
      out.write("      \n");
      out.write("  \n");
      out.write("    <div class=\"header-top-area\" style=\"background-color:#fd6802; height:  50px;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"logo-area\">\n");
      out.write("                        <a href=\"#\"><img src=\"\" alt=\"\" /> </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("    <div class=\"mobile-menu-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"mobile-menu\">\n");
      out.write("                        <nav id=\"dropdown\">\n");
      out.write("                            <ul class=\"mobile-menu-nav\">\n");
      out.write("                                <li><a data-toggle=\"collapse\" data-target=\"#Charts\" href=\"Controleur?action=bienvenu\"><h4 >Accueil</h4></a>\n");
      out.write("                                    <ul class=\"collapse dropdown-header-top\">\n");
      out.write("                                        <li><a href=\"Controleur?action=TableauB\"></a>Tableau de bord</li>\n");
      out.write("                                        <li><a href=\"Controleur?action=voirD\"></a>Visualiser les Demandes</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a data-toggle=\"collapse\" data-target=\"#democrou\" href=\"#\">Ajouter</a>\n");
      out.write("                                    <ul id=\"democrou\" class=\"collapse dropdown-header-top\">\n");
      out.write("                                        <li><a href=\"Controleur?action=AjZone\">Zone</a></li>\n");
      out.write("                                        <li><a href=\"Controleur?action=AjBat\">Batiment</a></li>\n");
      out.write("                                        <li><a href=\"Controleur?action=AjLocalisation\">Localisation</a></li>\n");
      out.write("                                        <li><a  href=\"Controleur?action=AjStation\">Station de Base</a></li>\n");
      out.write("                                        <li><a href=\"Controleur?action=AjReseau\">Reseaux</a></li>\n");
      out.write("                                        <li><a href=\"Controleur?action=AjObjet\">Objet</a></li>\n");
      out.write("                                        <li><a href=\"template2/form-examples.html\">Abonne</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                <li><a data-toggle=\"collapse\" data-target=\"#demo\" href=\"#\">Lister</a>\n");
      out.write("                                    <ul id=\"demo\" class=\"collapse dropdown-header-top\">\n");
      out.write("                                       <li><a href=\"Controleur?action=listeObjet\">Zones</a></li>\n");
      out.write("                                        <li><a href=\"Controleur?action=listeBat\">Batiments</a></li>\n");
      out.write("                                        <li><a href=\"Controleur?action=listeLocalisation\">Localisation</a></li>\n");
      out.write("                                        <li><a href=\"Controleur?action=listeStation\">Station de Base</a></li>\n");
      out.write("                                        <li><a href=\"Controleur?action=listeReseau\">Reseaux</a></li>\n");
      out.write("                                        <li><a href=\"Controleur?action=listeObjet\">Objets</a></li>\n");
      out.write("                                        <li><a href=\"Controleur?action=listeAbonne\">Abonnes</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("                                <li><a data-toggle=\"collapse\" data-target=\"#Pagemob\" href=\"Controleur?action=listeAbonne\">Mon Compte</a>\n");
      out.write("                                    <ul id=\"Pagemob\" class=\"collapse dropdown-header-top\">\n");
      out.write("                                        \n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-menu-area mg-tb-40\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <ul class=\"nav nav-tabs notika-menu-wrap menu-it-icon-pro\">\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#Home\"><i class=\"notika-icon notika-house\" ></i> Accueil</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#mailbox\"><i class=\"notika-icon notika-mail\"></i> Visualiser les demandes</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#Interface\"><i class=\"notika-icon notika-edit\"></i> Ajouter</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#Forms\"><i class=\"notika-icon notika-form\"></i> Lister</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a data-toggle=\"tab\" href=\"#Charts\"><i class=\"notika-icon notika-bar-chart\"></i> Tableau de bord</a>\n");
      out.write("                    <li><a data-toggle=\"tab\" href=\"#Page\"><i class=\"notika-icon notika-support\"></i> Pages</a>     \n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"tab-content custom-menu-content\">\n");
      out.write("                        <div id=\"Home\" class=\"tab-pane in notika-tab-menu-bg animated flipInX\">\n");
      out.write("                            <ul class=\"notika-main-menu-dropdown\">\n");
      out.write("                                <li><a href=\"template2/index.html\">Tableau de bord</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"template2/index-2.html\">Visualiser les demandes</a>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"Interface\" class=\"tab-pane notika-tab-menu-bg animated flipInX\">\n");
      out.write("                            <ul class=\"notika-main-menu-dropdown\">\n");
      out.write("                                <li><a href=\"template2/inbox.html\">Zone</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"template2/view-email.html\">Localisation</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"template2/compose-email.html\">Batiment</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"template2/compose-email.html\">Localisation</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"template2/compose-email.html\">Station de Base</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"template2/compose-email.html\">Reseau</a>\n");
      out.write("                                    <li><a href=\"template2/compose-email.html\">Objet</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"template2/compose-email.html\">Abonne</a>\n");
      out.write("                                </li>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"Forms\" class=\"tab-pane notika-tab-menu-bg animated flipInX\">\n");
      out.write("                            <ul class=\"notika-main-menu-dropdown\">\n");
      out.write("                                <li><a href=\"form-elements.html\">Zones </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"form-components.html\">Batiments </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"form-examples.html\">Localisation </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"form-elements.html\">Stations de Base</a>\n");
      out.write("                                </li>\n");
      out.write("                                 <li><a href=\"form-elements.html\">Reseaux</a>\n");
      out.write("                                </li>\n");
      out.write("                                 <li><a href=\"form-elements.html\">Objets</a>\n");
      out.write("                                </li>\n");
      out.write("                                 <li><a href=\"form-elements.html\">Abonnes</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("               </di</div></div>\n");
      out.write("    </div></div>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Form Components | Notika - Notika Admin Template</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- favicon\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"template2/img/favicon.ico\">\n");
      out.write("    <!-- Google Fonts\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/bootstrap.min.css\">\n");
      out.write("    <!-- font awesome CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/font-awesome.min.css\">\n");
      out.write("    <!-- owl.carousel CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/owl.theme.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/owl.transitions.css\">\n");
      out.write("    <!-- meanmenu CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/meanmenu/meanmenu.min.css\">\n");
      out.write("    <!-- animate CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/animate.css\">\n");
      out.write("    <!-- summernote CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/summernote/summernote.css\">\n");
      out.write("    <!-- Range Slider CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/themesaller-forms.css\">\n");
      out.write("    <!-- normalize CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/normalize.css\">\n");
      out.write("    <!-- mCustomScrollbar CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/scrollbar/jquery.mCustomScrollbar.min.css\">\n");
      out.write("    <!-- Notika icon CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/notika-custom-icon.css\">\n");
      out.write("    <!-- bootstrap select CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/bootstrap-select/bootstrap-select.css\">\n");
      out.write("    <!-- datapicker CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/datapicker/datepicker3.css\">\n");
      out.write("    <!-- Color Picker CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/color-picker/farbtastic.css\">\n");
      out.write("    <!-- main CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/chosen/chosen.css\">\n");
      out.write("    <!-- notification CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/notification/notification.css\">\n");
      out.write("    <!-- dropzone CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/dropzone/dropzone.css\">\n");
      out.write("    <!-- wave CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/wave/waves.min.css\">\n");
      out.write("    <!-- main CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/main.css\">\n");
      out.write("    <!-- style CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/style.css\">\n");
      out.write("    <!-- responsive CSS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"template2/css/responsive.css\">\n");
      out.write("    <!-- modernizr JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("   ");
      out.write("\n");
      out.write("<form  method=\"POST\" action=\"Controleur\" style=\"font-size:20px;\">\n");
      out.write("                    <input type=\"hidden\" name=\"action\" value=\"enrZone\"/>\n");
      out.write("<div class=\"form-element-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"form-element-list\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"cmp-tb-hd bcs-hd\">\n");
      out.write("                            <h2>Formulaire d'ajout d'une Zone.</h2>\n");
      out.write("<!--                            <p>Place one add-on or button on either side of an input. You may also place one on both sides of an input. </p>-->\n");
      out.write("                        </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                                <div class=\"form-group ic-cmp-int\">\n");
      out.write("                                    <div class=\"form-ic-cmp\">\n");
      out.write("                                        <i class=\"notika-icon notika-map\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"nk-int-st\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"nomZone\" placeholder=\"Zone\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                       \n");
      out.write("                      \n");
      out.write("                                <div class=\"col-lg-2 col-md-3 col-sm-3 col-xs-12\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-8 col-md-7 col-sm-7 col-xs-12\">\n");
      out.write("                                    <button class=\"btn btn-success notika-btn-success\">Enregistrer</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("</form>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
