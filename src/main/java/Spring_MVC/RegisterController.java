package Spring_MVC;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class RegisterController {
    @RequestMapping(value ="/register",method= RequestMethod.GET)
    public String showform(){
        return "register";
    }
    @RequestMapping(value ="/register",method= RequestMethod.POST)
    public String registeruser(@RequestParam("username") String username, @RequestParam("password") String password){
        return null;

    }
}
