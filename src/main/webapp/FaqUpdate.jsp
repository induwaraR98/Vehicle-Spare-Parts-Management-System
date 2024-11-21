<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update-Faq</title>
 <link rel="stylesheet" href="css/Header&Footer.css">
  
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700,900&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="fonts/icomoon/style.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/updatedelete.css">

  </head>
  <body>
  
  
<% 
   String fname = request.getParameter("fname");
   String lname = request.getParameter("lname");
   String email = request.getParameter("email");
   String mobile = request.getParameter("mobile");
   String question = request.getParameter("question");
%>

  <div class="content">
    
    <div class="container">
      <div class="row align-items-stretch justify-content-center no-gutters">
        <div class="col-md-7">
          <div class="form h-100 contact-wrap p-5">
            <h3 class="text-center">Let's Update</h3><br>
            <form class="mb-5" method="post" action = "Update" >
              <div class="row">
                <div class="col-md-6 form-group mb-3">
                  <label for="" class="col-form-label">First Name </label>
                  <input type="text" class="form-control" name="FName" id="fname" value ="<%=fname%>" readonly>
                </div>
                <div class="col-md-6 form-group mb-3">
                  <label for="" class="col-form-label">Last Name </label>
                  <input type="text" class="form-control" name="LName" id="lname" value ="<%=lname%> ">
                </div>
              </div>

              <div class="row">
                <div class="col-md-12 form-group mb-3">
                  <label for="budget" class="col-form-label">Email</label>
                  <input type="email" class="form-control" name="Email" id="email" value ="<%=email%> ">
                </div>
              </div>
              
              <div class="row">
                <div class="col-md-12 form-group mb-3">
                  <label for="budget" class="col-form-label">Mobile</label>
                  <input type="text" class="form-control" name="Mobile" id="mobile" value ="<%=mobile%> ">
                </div>
              </div>

              <div class="row mb-5">
                <div class="col-md-12 form-group mb-3">
                  <label for="message" class="col-form-label">Question</label>
                  <input type="text" class="form-control" name="Question" id=" question" value ="<%=question%>" >              
                </div>
              </div>
              <div class="row justify-content-center">
                <div class="col-md-5 form-group text-center">
                     <button type="submit" name="submit" class="btn">Update</button>
                </div>
              </div>
            </form>

            <div id="form-message-warning mt-4"></div> 
            <div id="form-message-success">
              Your message was sent, thank you!
            </div>

          </div>
        </div>
      </div>
    </div>

  </div>
    
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.validate.min.js"></script>
    <script src="js/main.js"></script>

  </body>
</html>