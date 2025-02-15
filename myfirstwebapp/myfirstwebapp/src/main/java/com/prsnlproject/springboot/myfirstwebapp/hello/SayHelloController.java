package com.prsnlproject.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//Genarally use @component but here we want to explain that is the web application component so using specific annotation of @Controller
@Controller
public class SayHelloController {
//Way to map to the page @RequestMapping and @ResponseBody is used to return to browser the string as is
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello ! What are you doing today ?";
    }


    @RequestMapping("/hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer bf = new StringBuffer();
        bf.append("<html>");
        bf.append("<head>");
        bf.append("<title> My First HTML Page </title>");
        bf.append("</head>");
        bf.append("<body>");
        bf.append("My First HTML Page with a body");
        bf.append("</body>");
        bf.append("</html>");
        return bf.toString();
    }

    //JSP (Veiws)
    
//    @ResponseBody  - We don't want to return whatever is written here , instead just redirect to jsp page
    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
