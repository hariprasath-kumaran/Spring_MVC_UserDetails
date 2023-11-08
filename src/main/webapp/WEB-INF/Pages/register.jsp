<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

<section class="vh-100" style="background-color: blue;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-xl-10">
        <div class="card" style="border-radius: 1rem;">
          <div class="row g-0">
            <div class="col-md-2 col-lg-2 d-none d-md-block">
            </div>
            <div class="col-md-7 col-lg-7 d-flex align-items-center">
              <div class="card-body p-7 p-lg-7 text-black">

                <form action="registeredForm">

                  <h5 class="fw-normal mb-0 pb-0" style="letter-spacing: 1px;">Sign up</h5>

                  <div class="form-outline mb-4">
                    <input type="text" id="form2Example17" name="username" class="form-control form-control-lg" />
                    <label class="form-label" for="form2Example17">Username</label>
                  </div>

                  <div class="form-outline mb-4">
                    <input type="password" id="form2Example27"name="password" class="form-control form-control-lg" />
                    <label class="form-label" for="form2Example27">Password<h/label>
                  </div>
                  <ul>language : <br>
                  <li><input type = "checkbox" name = "language" value="c">C</li>
                            <li><input type = "checkbox" name = "language" value="java">java</li>
                              <li> <input type = "checkbox" name = "language" value="python">python</li>
                               <li><input type = "checkbox" name = "language" value=".NEt">.Net</li>
                   </ul>
                  <p>Gender : <input type="radio" name="gender"  value="male">Male <input type="radio" name="gender" value="female">Female</p>
                    <p>Country : <input type="radio" name="country" value="india">India</p>
                    <p>State :  <input type="radio" name="state" value="Tamilnadu">Tamilnadu
                     <input type="radio" name="state" value="kerala">kerala</p></p>



                  <div class="pt-1 mb-4">
                    <button class="btn btn-dark btn-lg btn-block" type="submit" value="register">register</button>
                  </div>
                  <ul>
                </form>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>