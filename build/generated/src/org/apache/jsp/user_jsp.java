package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns:th=\"http://www.thymeleaf.org\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Admin</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.2/css/bulma.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"../static/css/main.css\" th:href=\"@{./css/main.css}\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"../static/css/fontawesome.css\" th:href=\"@{./css/fontawesome.css}\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\">\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            padding-top: 50px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"layout-default\">\n");
      out.write("<section class=\"hero is-fullheight is-medium doctor-container\">\n");
      out.write("    <div class=\"columns is-centered\">\n");
      out.write("        <div class=\"column is-four-fifths\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"has-text-centered\">\n");
      out.write("                    <h2 class=\"is-size-3 has-text-weight-light\">Admin Content</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-content\">\n");
      out.write("                    <div th:each=\"user: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${users}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <div class=\"field is-horizontal\">\n");
      out.write("                            <div class=\"field-label is-normal\">\n");
      out.write("                                <label class=\"label\">User:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field-body\">\n");
      out.write("                                <div class=\"field is-expanded\">\n");
      out.write("                                    <div class=\"field has-addons\">\n");
      out.write("                                        <p class=\"control\">\n");
      out.write("                                            <a class=\"button is-primary has-background-primary  is-medium\">\n");
      out.write("                                                Name:\n");
      out.write("                                            </a>\n");
      out.write("                                        </p>\n");
      out.write("                                        <p class=\"control is-expanded\">\n");
      out.write("                                            <input readonly class=\"input is-primary has-text-primary is-medium\" type=\"text\" th:value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"field is-expanded\">\n");
      out.write("                                    <div class=\"field has-addons\">\n");
      out.write("                                        <p class=\"control\">\n");
      out.write("                                            <a class=\"button is-primary has-background-primary  is-medium\">\n");
      out.write("                                                StaffId:\n");
      out.write("                                            </a>\n");
      out.write("                                        </p>\n");
      out.write("                                        <p class=\"control is-expanded\">\n");
      out.write("                                            <input readonly class=\"input is-primary has-text-primary is-medium\" type=\"text\" th:value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.staffId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"field is-expanded\">\n");
      out.write("                                    <div class=\"field has-addons\">\n");
      out.write("                                        <p class=\"control\">\n");
      out.write("                                            <a class=\"button is-primary has-background-primary  is-medium\">\n");
      out.write("                                                ID:\n");
      out.write("                                            </a>\n");
      out.write("                                        </p>\n");
      out.write("                                        <p class=\"control is-expanded\">\n");
      out.write("                                            <input readonly class=\"input is-primary has-text-primary is-medium\" type=\"text\" th:value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"field is-horizontal\">\n");
      out.write("                            <div class=\"field-label is-normal\">\n");
      out.write("                                <label class=\"label\">Email:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field-body\">\n");
      out.write("                                <div class=\"field is-expanded\">\n");
      out.write("                                    <div class=\"field\">\n");
      out.write("                                        <p class=\"control is-expanded\">\n");
      out.write("                                            <input readonly class=\"input\" type=\"email\" th:value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"field is-horizontal\">\n");
      out.write("                            <div class=\"field-label is-normal\">\n");
      out.write("                                <label class=\"label\">Sex:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field-body\">\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <p class=\"control is-expanded\">\n");
      out.write("                                    <div class=\"select\">\n");
      out.write("                                        <select disabled>\n");
      out.write("                                            <option th:text=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"field is-horizontal\">\n");
      out.write("                            <div class=\"field-label is-normal\">\n");
      out.write("                                <label class=\"label\">Role:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"field-body\">\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <p class=\"control is-expanded\">\n");
      out.write("                                        <input readonly class=\"input\" type=\"text\" th:value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
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
