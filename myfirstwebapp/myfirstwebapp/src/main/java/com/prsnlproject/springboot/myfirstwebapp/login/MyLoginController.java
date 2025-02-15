package com.prsnlproject.springboot.myfirstwebapp.login;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.classic.Logger;

@SuppressWarnings("unused")
@Controller
public class MyLoginController {

    private Logger logger = (Logger) LoggerFactory.getLogger(getClass()); 
    private AuthenticationService auth;


    public MyLoginController(AuthenticationService auth){
        super();
        this.auth=auth;
    }

    @RequestMapping(value="login",method=RequestMethod.GET)
    public String gotoLoginPage(){    

        return "login";
    }


    @RequestMapping(value="login",method=RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap model){    
        
        if(auth.authenticate(name, password)){
        model.put("name",name);
        model.put("password",password); 
        return "WelcomePage";
        }

        model.put("errorMessage","Invalid Credential ! Please try Again");
        return "login";
    }
}


//Notes
//Way to map to the page @RequestMapping and @ResponseBody is used to return to browser the string as is
//@ResponseBody  - We don't want to return whatever is written here , instead just redirect to jsp page
//Model -   Pass anyting from your control to login.jsp using a model map  --
//Parameter handling using query param ?name=Amartya in web page - 
// logger.debug("Request param is {}" , name);