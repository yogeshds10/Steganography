package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");

        if (session.getAttribute("uname")!=null) {
            response.sendRedirect("index.jsp");
        }
    
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Steganography</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.4.2.js\" ></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.nivo.slider.pack.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/cufon-replace.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/CabinSketch_700.font.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/EB_Garamond_400.font.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"page1\">\r\n");
      out.write("        <!-- START PAGE SOURCE -->\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <header>\r\n");
      out.write("                <div class=\"wrapper\">\r\n");
      out.write("                    <nav>\r\n");
      out.write("\r\n");
      out.write("                        <ul id=\"menu\">\r\n");
      out.write("                            <li id=\"menu_active\"><a href=\"home.jsp\"><span>H</span>ome</a></li>\r\n");
      out.write("                            <li><a href=\"encryption.jsp\"><span>E</span>ncryption</a></li>\r\n");
      out.write("                            <li><a href=\"decryption.jsp\"><span>D</span>ecryption</a></li>\r\n");
      out.write("                            <li><a href=\"aboutus.jsp\"><span>A</span>bout Us</a></li>\r\n");
      out.write("                            <li><a href=\"index.jsp\"><span>L</span>ogout</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h1><a href=\"home.jsp\" id=\"logo\">Steganography</a></h1>\r\n");
      out.write("            </header>\r\n");
      out.write("            <section id=\"content\">\r\n");
      out.write("                <div class=\"wrapper\">\r\n");
      out.write("                    <article class=\"col1\">\r\n");
      out.write("                        <h2>Home</h2>\r\n");
      out.write("                        <p><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></p>\r\n");
      out.write("                        <div class=\"pad_left1 pad_bot1\">\r\n");
      out.write("                            <div id=\"slider\">\r\n");
      out.write("                                <div id=\"for_img\">\r\n");
      out.write("                                    <div id=\"nivo_slider\"> <img src=\"images/img1.jpg\" alt=\"\"> <img src=\"images/img2.jpg\" alt=\"\"> <img src=\"images/img3.jpg\" alt=\"\"> <img src=\"images/img4.jpg\" alt=\"\"> <img src=\"images/img5.jpg\" alt=\"\"> </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                            <div class=\"pad\">\r\n");
      out.write("                                <p><strong>Your Content Here</strong></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>                                                \r\n");
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
      out.write("        <script type=\"text/javascript\">Cufon.now();</script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(window).load(function() {\r\n");
      out.write("                $('#nivo_slider').nivoSlider({\r\n");
      out.write("                    effect:'fold', //Specify sets like: 'fold,fade,sliceDown, sliceDownLeft, sliceUp, sliceUpLeft, sliceUpDown, sliceUpDownLeft'\r\n");
      out.write("                    slices:7,\r\n");
      out.write("                    animSpeed:500,\r\n");
      out.write("                    pauseTime:6000,\r\n");
      out.write("                    startSlide:0, //Set starting Slide (0 index)\r\n");
      out.write("                    directionNav:true, //Next & Prev\r\n");
      out.write("                    directionNavHide:false, //Only show on hover\r\n");
      out.write("                    controlNav:true, //1,2,3...\r\n");
      out.write("                    controlNavThumbs:false, //Use thumbnails for Control Nav\r\n");
      out.write("                    controlNavThumbsFromRel:false, //Use image rel for thumbs\r\n");
      out.write("                    controlNavThumbsSearch: '.jpg', //Replace this with...\r\n");
      out.write("                    controlNavThumbsReplace: '_thumb.jpg', //...this in thumb Image src\r\n");
      out.write("                    keyboardNav:true, //Use left & right arrows\r\n");
      out.write("                    pauseOnHover:true, //Stop animation while hovering\r\n");
      out.write("                    manualAdvance:false, //Force manual transitions\r\n");
      out.write("                    captionOpacity:1, //Universal caption opacity\r\n");
      out.write("                    beforeChange:function(){},\r\n");
      out.write("                    afterChange:function(){},\r\n");
      out.write("                    slideshowEnd:function(){} //Triggers after all slides have been shown\r\n");
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
