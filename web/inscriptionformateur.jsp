<%-- 
    Document   : inscriptionformateur
    Created on : 14 avr. 2019, 15:46:38
    Author     : Asus
--%>

<%@page import="org.hibernate.Hibernate"%>
<%@page import="entity.Module"%>
<%@page import="java.util.Set"%>
<%@page import="entity.Formation"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="entity.controleur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html lang="zxx">

<head>
    <title>My School Education Category Bootstrap Responsive website Template | Register </title>
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
            <!-- register  -->
            <div class="modal-body mt-md-2 mt-5">
                <h3 class="title-temps-amk mb-5 text-center text-wh font-weight-bold">Formateur Inscription</h3>
                <form action="ajouterFormateur" method="post">
                    <div class="form-group">
                        <label class="col-form-label">Nom</label>
                        <input type="text" class="form-control" placeholder="nom et prenom" name="nom" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Email</label>
                        <input type="email" class="form-control" placeholder="loremipsum@email.com" name="email"
                            required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Ancienette</label>
                        <input type="text" class="form-control" placeholder="ancienette" name="ancienette" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Domaine</label>
                        <input type="text" class="form-control" placeholder="domaine" name="domaine" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Login</label>
                        <input type="text" class="form-control" placeholder="login" name="login" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Mot de passe</label>
                        <input type="password" class="form-control" placeholder="*****" name="pass" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Confirmer Mot de passe</label>
                        <input type="password" class="form-control" placeholder="*****" name="Password" required="">
                    </div>
                   <label class="col-form-label" style="font-weight: bold; font-size: 20px;" >Nos Formations :</label>
                   <br>
                       
                        <%
                        controleur c=new controleur();
                        List res=c.getallformation();
                        Iterator t=res.iterator();
                        Iterator it ;
                        Module m=null;
                         while(t.hasNext())
                        {
                        Formation f=(Formation)t.next();
                        out.println("<label class='col-form-label' style='font-size: 19px;'>");
                        out.println("<input type='checkbox'  name='id' value ="+f.getIdFormation()+">"+f.getNom());
                       
                        Set<Module> res1=f.getModules();
                      
                        for(Module s : res1)
                        { 
                        out.println("<br>") ;
                        out.println("<label class='col-form-label1' style='font-size: 17px;'>");
                        out.println("<input type='checkbox' value ="+s.getId()+">"+s.getNom());
                        
                        out.println("</label>");
                        out.println("<br>");
                        }
                        
                       
                        out.println("</label>");
                        out.println("<br>");
                       
                          }

                          %>
                          <br>
                        
                          <br>
                   
                    
                    <button type="submit"  class="btn button-style-temps-amk">Inscrire</button>
                </form>
            </div>
          
            <!-- //register -->
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
