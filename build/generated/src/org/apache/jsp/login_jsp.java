package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.login_validation;
import java.io.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("         <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Sign in</title>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function myfunction(){\n");
      out.write("                var data_true=0;\n");
      out.write("                var email= document.getElementById(\"Email\").value;\n");
      out.write("                var password = document.getElementById(\"pass\").value;\n");
      out.write("                if(email==null || email==\"\"){\n");
      out.write("                    document.getElementById(\"b\").innerHTML=\"Enter Email Id\";\n");
      out.write("                    data_true=1;\n");
      out.write("                }\n");
      out.write("                var len = password.length;\n");
      out.write("                if(password==null || password==\"\")\n");
      out.write("                {\n");
      out.write("                    data_true=1;\n");
      out.write("                    document.getElementById(\"c\").innerHTML=\"Required Password\";\n");
      out.write("                }\n");
      out.write("               \n");
      out.write("                else if(len<8){\n");
      out.write("                    data_true=1;               \n");
      out.write("                    document.getElementById(\"c\").innerHTML=\"Error Password\";\n");
      out.write("                }\n");
      out.write("                if(data_true==1)\n");
      out.write("                {\n");
      out.write("                    return false;                    \n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" id=\"mynavbar\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"home.jsp\" class=\"navbar-brand\">SEC</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                  \n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav\" >\n");
      out.write("                        <li><a href=\"home.jsp\">Home</a>  </li>\n");
      out.write("                        <li><a href=\"#\">Photo Gallary</a>  </li>\n");
      out.write("                        <li><a href=\"#\">Student Profile</a>  </li>\n");
      out.write("                        <li><a href=\"templete.jsp\">Result</a>  </li>\n");
      out.write("                        <li><a href=\"#\">About us</a>  </li>\n");
      out.write("                        <li><a href=\"#\">Contact</a>  </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"col-sm-1\">\n");
      out.write("                            <div class=\"img-responsive\">\n");
      out.write("                                <a href=\"templete.jsp\"> <img src=\"image/bd_logo.png\" /></a>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <h1>Sylhet Engineering College</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <br>   \n");
      out.write("                <br>\n");
      out.write("                <br>  <br>\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("\n");
      out.write("                    <form action=\"login_validation\" class=\"form-horizontal\" onsubmit=\"return myfunction()\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\" id=\"e\">\n");
      out.write("                            <label  for=\"Email\" class=\"col-lg-2 control-label\">Email</label>\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <input type=\"Email\" class=\"form-control\" id=\"Email\" placeholder=\"Enter Your Email\" name=\"Email\">\n");
      out.write("                            </div>\n");
      out.write("                            <span style=\"color:red;\"></span><br>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <span id =\"b\" style=\"color: red;\"> </span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\" id=\"p\">\n");
      out.write("                            <label  for=\"pass\" class=\"col-lg-2 control-label\">Password</label>\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"pass\" placeholder=\"Enter Your Password\" name=\"password\">\n");
      out.write("                            </div>\n");
      out.write("                            <span style=\"color:red;\"></span><br>\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <span id =\"c\" style=\"color: red;\"> </span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-lg-6 col-lg-offset-2\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-sm btn-info\">Submit</button>                                \n");
      out.write("                                <a href=\"sign_up.jsp\" class=\"btn btn-sm btn-info\">Sign Up</a>\n");
      out.write("                                <a href=\"forgot_pass.jsp\" class=\"danger\">Forgot password</a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    ");

                        String s = (String) request.getAttribute("error");
                        String email=(String) request.getAttribute("email");
                        String pass=(String) request.getAttribute("pass");                      
                        if (s == null || s == "") {
                    
      out.write("\n");
      out.write("                \n");
      out.write("                    ");
 } else {
                    
      out.write("\n");
      out.write("                   \n");
      out.write("                    <script>\n");
      out.write("                        document.getElementById(\"e\").className=\"form-group has-error\";\n");
      out.write("                        document.getElementById(\"p\").className=\"form-group has-error\";\n");
      out.write("                        document.getElementById(\"Email\").value=\"");
      out.print(email);
      out.write("\";\n");
      out.write("                        document.getElementById(\"pass\").value=\"");
      out.print(pass);
      out.write("\";\n");
      out.write("                        document.getElementById(\"b\").innerHTML=\"Invalid Email\";\n");
      out.write("                        document.getElementById(\"c\").innerHTML=\"Invalid Password\";\n");
      out.write("                    </script>\n");
      out.write("\n");
      out.write("                    ");
 }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write(" <footer class=\"footer \">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    \n");
      out.write("                    ");

                        Calendar calendar = new GregorianCalendar();
                        int year = calendar.get(Calendar.YEAR);
                    
      out.write("\n");
      out.write("                    <p class=\"text-muted\">Copyright &COPY 2015 to ");
      out.print(year);
      out.write(" <br>by Department Of CSE All rights reserved </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </footer>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
