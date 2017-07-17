<!DOCTYPE html>
<html lang="en">
    <%
        if (session.getAttribute("uname") == null) {
            response.sendRedirect("index.jsp");
        }
    %>
    <head>
        <title>Steganography | Encryption</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
        <script type="text/javascript" src="js/jquery-1.4.2.js" ></script>
        <script type="text/javascript" src="js/cufon-yui.js"></script>
        <script type="text/javascript" src="js/cufon-replace.js"></script>
        <script type="text/javascript" src="js/CabinSketch_700.font.js"></script>
        <script type="text/javascript" src="js/EB_Garamond_400.font.js"></script>
    </head>
    <body id="page5">
        <!-- START PAGE SOURCE -->
        <div class="main">
            <header>
                <div class="wrapper">
                    <nav>
                        <ul id="menu">
                            <li><a href="home.jsp"><span>H</span>ome</a></li>
                            <li id="menu_active"><a href="encryption.jsp"><span>E</span>ncryption</a></li>
                            <li><a href="decryption.jsp"><span>D</span>ecryption</a></li>
                            <li><a href="aboutus.jsp"><span>A</span>bout Us</a></li>
                            <li><a href="LogoutHandler"><span>L</span>ogout</a></li>
                        </ul>
                    </nav>
                </div>
                <h1><a href="home.jsp" id="logo">Steganography</a></h1>
            </header>
            <section id="content">
                <div class="wrapper">
                    <article class="col1">
                        <h2>Encryption</h2>
                        <p><strong>Welcome ${sessionScope.uname}</strong></p>
                        <form action="EncryptServlet" method="post" enctype="multipart/form-data" id="ContactForm">
                            <div class="wrapper"> <span>Image(*.jpg) : </span>
                                <input type="file" name="srcimage" accept="image/*"/>
                            </div>
                            <div class="wrapper"> <span>Text (*.txt) : </span>
                                <input type="file" name="srctext" accept="text/*"/>
                            </div>
                            <div class="wrapper"> <span>Pass-phrase : </span>
                                <input type="password" name="password" class="input"/>
                            </div>
                            <input type="submit" value="Encrypt" class="send"/> 
                        </form>
                    </article>
                    <article class="col2">
                        <h3>Latest Works</h3>
                        <ul class="ul_works">
                            <li><a href="#"><img src="images/page1_img1.png" alt=""></a></li>
                            <li><a href="#"><img src="images/page1_img2.png" alt=""></a></li>
                        </ul>
                        <h4>Tweet Us</h4>
                        <div class="tweets">
                            <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem.</p>
                            <p>Accusantium doloremque laudatium, totam rem aperiam, eaque ipsa.</p>
                            <p>Nemo enim ipsam voluptatem quia voluptas.</p>
                            <p>Nemo enim ipsam voluptatem quia voluptas.</p>
                        </div>
                    </article>
                </div>
            </section>            
        </div>
        <script type="text/javascript">Cufon.now();</script>
        <!-- END PAGE SOURCE -->
</html>