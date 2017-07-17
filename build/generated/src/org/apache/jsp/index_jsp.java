package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                        <ul id=\"menu\">\r\n");
      out.write("                            <li id=\"menu_active\"><a href=\"index.html\"><span>A</span>bout</a></li>\r\n");
      out.write("                            <li><a href=\"services.html\"><span>S</span>ervices</a></li>\r\n");
      out.write("                            <li><a href=\"gallery.html\"><span>G</span>allery</a></li>\r\n");
      out.write("                            <li><a href=\"privacy.html\"><span>P</span>rivacy</a></li>\r\n");
      out.write("                            <li><a href=\"contacts.html\"><span>C</span>ontacts</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h1><a href=\"index.html\" id=\"logo\">DesignStudio.com</a></h1>\r\n");
      out.write("            </header>\r\n");
      out.write("            <section id=\"content\">\r\n");
      out.write("                <div class=\"wrapper\">\r\n");
      out.write("                    <article class=\"col1\">\r\n");
      out.write("                        <h2>About Us</h2>\r\n");
      out.write("                        <div class=\"pad_left1 pad_bot1\">\r\n");
      out.write("                            <div id=\"slider\">\r\n");
      out.write("                                <div id=\"for_img\">\r\n");
      out.write("                                    <div id=\"nivo_slider\"> <img src=\"images/img1.jpg\" alt=\"\"> <img src=\"images/img2.jpg\" alt=\"\"> <img src=\"images/img3.jpg\" alt=\"\"> <img src=\"images/img4.jpg\" alt=\"\"> <img src=\"images/img5.jpg\" alt=\"\"> </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"pad\">\r\n");
      out.write("                                <p><strong>Design Studio</strong> Template is one of free website templates created by TemplateMonster.com team. This website template is optimized for 1024X768 screen resolution. It is also XHTML &amp; CSS valid.</p>\r\n");
      out.write("                                <p>This Free Design Studio Website Template goes with two packages â with PSD source files and without them. PSD source files are available for free for the registered members of Templates.com. The basic package (without PSD source is available for anyone without registration).</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <h2><span>Our Solutions</span></h2>\r\n");
      out.write("                        <div class=\"pad_left1\">\r\n");
      out.write("                            <div class=\"pad_left1\">\r\n");
      out.write("                                <div class=\"wrapper pad_top1\">\r\n");
      out.write("                                    <div class=\"col3\">\r\n");
      out.write("                                        <div class=\"wrapper\">\r\n");
      out.write("                                            <figure class=\"left marg_right1\"><img src=\"images/page1_img3.png\" alt=\"\"></figure>\r\n");
      out.write("                                            <p class=\"cols\"><strong class=\"font1\">Development</strong><br>\r\n");
      out.write("                                                Error sit voluptatem accus antium doloremque laiantium totam rem aperiam, eaque tecto beatae.</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col3 pad_left2\">\r\n");
      out.write("                                        <div class=\"wrapper\">\r\n");
      out.write("                                            <figure class=\"left marg_right1\"><img src=\"images/page1_img5.png\" alt=\"\"></figure>\r\n");
      out.write("                                            <p class=\"cols\"><strong class=\"font1\">Creative Design</strong><br>\r\n");
      out.write("                                                Eorporis suscipit laboriosam, nisi ut aliquid ex ea commodi eum iure reprehenderit qui in ea voluptate.</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"wrapper\">\r\n");
      out.write("                                    <div class=\"col3\">\r\n");
      out.write("                                        <div class=\"wrapper\">\r\n");
      out.write("                                            <figure class=\"left marg_right1\"><img src=\"images/page1_img4.png\" alt=\"\"></figure>\r\n");
      out.write("                                            <div class=\"cols\"><strong class=\"font1\">Planning</strong><br>\r\n");
      out.write("                                                Eius modi tempora incidunt aliquam quaerat enim ad minima veniam, quis nostrum exercitationem ullam.</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col3 pad_left2\">\r\n");
      out.write("                                        <div class=\"wrapper\">\r\n");
      out.write("                                            <figure class=\"left marg_right1\"><img src=\"images/page1_img6.png\" alt=\"\"></figure>\r\n");
      out.write("                                            <div class=\"cols\"><strong class=\"font1\">Effective Strategies</strong><br>\r\n");
      out.write("                                                Velit esse quam nihil molestiae consequatur, vel illumqui dolorem eum fugiat voluptas laiantium totam rem.</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </article>\r\n");
      out.write("                    <article class=\"col2\">\r\n");
      out.write("                        <h3>Latest Works</h3>\r\n");
      out.write("                        <ul class=\"ul_works\">\r\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/page1_img1.png\" alt=\"\"></a></li>\r\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/page1_img2.png\" alt=\"\"></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <h4>Recent Tweets</h4>\r\n");
      out.write("                        <div class=\"tweets\">\r\n");
      out.write("                            <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem.<br>\r\n");
      out.write("                                <a href=\"#\">20 days ago</a></p>\r\n");
      out.write("                            <p>Accusantium doloremque laudatium, totam rem aperiam, eaque ipsa.<br>\r\n");
      out.write("                                <a href=\"#\">36 days ago</a></p>\r\n");
      out.write("                            <p>Nemo enim ipsam voluptatem quia voluptas.<br>\r\n");
      out.write("                                <a href=\"#\">54 days ago</a></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </article>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <footer>\r\n");
      out.write("                <div class=\"wrapper\">\r\n");
      out.write("                    <article class=\"col\">\r\n");
      out.write("                        <h5>Why Us</h5>\r\n");
      out.write("                        <ul class=\"list1\">\r\n");
      out.write("                            <li><a href=\"#\">Sedut perspiciatis</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Unde omnis iste</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Natus error sit </a></li>\r\n");
      out.write("                            <li><a href=\"#\">Volupttem accus</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Ntium doloremque </a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </article>\r\n");
      out.write("                    <article class=\"col pad_left2\">\r\n");
      out.write("                        <h5>Links</h5>\r\n");
      out.write("                        <ul class=\"list1\">\r\n");
      out.write("                            <li><a href=\"#\">Audantium, totam</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Remaperiam, eaque</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Ipsa quae abillo</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Inventore veritatis et </a></li>\r\n");
      out.write("                            <li><a href=\"#\">Quasi architecto </a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </article>\r\n");
      out.write("                    <article class=\"col pad_left2\">\r\n");
      out.write("                        <h5>Follow Us</h5>\r\n");
      out.write("                        <ul class=\"icons\">\r\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/icon1.jpg\" alt=\"\">Facebook</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/icon2.jpg\" alt=\"\">Stumleupon</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/icon3.jpg\" alt=\"\">Twitter</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/icon4.jpg\" alt=\"\">Digg</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><img src=\"images/icon5.jpg\" alt=\"\">RSS Feed</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </article>\r\n");
      out.write("                    <article id=\"newsletter\">\r\n");
      out.write("                        <h5>Newsletter</h5>\r\n");
      out.write("                        <form id=\"newsletter_form\" action=\"#\">\r\n");
      out.write("                            <div class=\"wrapper\">\r\n");
      out.write("                                <input class=\"input\" type=\"text\" value=\"Enter your email here\" onBlur=\"if(this.value=='') this.value='Enter your email here'\" onFocus=\"if(this.value =='Enter your email here' ) this.value=''\" >\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"#\">Subscribe</a>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </article>\r\n");
      out.write("                </div>\r\n");
      out.write("                <article class=\"privacy\"> Copyright &copy; 2010 <a href=\"#\">SiteName</a> - All Rights Reserved<br>\r\n");
      out.write("                    <a href=\"http://all-free-download.com/free-website-templates/\">Free CSS Templates</a> by <a href=\"http://www.templatemonster.com/\">TemplateMonster</a></article>\r\n");
      out.write("                <a href=\"index.html\" class=\"footer_logo\">Design<span>Studio</span>.com</a> </footer>\r\n");
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
      out.write("        <div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>\r\n");
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
