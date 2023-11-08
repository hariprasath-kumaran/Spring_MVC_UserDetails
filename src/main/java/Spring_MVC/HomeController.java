package Spring_MVC;

import Dao.UserDao;
import Db.DbConnection;
import Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.SQLException;

@Controller
public class HomeController {
    private Connection connection;
    private  UserDao userDao;
    public HomeController() throws SQLException, ClassNotFoundException {
        connection = DbConnection.getConnection();
    }

    @RequestMapping("/")
    public String showpage(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password")String password,Model model) throws SQLException, NullPointerException, ClassNotFoundException {
        userDao=new UserDao();
        User valid=userDao.loginuser(username,password);
        if(valid!=null)
        {
            model.addAttribute("username",User.getUsername());
            model.addAttribute("password",User.getPassword());
            model.addAttribute("language",User.getLanguage());
            model.addAttribute("gender",User.getGender());
            model.addAttribute("country",User.getCountry());
            model.addAttribute("state",User.getState());

        }
        return "shoform";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/registeredForm")
    public  String registereduser(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("language") String language,@RequestParam("country") String country,@RequestParam("state") String state,@RequestParam("gender") String gender,Model model) throws SQLException, ClassNotFoundException {
         UserDao userDao1=new UserDao();
        String registered=userDao1.register(username,password,gender,country,state,language);
        if(registered!=null)
        {
           }
        return "index";
    }



}
