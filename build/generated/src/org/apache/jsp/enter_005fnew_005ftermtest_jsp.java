package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;

public final class enter_005fnew_005ftermtest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                margin-top: 100px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: brown;\n");
      out.write("\n");
      out.write("            }    \n");
      out.write("            .dropdown{\n");
      out.write("                padding: 6px 88px;\n");
      out.write("            }\n");
      out.write("            .drop_sem{\n");
      out.write("                padding: 6px 110px;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            .drop_part{\n");
      out.write("                padding: 6px 120px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            function myfunction()\n");
      out.write("            {\n");
      out.write("                var data_true=0;\n");
      out.write("                \n");
      out.write("                var reg = document.getElementById(\"reg\").value;\n");
      out.write("                var length= reg.length;\n");
      out.write("\n");
      out.write("                if(reg==\"\"|| reg==null)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"b\").innerHTML=\"Fill the Textfild by a Registration number\";\n");
      out.write("                          data_true=1;\n");
      out.write("                       \n");
      out.write("                }\n");
      out.write("                    \n");
      out.write("                else  if(length!=10)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"b\").innerHTML=\"Invalid Registration Number\";\n");
      out.write("                         data_true=1;\n");
      out.write("                       \n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    for(var i =0;i<length;i++)\n");
      out.write("                    {\n");
      out.write("                        if(reg[i]>='0'&& reg[i]<=9)\n");
      out.write("                        {\n");
      out.write("                             \n");
      out.write("                        }\n");
      out.write("                        else\n");
      out.write("                        {\n");
      out.write("                            document.getElementById(\"b\").innerHTML=\"Invalid Charecter use,Plsease Use Correct Registration Number\";\n");
      out.write("                               data_true=1;\n");
      out.write("                       \n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                    \n");
      out.write("               \n");
      out.write("               \n");
      out.write("                   var  marks= document.getElementById(\"mark\").value;\n");
      out.write("                if(marks==\"\"|| marks==null)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"z\").innerHTML=\"please Enter A mark between 0 to 30\";\n");
      out.write("                       data_true=1;             \n");
      out.write("                }\n");
      out.write("                     \n");
      out.write("                \n");
      out.write("                if(data_true==0)\n");
      out.write("                    {\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("                    else \n");
      out.write("                     {\n");
      out.write("                            return false;\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Welcome to result Processing System</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"into\">\n");
      out.write("                <h2>Enter information</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"data\">\n");
      out.write("                <center>\n");
      out.write("                    <form  action=\"\" onsubmit=\"return myfunction()\">\n");
      out.write("                        <table>\n");
      out.write("                             <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"registration\" id=\"reg\" placeholder=\"Registration no\" style=\"width: 300px;height: 25px\">\n");
      out.write("                                    <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\n");
      out.write("                                    <div>\n");
      out.write("                                        <span id =\"b\" style=\"color: red;\"> </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                             \n");
      out.write("\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                               <tr>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                    <input type=\"text\" name=\"marks\" placeholder=\"Enter Term Test + Attendance  marks\" id=\"mark\" style=\"width: 300px;height: 25px\">\n");
      out.write("                                    <span style=\"color:red;list-style:none;font-size:12px;font-weight:bold;\"></span><br>\n");
      out.write("                                    <div>\n");
      out.write("                                        <span id =\"z\" style=\"color: red;\"> </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <div class=\"entering\">\n");
      out.write("                            <center> \n");
      out.write("                                <input type=\"submit\" value=\"Submit\" style=\"padding: 3px; margin-top: 7px;\">\n");
      out.write("                            </center>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("\n");
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
