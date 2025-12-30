package com.mg.webapp1.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // login => login.jsp
    // localhost:8080/login?name=Gigi
    //
    @RequestMapping("/login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        System.out.println("Request param is : " + name); //NOT for production
        return "login";
    }
}
