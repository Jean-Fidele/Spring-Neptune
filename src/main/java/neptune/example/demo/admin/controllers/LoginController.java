package neptune.example.demo.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/")
public class LoginController {

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

}
