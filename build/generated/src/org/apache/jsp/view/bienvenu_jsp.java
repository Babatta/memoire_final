package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bienvenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/en_tete.jsp");
    _jspx_dependants.add("/WEB-INF/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/footer.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" lang=\"fr\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/bootstrap.css\"/>\n");
      out.write("        \n");
      out.write("        <!--<link rel=\"icon\" type=\"image/png\" href=\"images/UADB.png\" sizes=\"310x310\" />-->\n");
      out.write("        \n");
      out.write("        ");

            response.setContentType("text/html;charset=UTF-8");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <!-- Basic -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \n");
      out.write("   \n");
      out.write("    <!-- Mobile Metas -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write(" \n");
      out.write("     <!-- Site Metas -->\n");
      out.write("    <title>GoodWEB Solutions - Responsive HTML5 Landing Page Template</title>  \n");
      out.write("    <meta name=\"keywords\" content=\"\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <!-- Site Icons -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- Site CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style_1.css\">\n");
      out.write("    <!-- Responsive CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("    <!-- Modernizer for Portfolio -->\n");
      out.write("    <script src=\"js/modernizer.js\"></script>\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
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
      out.write("                        <a class=\"navbar-brand\" href=\"#\"><img src=\"images/logos/logo.png\" alt=\"image\"></a>\n");
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
      out.write("\n");
      out.write("        <div class=\"slider-area\">\n");
      out.write("            <div class=\"slider-wrapper owl-carousel\">\n");
      out.write("                <div class=\"slider-item home-one-slider-otem slider-item-four slider-bg-one\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"slider-content-area\">\n");
      out.write("                                <div class=\"slide-text\">\n");
      out.write("                                    <h1 class=\"homepage-three-title\">Bienvenue sur votre Plateforme de<span> gestion centralis??e </span>d'objets connect??s</h1>\n");
      out.write("                                    <h2>La solution id??ale pour assurer <br>votre confort et garantir la s??curit?? de vos objets. </h2>\n");
      out.write("                                    <div class=\"slider-content-btn\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slider-item text-center home-one-slider-otem slider-item-four slider-bg-two\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"slider-content-area\">\n");
      out.write("                                <div class=\"slide-text\">\n");
      out.write("                                    <h1 class=\"homepage-three-title\">Bienvenue sur votre Plateforme de<span> gestion centralis??e </span>d'objets connect??s</h1>\n");
      out.write("                                    <h2>La solution id??ale pour assurer <br>votre confort et garantir la s??curit?? de vos objets. </h2>\n");
      out.write("                                    <div class=\"slider-content-btn\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slider-item home-one-slider-otem slider-item-four slider-bg-three\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"slider-content-area\">\n");
      out.write("                                <div class=\"slide-text\">\n");
      out.write("                                    <h1 class=\"homepage-three-title\">Bienvenue sur votre Plateforme de<span> gestion centralis??e </span>d'objets connect??s</h1>\n");
      out.write("                                    <h2>La solution id??ale pour assurer <br>votre confort et garantir la s??curit?? de vos objets. </h2>\n");
      out.write("                                    <div class=\"slider-content-btn\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div></div>\n");
      out.write("<div id=\"about\" class=\"section wb\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"message-box\">\n");
      out.write("                        <h4></h4>\n");
      out.write("                        <h2>Bienvenue sur notre Plateforme de gestion centralis??e de parc parc d'objet.</h2>\n");
      out.write("                        <p class=\"lead\">Quisque eget nisl id nulla sagittis auctor quis id. Aliquam quis vehicula enim, non aliquam risus. Sed a tellus quis mi rhoncus dignissim.</p>\n");
      out.write("\n");
      out.write("                        <p> Integer rutrum ligula eu dignissim laoreet. Pellentesque venenatis nibh sed tellus faucibus bibendum. Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed vitae rutrum neque. Ut id erat sit amet libero bibendum aliquam. Donec ac egestas libero, eu bibendum risus. Phasellus et congue justo. </p>\n");
      out.write("\n");
      out.write("                        <a href=\"#services\" class=\"btn btn-light btn-radius btn-brd grd1\">En Savoir Plus</a>\n");
      out.write("                    </div><!-- end messagebox -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"post-media wow fadeIn\">\n");
      out.write("                        <img src=\"uploads/auth.png\" alt=\"\" class=\"img-responsive img-rounded\">\n");
      out.write("                        <a href=\"http://www.youtube.com/watch?v=nrJtHemSPW4\" data-rel=\"prettyPhoto[gal]\" class=\"playbutton\"><i class=\"flaticon-play-button\"></i></a>\n");
      out.write("                    </div><!-- end media -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("            </div><!-- end row -->\n");
      out.write("\n");
      out.write("            <hr class=\"hr1\"> \n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("                    <div class=\"post-media wow fadeIn\">\n");
      out.write("                        <img src=\"uploads/dev.png\" alt=\"\" class=\"img-responsive img-rounded\">\n");
      out.write("                    </div><!-- end media -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("\t\t\t\t\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"message-box\">\n");
      out.write("                        <h4>Qui sommes-nous?</h4>\n");
      out.write("                        <h2>Nous vous apportons une solution pour interagir avec vos objets connect??s.</h2>\n");
      out.write("                        <p class=\"lead\">Quisque eget nisl id nulla sagittis auctor quis id. Aliquam quis vehicula enim, non aliquam risus. Sed a tellus quis mi rhoncus dignissim.</p>\n");
      out.write("\n");
      out.write("                        <p> Integer rutrum ligula eu dignissim laoreet. Pellentesque venenatis nibh sed tellus faucibus bibendum. Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed vitae rutrum neque. Ut id erat sit amet libero bibendum aliquam. Donec ac egestas libero, eu bibendum risus. Phasellus et congue justo. </p>\n");
      out.write("\n");
      out.write("                        <a href=\"#services\" class=\"btn btn-light btn-radius btn-brd grd1\">En Savoir Plus</a>\n");
      out.write("                    </div><!-- end messagebox -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("            </div><!-- end row -->\n");
      out.write("        </div><!-- end container -->\n");
      out.write("    </div><!-- end section -->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("<footer class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <img src=\"images/logos/logo-2.png\" alt=\"\" />\n");
      out.write("                        </div>\n");
      out.write("                        <p> Integer rutrum ligula eu dignissim laoreet. Pellentesque venenatis nibh sed tellus faucibus bibendum. Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>\n");
      out.write("                        <p>Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis montes.</p>\n");
      out.write("                    </div><!-- end clearfix -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <h3>Pages</h3>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <ul class=\"footer-links hov\">\n");
      out.write("                            <li><a href=\"#\">Home <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Blog <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Pricing <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">About <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Faq <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Contact <span class=\"icon icon-arrow-right2\"></span></a></li>\n");
      out.write("                        </ul><!-- end links -->\n");
      out.write("                    </div><!-- end clearfix -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("\t\t\t\t\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"footer-distributed widget clearfix\">\n");
      out.write("                        <div class=\"widget-title\">\n");
      out.write("                            <h3>Subscribe</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which one know this tricks.</p>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-right\">\n");
      out.write("\t\t\t\t\t\t\t<form method=\"get\" action=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<input placeholder=\"Subscribe our newsletter..\" name=\"search\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>                        \n");
      out.write("                    </div><!-- end clearfix -->\n");
      out.write("                </div><!-- end col -->\n");
      out.write("            </div><!-- end row -->\n");
      out.write("        </div><!-- end container -->\n");
      out.write("    </footer><!-- end footer -->\n");
      out.write("\n");
      out.write("    <div class=\"copyrights\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"footer-distributed\">\n");
      out.write("                <div class=\"footer-left\">                   \n");
      out.write("                    <p class=\"footer-company-name\">All Rights Reserved. &copy; 2018 <a href=\"#\">GoodWEB</a> Design By : \n");
      out.write("\t\t\t\t\t<a href=\"https://html.design/\">html design</a></p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div><!-- end container -->\n");
      out.write("    </div><!-- end copyrights -->\n");
      out.write("\n");
      out.write("    <a href=\"#\" id=\"scroll-to-top\" class=\"dmtop global-radius\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("\n");
      out.write("    <!-- ALL JS FILES -->\n");
      out.write("    <script src=\"js/all.js\"></script>\n");
      out.write("    <!-- ALL PLUGINS -->\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("    <script src=\"js/portfolio.js\"></script>\n");
      out.write("    <script src=\"js/hoverdir.js\"></script>    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"dist/js/jquery.js\"></script>\n");
      out.write("<!--<script type=\"text/javascript\" src=\"dist/js/bootstrap.min.js\"></script>-->\n");
      out.write("<script type=\"text/javascript\" src=\"dist/js/bootstrap.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"dist/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
