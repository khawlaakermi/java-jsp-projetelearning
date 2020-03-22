<%-- 
    Document   : identification
    Created on : 14 avr. 2019, 15:45:28
    Author     : Asus
--%>

<%@page import="entity.controleur"%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
    <title>My School Education Category Bootstrap Responsive website Template | Login </title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />
    <meta name="keywords" content="My School Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script>
        addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
    <!-- //Meta tag Keywords -->

    <!-- Custom-Files -->
    <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
    <!-- Bootstrap-CSS -->
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <!-- Style-CSS -->
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <!-- Font-Awesome-Icons-CSS -->
    <!-- //Custom-Files -->

    <!-- Web-Fonts -->
    <link href="//fonts.googleapis.com/css?family=Lora:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext,vietnamese"
        rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext" rel="stylesheet">
    <!-- //Web-Fonts -->
</head>

<body>
    <!-- header -->
    <header>
        <div class="container">
            <div class="header d-lg-flex justify-content-between align-items-center py-2 px-sm-2 px-1">
                <!-- logo -->
                <div id="logo">
                    <h1><a href="index.jsp">Elearning</a></h1>
                </div>
                <!-- //logo -->
                <!-- nav -->
                <div class="nav_temps-amkls ml-lg-5">
                    <nav>
                        <label for="drop" class="toggle">Menu</label>
                        <input type="checkbox" id="drop" />
                        <ul class="menu">
                            <li><a href="index.jsp">Accueil</a></li>
                            <li><a href="#about">About</a></li>
                            <li><a href="inscriptionformateur.jsp">Inscription Foramteur</a></li>
                            
                            <li><a href="consultationformation.jsp">Nos Formations</a></li>
                            <li><a href="identification.jsp">Login</a></li>
                            <li><a href="inscriptionapprenant.jsp">Inscription Apprenant</a></li>
                        </ul>
                    </nav>
                </div>
                <!-- //nav -->
            </div>
        </div>
    </header>
    <!-- //header -->

    <!-- inner banner -->
 <div class="inner-banner-temps-amkls py-5" id="home">
        <div class="container py-xl-5 py-lg-3">
            <!-- login  -->
            <div class="modal-body my-5 pt-4">
                <h3 class="title-temps-amk mb-5 text-center text-wh font-weight-bold  ">Se connecter</h3>
                <form action="connecter" method="post">
                    <div class="form-group">
                        <label class="col-form-label">Identifiant</label>
                        <input type="text" class="form-control" placeholder="login" name="login" required="">
                    </div>
                    <div class="form-group">
                       
                        <input type="password" class="form-control" placeholder="*****" name="pass" required="">
                    </div>
                    <button type="submit" class="btn button-style-temps-amk">connecter</button>
                   
                   
                </form>
               
                
            </div>
       
           
        </div>
    </div>
    <!-- //inner banner -->

 
    <!-- move top icon -->
    <a href="#home" class="move-top text-center">
        <span class="fa fa-angle-double-up" aria-hidden="true"></span>
    </a>
    <!-- //move top icon -->

</body>

</html>
