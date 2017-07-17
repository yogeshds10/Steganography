<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Steganography</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
        <script type="text/javascript" src="js/jquery-1.4.2.js" ></script>
        <script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
        <script type="text/javascript" src="js/cufon-yui.js"></script>
        <script type="text/javascript" src="js/cufon-replace.js"></script>
        <script type="text/javascript" src="js/CabinSketch_700.font.js"></script>
        <script type="text/javascript" src="js/EB_Garamond_400.font.js"></script>
    </head>
    <body id="page1">
        <!-- START PAGE SOURCE -->
        <div class="main">
            <header>
                <div class="wrapper">
                    <nav>
                        <ul id="menu">                            
                            <li><a href="aboutus.jsp"><span>A</span>bout Us</a></li>
                            <li><a href="register.jsp"><span>R</span>egister</a></li>
                        </ul>
                    </nav>
                </div>
                <h1><a href="home.jsp" id="logo">Steganography</a></h1>
            </header>
            <section id="content">
                <div class="wrapper">
                    <article class="col1">
                        <div class="pad_left1 pad_bot1">                            
                            <h2>Login Here</h2>
                            <form action="LoginHandler" method="post" id="ContactForm">                                
                                <div class="wrapper"> <span>User Id  </span>
                                    <input type="text" name="userid" class="input"/>
                                </div>
                                <div class="wrapper"> <span>Password  </span>
                                    <input type="password" name="password" class="input"/>
                                </div>
                                <input type="submit" value="send" class="send"/> 
                            </form>
                            <div class="pad">
                                <p><strong>${requestScope.msg}</strong></p>
                            </div>
                        </div>                                                
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
        <script type="text/javascript">
            $(window).load(function() {
                $('#nivo_slider').nivoSlider({
                    effect:'fold', //Specify sets like: 'fold,fade,sliceDown, sliceDownLeft, sliceUp, sliceUpLeft, sliceUpDown, sliceUpDownLeft'
                    slices:7,
                    animSpeed:500,
                    pauseTime:6000,
                    startSlide:0, //Set starting Slide (0 index)
                    directionNav:true, //Next & Prev
                    directionNavHide:false, //Only show on hover
                    controlNav:true, //1,2,3...
                    controlNavThumbs:false, //Use thumbnails for Control Nav
                    controlNavThumbsFromRel:false, //Use image rel for thumbs
                    controlNavThumbsSearch: '.jpg', //Replace this with...
                    controlNavThumbsReplace: '_thumb.jpg', //...this in thumb Image src
                    keyboardNav:true, //Use left & right arrows
                    pauseOnHover:true, //Stop animation while hovering
                    manualAdvance:false, //Force manual transitions
                    captionOpacity:1, //Universal caption opacity
                    beforeChange:function(){},
                    afterChange:function(){},
                    slideshowEnd:function(){} //Triggers after all slides have been shown
                });
            });
        </script>
        <!-- END PAGE SOURCE -->
</html>