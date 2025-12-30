package com.mg.webapp1.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // "say-hello" => "Hello! What are you learning today?"

    //Spring looking for a view

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Html Page 111</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Hello Html! What are you learning today?");
        sb.append("</body>");
        return sb.toString();
    }

    //JSP
    //say-hello-jsp => say-hello.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    //Model
    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }


}
