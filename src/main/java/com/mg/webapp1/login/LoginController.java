package com.mg.webapp1.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);
    // login => login.jsp
    // localhost:8080/login?name=Gigi
    //login - view
    // GET, POST
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        //model.put("name", name);
        //logger.debug("Request param is -> {}", name);
        //logger.info("Print at info level");
        //System.out.println("Request param is : " + name); //NOT for production
        return "login";
    }
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {


        //Authentication logic
        //hardcoded username and password
        // username=admin
        // password=gigi123
        if(authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        } else {
            model.put("errorMessage", "Invalid Credentials! Please try again.");
            return "login";
        }
    }
}
