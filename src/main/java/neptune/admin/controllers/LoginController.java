package neptune.admin.controllers;

import neptune.admin.metiers.IUserMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/")
public class LoginController {

    @Autowired
    private IUserMetier userMetier;

    @RequestMapping(path = "/login")
    public String index() {
        return "admin/login";
    }

    @RequestMapping(path = "/home")
    public String home() {
        return "home";
    }

    @RequestMapping(path = "/admin")
    public String admin() {
        return "admin/index";
    }

    @RequestMapping(path = "/logout")
    public String logout() {
        return "logout";
    }
}
