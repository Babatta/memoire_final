package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class listeReseau_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/headerTable.jsp");
    _jspx_dependants.add("/WEB-INF/footerTable.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"data-table-area\" >\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"data-table-list\">\n");
      out.write("                        <div class=\"basic-tb-hd\">\n");
      out.write("                            <h2>Liste des Reseaux.</h2>\n");
      out.write("                            <p>Vous pouvez faire une recherche suvant un nom.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"table-responsive\" >\n");
      out.write("                            <table id=\"data-table-basic\" class=\"table table-striped\" >\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>#ID</th>\n");
      out.write("                                        <th>Nom Reseau</th>\n");
      out.write("                                        <th>Supprimer</th>\n");
      out.write("                                        <th>Modifier</th>\n");
      out.write("                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <tfoot>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>#ID Reseau</th>\n");
      out.write("                                        <th>Nom Reseau</th>\n");
      out.write("                                        <th>Supprimer</th>\n");
      out.write("                                        <th>Modifier</th>\n");
      out.write("                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                </tfoot>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div></body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Data Table area End-->\n");
      out.write("    <!-- Start Footer area-->\n");
      out.write("    <div class=\"footer-copyright-area\" style=\"background-color:#fd6802; height:  50px;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"footer-copy-right\">\n");
      out.write("                        <p>Copyright © 2018 . All rights reserved. Template by <a href=\"https://colorlib.com\">Colorlib</a>.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Footer area-->\n");
      out.write("    <!-- jquery\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("    <!-- bootstrap JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- wow JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/wow.min.js\"></script>\n");
      out.write("    <!-- price-slider JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/jquery-price-slider.js\"></script>\n");
      out.write("    <!-- owl.carousel JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/owl.carousel.min.js\"></script>\n");
      out.write("    <!-- scrollUp JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <!-- meanmenu JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/meanmenu/jquery.meanmenu.js\"></script>\n");
      out.write("    <!-- counterup JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/counterup/jquery.counterup.min.js\"></script>\n");
      out.write("    <script src=\"template2/js/counterup/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"template2/js/counterup/counterup-active.js\"></script>\n");
      out.write("    <!-- mCustomScrollbar JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/scrollbar/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    <!-- sparkline JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("    <script src=\"template2/js/sparkline/sparkline-active.js\"></script>\n");
      out.write("    <!-- flot JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"template2/js/flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <script src=\"template2/js/flot/flot-active.js\"></script>\n");
      out.write("    <!-- knob JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/knob/jquery.knob.js\"></script>\n");
      out.write("    <script src=\"template2/js/knob/jquery.appear.js\"></script>\n");
      out.write("    <script src=\"template2/js/knob/knob-active.js\"></script>\n");
      out.write("    <!--  Chat JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/chat/jquery.chat.js\"></script>\n");
      out.write("    <!--  todo JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/todo/jquery.todo.js\"></script>\n");
      out.write("\t<!--  wave JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/wave/waves.min.js\"></script>\n");
      out.write("    <script src=\"template2/js/wave/wave-active.js\"></script>\n");
      out.write("    <!-- plugins JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/plugins.js\"></script>\n");
      out.write("    <!-- Data Table JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/data-table/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"template2/js/data-table/data-table-act.js\"></script>\n");
      out.write("    <!-- main JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/main.js\"></script>\n");
      out.write("\t<!-- tawk chat JS\n");
      out.write("\t\t============================================ -->\n");
      out.write("    <script src=\"template2/js/tawk-chat.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("   \n");
      out.write(" ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("re");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listerReseau}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tbody>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${re.idReseau}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${re.nomReseau}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td><a href='Controleur?action=supprimerReseau&idReseau=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${re.idReseau}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'><img src=\"template1/img/del.png\" style=\"width: 25px\"/></td>\n");
          out.write("                                    <td> <a href='Controleur?action=modifierReseau&idReseau=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${re.idReseau}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'><img src=\"template1/img/pen.png\" style=\"width: 25px\"/></button></td>\n");
          out.write("                                       \n");
          out.write("                                    </tr>\n");
          out.write("                                    \n");
          out.write("                                </tbody>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
