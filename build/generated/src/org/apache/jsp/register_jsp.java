package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Steganography | Encryption</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .error{border: 2px solid red;}\r\n");
      out.write("            .valid{border: 2px solid green;}\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"page5\">\r\n");
      out.write("        <!-- START PAGE SOURCE -->\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <header>\r\n");
      out.write("                <div class=\"wrapper\">\r\n");
      out.write("                    <nav>\r\n");
      out.write("                        <ul id=\"menu\">                            \r\n");
      out.write("                            <li><a href=\"aboutus.jsp\"><span>A</span>bout Us</a></li>\r\n");
      out.write("                            <li><a href=\"LogoutHandler\"><span>L</span>ogout</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h1><a href=\"index.jsp\" id=\"logo\">Steganography</a></h1>\r\n");
      out.write("            </header>\r\n");
      out.write("            <section id=\"content\">\r\n");
      out.write("                <div class=\"wrapper\">\r\n");
      out.write("                    <article class=\"col1\">\r\n");
      out.write("                        <h2>Registration</h2>\r\n");
      out.write("                        <form action=\"RegisterData\" method=\"post\" id=\"ContactForm\">\r\n");
      out.write("                            <div class=\"wrapper\"> <span>User Id  </span>\r\n");
      out.write("                                <input type=\"text\" id=\"uid\" name=\"uid\" class=\"input\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"wrapper\"> <span>Password  </span>\r\n");
      out.write("                                <input type=\"password\" id=\"password\" name=\"password\" class=\"input\"/>\r\n");
      out.write("                                Comb(6) of No and Char\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"wrapper\"> <span>Name  </span>\r\n");
      out.write("                                <input type=\"text\" id=\"name\" name=\"name\" class=\"input\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"wrapper\"> <span>DOB </span>\r\n");
      out.write("                                <input type=\"text\" id=\"dob\" name=\"dob\" class=\"input\"/>\r\n");
      out.write("                                (yyyy-mm-dd)\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"wrapper\"> <span>Gender </span>\r\n");
      out.write("                                <select id=\"gender\" name=\"gender\" class=\"input\" style=\"height: 25px;width: 214px;\">\r\n");
      out.write("                                    <option value=\"-1\">Select</option>\r\n");
      out.write("                                    <option value=\"male\">Male</option>\r\n");
      out.write("                                    <option value=\"female\">Female</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"wrapper\"> <span>Address </span>\r\n");
      out.write("                                <input type=\"text\" id=\"address\" name=\"address\" class=\"input\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"wrapper\"> <span>phone </span>\r\n");
      out.write("                                <input type=\"text\" id=\"phone\" name=\"phone\" class=\"input\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"wrapper\"> <span>Email-Id </span>\r\n");
      out.write("                                <input type=\"text\" id=\"email\" name=\"email\" class=\"input\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"submit\" value=\"submit\" class=\"send\"/> \r\n");
      out.write("                        </form>\r\n");
      out.write("                        <p><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></p>\r\n");
      out.write("                    </article>\r\n");
      out.write("                    <article class=\"col2\">\r\n");
      out.write("                        <h3>Latest Works</h3>\r\n");
      out.write("                        <ul class=\"ul_works\">\r\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/page1_img1.png\" alt=\"\"></a></li>\r\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/page1_img2.png\" alt=\"\"></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <h4>Tweet Us</h4>\r\n");
      out.write("                        <div class=\"tweets\">\r\n");
      out.write("                            <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem.</p>\r\n");
      out.write("                            <p>Accusantium doloremque laudatium, totam rem aperiam, eaque ipsa.</p>\r\n");
      out.write("                            <p>Nemo enim ipsam voluptatem quia voluptas.</p>\r\n");
      out.write("                            <p>Nemo enim ipsam voluptatem quia voluptas.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </article>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>            \r\n");
      out.write("        </div>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.4.2.js\" ></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/cufon-replace.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/CabinSketch_700.font.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/EB_Garamond_400.font.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/validation.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">Cufon.now();</script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(function(){\r\n");
      out.write("                $('form').submit(function(){\r\n");
      out.write("                    var bool=true;\r\n");
      out.write("                    if(!validateNull(document.getElementById('uid'))){\r\n");
      out.write("                        $('#uid').removeClass().addClass('error');\r\n");
      out.write("                        bool=false;\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $('#uid').removeClass().addClass('valid');\r\n");
      out.write("                    }\r\n");
      out.write("                    if(!validatePassword(document.getElementById('password'))){\r\n");
      out.write("                        $('#password').removeClass().addClass('error');\r\n");
      out.write("                        bool=false;\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $('#password').removeClass().addClass('valid');\r\n");
      out.write("                    }\r\n");
      out.write("                    if(!validateNull(document.getElementById('name'))){\r\n");
      out.write("                        $('#name').removeClass().addClass('error');\r\n");
      out.write("                        bool=false;\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $('#name').removeClass().addClass('valid');\r\n");
      out.write("                    }\r\n");
      out.write("                    if(!validateDate(document.getElementById('dob'))){\r\n");
      out.write("                        $('#dob').removeClass().addClass('error');\r\n");
      out.write("                        bool=false;\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $('#dob').removeClass().addClass('valid');\r\n");
      out.write("                    }\r\n");
      out.write("                    if(!validateSelect(document.getElementById('gender'))){\r\n");
      out.write("                        $('#gender').removeClass().addClass('error');\r\n");
      out.write("                        bool=false;\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $('#gender').removeClass().addClass('valid');\r\n");
      out.write("                    }\r\n");
      out.write("                    if(!validateNull(document.getElementById('address'))){\r\n");
      out.write("                        $('#address').removeClass().addClass('error');\r\n");
      out.write("                        bool=false;\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $('#address').removeClass().addClass('valid');\r\n");
      out.write("                    }\r\n");
      out.write("                    if(!validateMobile(document.getElementById('phone'))){\r\n");
      out.write("                        $('#phone').removeClass().addClass('error');\r\n");
      out.write("                        bool=false;\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $('#phone').removeClass().addClass('valid');\r\n");
      out.write("                    }\r\n");
      out.write("                    if(!validateEmail(document.getElementById('email'))){\r\n");
      out.write("                        $('#email').removeClass().addClass('error');\r\n");
      out.write("                        bool=false;\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $('#email').removeClass().addClass('valid');\r\n");
      out.write("                    }\r\n");
      out.write("                    return bool;\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- END PAGE SOURCE -->\r\n");
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
