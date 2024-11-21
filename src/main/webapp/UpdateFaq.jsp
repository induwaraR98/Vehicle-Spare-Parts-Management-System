<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update-Faq</title>
    <link rel="stylesheet" href="css/Header&Footer.css">

<style>
    .formcontainer{
        margin:100px;
        text-align:center;
        margin-bottom:20px;
    }
    .form-control{
        width:600px;
        height:50px;
        border-radius:10px;
        margin-bottom:30px;
    }
    .headings{
        font-size:20px;
    }
    .form-question{
        width:600px;
        height:200px;
        border-radius:10px;
    }
    .btn{
        margin-top:20px;
        background-color:black;
        color:white;
        padding: 8px 30px; 
        margin: 30px 0px;
        border-radius: 20px;
    }
    .btn:hover{
        color:black;
        background:white;
    }
</style>
</head>
<body>

<!-- header begining -->
<div class="header">
  <header>
    <div class="container">
        <div class="navbar">
            <div class="logo">
                <img src="logo.png" alt="logo" width="200px" height="100px">
            </div>
            <nav>
                <ul>
                    <li><a href="">Home</a></li>
                    <li><a href="ProductPage.jsp">Shop</a></li>
                    <li><a href="">Blog</a></li>
                    <li><a href="">About</a></li>
                    <li><a href="">Contact</a></li>
                    <li><a href="">Login</a></li>
                    <li><a href="FAQPage.jsp">FAQ</a></li>
                    <li><a href="">Our story</a></li>
                </ul>
            </nav>
            <a href=""><img src="cart.png" alt="cart" width="60px" height="60px"></a>
           </div> 
           

    </div>
    </div>
</header>
<!-- header ending -->
     

<div class="formcontainer" my-5>
     <form method="post" action="submit">
        <div class="QesContainer">
            <label for="Name" class="headings">Name:</label><br>
            <input type="text" class="form-control" placeholder="" name="Name" autocomplete="off">
        </div>

        <div class="QesContainer">
            <label for="mobile" class="headings">Mobile Number:</label><br>
            <input type="text" class="form-control" placeholder="" name="Contact" autocomplete="off">
        </div>

        <div class="QesContainer">
            <label for="question" class="headings">Question:</label><br>
            <input type="text" class="form-question" placeholder="" name="Question" autocomplete="off">
        </div>

         <button type="submit" name="submit" class="btn">Update</button>
     </form>
</div>

<!-- footer begining -->
<footer class="footer" style="margin-top: 200px;">
    <div class="footer-container">
<div class="footer-row">

<div class="footer-col">
    <h3>CATEGORIES</h3>
    <ul class="footerul">
        <li><a href="#">Engine Parts</a></li>
        <li><a href="#">Interior Parts</a></li>
        <li><a href="#">Exterior and Body Parts</a></li>
        <li><a href="#">Tires and Wheels</a></li>
    </ul>
</div>

<div class="footer-col">
    <h3>HELP</h3>
    <ul class="footerul">
        <li><a href="#">Track Order</a></li>
        <li><a href="#">Returns</a></li>
        <li><a href="#">Shop</a></li>
        <li><a href="#">FAQs</a></li>
        <li><a href="\Online Fashion Store\Login & register\customer_login.html">Login</a></li>
    </ul>
</div>

<div class="footer-col">
    <h3>Get in Touch</h3>
    <p id="GetInTouch">
        Our 'Get in Touch' section is your direct line to our expert support team.<br> 
        Whether you're looking for spare parts, have inquiries about your orders,<br>  
        or need guidance on automotive maintenance, we're just a message or call away. <br>  
        Reach out to us through the provided contact form, email, or phone,and our<br>  
        dedicated team will be ready to assist you promptly. <br> 
    </p>
</div>

<div class="footer-col">
    <h3>FOLLOW US</h3>
    <input type="email" name="email" id="subcribeEmail" placeholder="example@gmail.com">
    <a href="#" class="footerbtn">Subcribe to Email</a>
    <div class="socialMediaIcons">
    <a href="#"><i class="fa-brands fa-facebook"></i></a>
    <a href="#"><i class="fa-brands fa-instagram"></i></a>
    <a href="#"><i class="fa-brands fa-youtube"></i></a>
    <a href="#"><i class="fa-brands fa-twitter"></i></a>
</div>
</div>
</div>
</div>
<div class="copyright">
    <p>Copyright &copy;2023 All right reserved</p>
</div>
</footer>
<!-- footer ending -->

</body>
</html>