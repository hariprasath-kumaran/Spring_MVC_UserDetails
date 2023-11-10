# Spring_MVC_UserDetails
# Login Register using Spring-MVC
Developed login and register application using Spring mvc.
 
 
## Description
 
- The user can be able to login and register once login successful, in the home page all the users who have registered will visible.
 
 
## 🛠 Technology used
 
- Spring MVC
- JSP
- JDBC
- Bootstrap
- MySQL
 
## 🛠 Tools used
 
- IntelliJ
- MySQL Workbench
 
## 🔲 Architecture
 
- Controller
 
        1. Home Controller
        2. Register Controller
 
- DAO
 
        1.UserDao
 
- DB
 
        1. Database Connection
 
- Pages
 
      1.index
      2.register
      3.shoform
 
 
## 🔃Working of project
 
 
- Register Controller
 
        - There will be a register button in index.jsp after clicking it, register.jsp page works.
        - Once after submitting the register register controller runs where it will check validation for field required and password match.
        - Finally the index page navigates where the user can login now.
 
- Home Controller

          -login process done in it
 
        - After login, the datum in the workbence will  be stored in the list using home Dao.
        - I used the model.addattribute and set the list.
        - Now the page navigates to the home.jsp page where the list will be looped and displayed in the table.
## For Storage purpose,
 
Used MySQL workbench for Storage purpose.
