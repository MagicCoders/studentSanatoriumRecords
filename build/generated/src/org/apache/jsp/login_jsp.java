package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("!DOCTYPE html>\n");
      out.write("<html xmlns:th=\"http://www.thymeleaf.org\">\n");
      out.write("<head>\n");
      out.write("    <title>Reception</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"all\"\n");
      out.write("          href=\"../static/css/bulma.css\" th:href=\"@{./css/bulma.css}\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"all\"\n");
      out.write("          href=\"../static/css/main.css\" th:href=\"@{./css/main.css}\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"all\"\n");
      out.write("          href=\"../static/css/fontawesome.css\" th:href=\"@{./css/fontawesome.css}\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"layout-default\">\n");
      out.write("<section class=\"hero is-fullheight is-medium\">\n");
      out.write("    <div class=\"columns is-centered\">\n");
      out.write("        <div class=\"column is-two-fifths form-container\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"card-content\">\n");
      out.write("                    <h2 class=\"is-size-2 has-text-grey-light has-text-weight-light\">Login</h2>\n");
      out.write("                    <div class=\"field\">\n");
      out.write("                        <p class=\"control has-icons-left has-icons-right\">\n");
      out.write("                            <input autocomplete=off class=\"input is-rounded\" type=\"text\" placeholder=\"Staff Id\">\n");
      out.write("                            <span class=\"icon is-small is-left\">\n");
      out.write("      <i class=\"fas fa-user\"></i>\n");
      out.write("    </span>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"field\">\n");
      out.write("                        <p class=\"control has-icons-left\">\n");
      out.write("                            <input class=\"input is-rounded\" type=\"password\" placeholder=\"Password\">\n");
      out.write("                            <span class=\"icon is-small is-left\">\n");
      out.write("      <i class=\"fas fa-lock\"></i>\n");
      out.write("    </span>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"field\">\n");
      out.write("                        <p class=\"control\">\n");
      out.write("                            <button class=\"button is-rounded is-primary is-medium is-fullwidth\">\n");
      out.write("                                Login\n");
      out.write("                            </button>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("</body>\n");
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
