<%-- 
    Document   : index
    Created on : 14 avr. 2019, 15:43:46
    Author     : Asus
--%>

<%@page import="java.util.Iterator"%>
<%@page import="entity.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 controleur c=new controleur();

%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
    <title>My School Education Category Bootstrap Responsive website Template | Home </title>
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
                          
                            <li><a href="inscriptionformateur.jsp">Inscription Foramteur</a></li>
                            
                            <li><a href="consultationformation.jsp">Nos Formations</a></li>
                            <li><a href="index.jsp">Déconnecter</a></li>
                            <li><a href="inscriptionapprenant.jsp">Inscription Apprenant</a></li>
                        </ul>
                    </nav>
                </div>
                <!-- //nav -->
            </div>
        </div>
    </header>
    <!-- //header -->

   

    <!-- banner bottom -->
  
    <!-- banner bottom -->
  <section class="temps-amkls-bnrbtm py-5" id="about">
       <%
                    
                   int id =Integer.parseInt(request.getParameter("id"));
                   Formateur  f1=new Formateur();
                   f1=c.getform(id);
                    
                    %> 
        <div class="container py-xl-5 py-lg-3">
            <h2 class="title-temps-amk mb-md-5 mb-sm-4 mb-2 text-center font-weight-bold" style="color:red">Bienvenue   <%= f1.getNom() %></h2>
            <div class="row">
                <div class="col-lg-6 text-center" style="width: 200%;">
                    <img src="images/0.jpg" alt="about" class="img-fluid mt-4" />
                </div>
                <div class="col-lg-6 pr-xl-5 mt-4">
                   
                    <h3 class="title-sub mb-4"></h3>
                    <p class="sub-para" ><h4 style="color : bleu ;">Les ressources disponibles sont :</h4></p>
                <br>
                <br>
                    <%
                  
                        Iterator t=f1.getRessources().iterator();
                        Iterator it ;
                        Ressource f=new Ressource();
                         while(t.hasNext())
                        {
                        f=(Ressource)t.next();
                        out.println("<p class='sub-para' style='color : bleu'>");
                        out.println(f.getType() +" : ");
                        out.println("<a href=\"https://www.emse.fr/~dutertre/documents/cours_automatique_1A_jmd_2016.pdf\"style='font-size: 30px; text-decoration: underline; color : #000000 ;' >"+f.getNom()+"</a>" );
                        out.println("</p>");
                         
                        }
                      %>
                       
              
                    
                </div>
            </div>
        </div>
    </section>

    <!-- move top icon -->
    

</body>

</html>