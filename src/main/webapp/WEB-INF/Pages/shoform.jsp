<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Students</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
        crossorigin="anonymous"
    />
</head>
<body>
    <div class="container mt-5">
        <h3 class="text-center">Welcome to Our Student Details</h3>
        <div class="row mt-4">
            <div class="col-md-6">
                <h4 class="text-center">Registration Details</h4>
                <br/>
                <ul class="list-unstyled">
                    <li><strong>Username:</strong> ${username}</li>
                    <br/>
                    <li><strong>Password:</strong> ${password}</li>
                    <br/>
                    <li><strong>Country:</strong> ${country}</li>
                    <br/>
                    <li><strong>state:</strong> ${state}</li>
                                        <br/>
                    <li><strong>Language:</strong> ${language}</li>
                    <br/>
                    <li><strong>Gender:</strong> ${gender}</li>
                </ul>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"
    ></script>
</body>
</html>