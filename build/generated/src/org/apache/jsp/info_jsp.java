package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>My School Education Category Bootstrap Responsive website Template | Home </title>\n");
      out.write("    <!-- Meta tag Keywords -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"keywords\" content=\"My School Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("    <script>\n");
      out.write("        addEventListener(\"load\", function () {\n");
      out.write("\t\t\tsetTimeout(hideURLbar, 0);\n");
      out.write("\t\t}, false);\n");
      out.write("\n");
      out.write("\t\tfunction hideURLbar() {\n");
      out.write("\t\t\twindow.scrollTo(0, 1);\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("    <!-- //Meta tag Keywords -->\n");
      out.write("\n");
      out.write("    <!-- Custom-Files -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- Bootstrap-CSS -->\n");
      out.write("    <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("    <!-- Style-CSS -->\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font-Awesome-Icons-CSS -->\n");
      out.write("    <!-- //Custom-Files -->\n");
      out.write("\n");
      out.write("    <!-- Web-Fonts -->\n");
      out.write("    <link href=\"//fonts.googleapis.com/css?family=Lora:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext,vietnamese\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("    <link href=\"//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext\" rel=\"stylesheet\">\n");
      out.write("    <!-- //Web-Fonts -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- header -->\n");
      out.write("    <header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header d-lg-flex justify-content-between align-items-center py-2 px-sm-2 px-1\">\n");
      out.write("                <!-- logo -->\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <h1><a href=\"index.jsp\">Elearning</a></h1>\n");
      out.write("                </div>\n");
      out.write("                <!-- //logo -->\n");
      out.write("                <!-- nav -->\n");
      out.write("                <div class=\"nav_temps-amkls ml-lg-5\">\n");
      out.write("                    <nav>\n");
      out.write("                        <label for=\"drop\" class=\"toggle\">Menu</label>\n");
      out.write("                        <input type=\"checkbox\" id=\"drop\" />\n");
      out.write("                        <ul class=\"menu\">\n");
      out.write("                            <li><a href=\"index.jsp\">Accueil</a></li>\n");
      out.write("                            <li><a href=\"#about\">About</a></li>\n");
      out.write("                            <li><a href=\"inscriptionformateur.jsp\">Inscription Foramteur</a></li>\n");
      out.write("                            \n");
      out.write("                            <li><a href=\"consultationformation.jsp\">Nos Formations</a></li>\n");
      out.write("                            <li><a href=\"identification.jsp\">Login</a></li>\n");
      out.write("                            <li><a href=\"inscriptionapprenant.jsp\">Inscription Apprenant</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <!-- //nav -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- //header -->\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <!-- banner bottom -->\n");
      out.write("    <section class=\"temps-amkls-bnrbtm py-5\" id=\"about\">\n");
      out.write("        <div class=\"container py-xl-5 py-lg-3\">\n");
      out.write("            <h3 class=\"title-temps-amk mb-md-5 mb-sm-4 mb-2 text-center font-weight-bold\">About Us</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 text-center\">\n");
      out.write("                    <img src=\"images/about.jpg\" alt=\"about\" class=\"img-fluid mt-4\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 pr-xl-5 mt-4\">\n");
      out.write("                    <h3 class=\"title-sub mb-4\">Elearning</h3>\n");
      out.write("                    <p class=\"sub-para\">Rapidité, facilité, efficacité, disponibilité : voilà les maîtres mots du e-learning.Ce programme de formations en ligne vous aidera à acquérir des compétences dans différents domaines pour démarrer une nouvelle activité.Vous trouverez une offre complète \n");
      out.write("                        de formation en ligne pour vous former d'où vous le voulez et quand vous le voulez.</p>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- //banner bottom -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("  \n");
      out.write("   \n");
      out.write("    <!-- move top icon -->\n");
      out.write("    <a href=\"#home\" class=\"move-top text-center\">\n");
      out.write("        <span class=\"fa fa-angle-double-up\" aria-hidden=\"true\"></span>\n");
      out.write("    </a>\n");
      out.write("    <!-- //move top icon -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
