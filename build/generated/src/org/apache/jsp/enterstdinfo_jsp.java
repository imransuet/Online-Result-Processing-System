package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enterstdinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Enter info</title>\n");
      out.write("        <style>\n");
      out.write("            .header{\n");
      out.write("                background-color: #5EFB6E; \n");
      out.write("                text-align: center;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            .into{\n");
      out.write("                 margin-top: 150px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: brown;\n");
      out.write("\n");
      out.write("            }            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Welcome to result Processing System</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"into\">\n");
      out.write("             <h2>Enter information</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"data\">\n");
      out.write("                <center>\n");
      out.write("                    <form  action=\"enterstdintodatabase.jsp\">\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                    <input type=\"text\" name=\"std_name\" placeholder=\"Student Name\" style=\"width: 300px;height: 25px\">\n");
      out.write("                                </td>               \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                    <input type=\"text\" name=\"reg\" placeholder=\"Registration Number\" style=\"width: 300px;height: 25px\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                    <input type=\"text\" name=\"session\" placeholder=\"Session\" style=\"width: 300px;height: 25px\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                         <div class=\"entering\">\n");
      out.write("                <center> \n");
      out.write("                    <input type=\"submit\" value=\"Submit\" style=\"padding: 3px; margin-top: 7px;\">\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
