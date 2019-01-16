package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reception_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Reception</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"static/css/animate.css\" th:href=\"@{/css/animate.css}\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"static/css/fontawesome.css\"\n");
      out.write("          th:href=\"@{/css/fontawesome.css}\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"file:///home/wesleigh/NetBeansProjects/EgertonSanatorium/web/static/css/main.css\" th:href=\"@{/css/main.css}\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\">\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"layout-default\">\n");
      out.write("<section class=\"hero is-fullheight is-medium doctor-container\">\n");
      out.write("    <div class=\"columns is-centered\">\n");
      out.write("        <div class=\"column is-half\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"columns\">\n");
      out.write("                    <div class=\"column is-one-fifth\">\n");
      out.write("                        <button class=\"button is-primary\"><a href=\"/EgertonSanatorium\">\n");
      out.write("                            <span class=\"icon is-small is-left\">\n");
      out.write("      <i class=\"fas fa-arrow-left\"></i>\n");
      out.write("    </span>\n");
      out.write("                        </a>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\" column is-four-fifths has-text-centered\">\n");
      out.write("                        <h2 class=\"is-size-3 has-text-weight-light\">Reception Content</h2>\n");
      out.write("                        <p class=\"help is-danger\">Data to be filled carefully and with caution. As accurate as\n");
      out.write("                            posible</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"card-content\">\n");
      out.write("                    <form autocomplete=\"off\" action=\"#\" th:object=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\">\n");
      out.write("                        <div class=\"field is-horizontal\">\n");
      out.write("                            <div class=\"field-label is-normal\">\n");
      out.write("                                <label class=\"label\">Name:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field-body\">\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <p class=\"control is-expanded\">\n");
      out.write("                                        <input id=\"name\" class=\"input animated\" type=\"text\" th:field=\"*{name}\"\n");
      out.write("                                               placeholder=\"Patients's Name\">\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"field is-horizontal\" id=\"studentId-container\">\n");
      out.write("                            <div class=\"field-label is-normal\">\n");
      out.write("                                <label class=\"label\">RegNumber:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field-body\">\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <p class=\"control is-expanded\">\n");
      out.write("                                        <input id=\"regNo\" class=\"input animated\" type=\"text\" th:field=\"*{regNo}\"\n");
      out.write("                                               placeholder=\"S13/XXXXX/YR\">\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"field is-horizontal\">\n");
      out.write("                            <div class=\"field-label is-normal\">\n");
      out.write("                                <label class=\"label\">Visit Type:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field-body\">\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <p class=\"control is-expanded\">\n");
      out.write("                                    <div class=\"select\">\n");
      out.write("                                        <select id=\"visit\">\n");
      out.write("                                            <option>New</option>\n");
      out.write("                                            <option>Returning</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"field is-horizontal\">\n");
      out.write("                            <div class=\"field-label is-normal\">\n");
      out.write("                                <label class=\"label\">Receptionist:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field-body\">\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <p class=\"control is-expanded\">\n");
      out.write("                                        <input class=\"input is-primary has-text-primary\" type=\"text\"\n");
      out.write("                                               value=\"Receptionist's Name\" readonly>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"field is-horizontal\">\n");
      out.write("                            <div class=\"field-label\">\n");
      out.write("                                <!-- Left empty for spacing -->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field-body\">\n");
      out.write("                                <div class=\"field is-horizontal\">\n");
      out.write("                                    <div class=\"control\">\n");
      out.write("                                        <button id=\"update-button\" class=\"button is-danger invisible\" type=\"submit\">\n");
      out.write("                                            Update Record\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"submit-buttons\">\n");
      out.write("                                        <div class=\"control\">\n");
      out.write("                                            <button id=\"submit-student-button\" class=\"button is-primary\" type=\"submit\"\n");
      out.write("\n");
      out.write("                                                    value=\"create-student-record\" name=\"next\" disabled>\n");
      out.write("\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
