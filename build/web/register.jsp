<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Steganography | Registration</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all">
        <style type="text/css">
            
        </style>
    </head>
    <body id="page5">
        <!-- START PAGE SOURCE -->
        <div class="main">
            <header>
                <div class="wrapper">
                    <nav>
                        <ul id="menu">                            
                            <li><a href="aboutus.jsp"><span>A</span>bout Us</a></li>
                            <li><a href="LogoutHandler"><span>L</span>ogout</a></li>
                        </ul>
                    </nav>
                </div>
                <h1><a href="index.jsp" id="logo">Steganography</a></h1>
            </header>
            <section id="content">
                <div class="wrapper">
                    <article class="col1">
                        <h2>Registration</h2>
                        <form action="RegisterData" method="post" id="ContactForm">
                            <div class="wrapper"> <span>User Id  </span>
                                <input type="text" id="uid" name="uid" class="input"/>
                                <p class="errortext" id="euid"></p>
                            </div>
                            <div class="wrapper"> <span>Password  </span>
                                <input type="password" id="password" name="password" class="input"/>
                                Comb(6) of No and Char
                                <p class="errortext" id="epwd"></p>
                            </div>
                            <div class="wrapper"> <span>Name  </span>
                                <input type="text" id="name" name="name" class="input"/>
                                <p class="errortext" id="ename"></p>
                            </div>
                            <div class="wrapper"> <span>DOB </span>
                                <input type="text" id="dob" name="dob" class="input"/>
                                (yyyy-mm-dd)
                                <p class="errortext" id="edob"></p>
                            </div>
                            <div class="wrapper"> <span>Gender </span>
                                <select id="gender" name="gender" class="input" style="height: 25px;width: 200px;">
                                    <option value="-1">Select</option>
                                    <option value="male">Male</option>
                                    <option value="female">Female</option>
                                </select>
                                <p class="errortext" id="egender"></p>
                            </div>
                            <div class="wrapper"> <span>Address </span>
                                <input type="text" id="address" name="address" class="input"/>
                                <p class="errortext" id="eaddress"></p>
                            </div>
                            <div class="wrapper"> <span>phone </span>
                                <input type="text" id="phone" name="phone" class="input"/>
                                <p class="errortext" id="ephone"></p>
                            </div>
                            <div class="wrapper"> <span>Email-Id </span>
                                <input type="text" id="email" name="email" class="input"/>
                                <p class="errortext" id="eemail"></p>
                            </div>
                            <input type="submit" value="submit" class="send"/> 
                        </form>
                        <p><strong>${requestScope.msg}</strong></p>
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
        <script type="text/javascript" src="js/jquery-1.4.2.js" ></script>
        <script type="text/javascript" src="js/cufon-yui.js"></script>
        <script type="text/javascript" src="js/cufon-replace.js"></script>
        <script type="text/javascript" src="js/CabinSketch_700.font.js"></script>
        <script type="text/javascript" src="js/EB_Garamond_400.font.js"></script>
        <script type="text/javascript" src="js/validation.js"></script>
        <script type="text/javascript">Cufon.now();</script>
        <script type="text/javascript">
            $(function(){
                $('form').submit(function(){
                    var bool=true;
                    if(!validateNull(document.getElementById('uid'))){
                        $('#uid').removeClass().addClass('error');
                        $('#euid').text("Please Enter Your UID");
                        bool=false;
                    }else{
                        $('#uid').removeClass().addClass('valid');
                        $('#euid').hide();
                    }
                    if(!validatePassword(document.getElementById('password'))){
                        $('#password').removeClass().addClass('error');
                        $('#epwd').text("Please Enter Your Password");
                        bool=false;
                    }else{
                        $('#password').removeClass().addClass('valid');
                        $('#epwd').hide();
                    }
                    if(!validateNull(document.getElementById('name'))){
                        $('#name').removeClass().addClass('error');
                        $('#ename').text("Please Enter Your Name");
                        bool=false;
                    }else{
                        $('#name').removeClass().addClass('valid');
                        $('#ename').hide();
                    }
                    if(!validateDate(document.getElementById('dob'))){
                        $('#dob').removeClass().addClass('error');
                        $('#edob').text("Please Enter Your DOB");
                        bool=false;
                    }else{
                        $('#dob').removeClass().addClass('valid');
                        $('#edob').hide();
                    }
                    if(!validateSelect(document.getElementById('gender'))){
                        $('#gender').removeClass().addClass('error');
                        $('#egender').text("Please Enter Select Your Gender");
                        bool=false;
                    }else{
                        $('#gender').removeClass().addClass('valid');
                        $('#egender').hide();
                    }
                    if(!validateNull(document.getElementById('address'))){
                        $('#address').removeClass().addClass('error');
                        $('#eaddress').text("Please Enter Your Address");
                        bool=false;
                    }else{
                        $('#address').removeClass().addClass('valid');
                        $('#eaddress').hide();
                    }
                    if(!validateMobile(document.getElementById('phone'))){
                        $('#phone').removeClass().addClass('error');
                        $('#ephone').text("Please Enter Your Proper Phone No");
                        bool=false;
                    }else{
                        $('#phone').removeClass().addClass('valid');
                        $('#ephone').hide();
                    }
                    if(!validateEmail(document.getElementById('email'))){
                        $('#email').removeClass().addClass('error');
                        $('#eemail').text("Please Enter Your Proper Email-Id");
                        bool=false;
                    }else{
                        $('#email').removeClass().addClass('valid');
                        $('#eemail').hide();
                    }
                    return bool;
                });
            });
        </script>
        <!-- END PAGE SOURCE -->
</html>