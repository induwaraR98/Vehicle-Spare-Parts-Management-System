<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form</title>


    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/regstyle.css">
</head>
<body>
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>" >

    <div class="main">
        <section class="signup">
            <div class="container">
                <div class="signup-content">
                    <form method="post" action="register" class="signup-form" id="signup-form">
                        <h2 class="form-title">Create account</h2>
                        <div class="form-group">
                            <input type="text" class="form-input" name="name" id="name" placeholder="Your Name"/>
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-input" name="email" id="email" placeholder="Your Email"/>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-input" name="pass" id="password" placeholder="Password"/>
                            <span toggle="#password" class="zmdi zmdi-eye field-icon toggle-password"></span>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-input" name="re_pass" id="re_password" placeholder="Repeat your password"/>
                        </div>
                        <div class="form-group">
                            <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                            <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all statements in <a href="#" class="term-service">Terms of service</a></label>
                        </div>
                        <div class="form-group form-button ">
                            <input type="submit" name="signup" id="signup" class="form-submit" value="Register"/>
                        </div>
                    </form>
                    <p class="loginhere">
                        Have already an account? <a href="login.jsp" class="loginhere-link">Login here</a>
                    </p>
                </div>
            </div>
        </section>
    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
    


<script type="text/javascript">

var status = document.getElementById("status").value;
if(status == "success"){
	swal("Congrats","Registered Successfully "),("success");
}
if(status == "invalidName"){
	swal("Please Enter Name "),("error");
}
if(status == "invalidEmail"){
	swal("Please Enter Email "),("error");
}
if(status == "invalidPassword"){
	swal("Please Enter Password "),("error");
}
if(status == "invalidConfirmPassword"){
	swal("Password Do Not Match "),("error");
}




</script>

</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>