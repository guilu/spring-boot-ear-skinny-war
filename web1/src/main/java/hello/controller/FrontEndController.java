package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontEndController {
    @RequestMapping(value="/hola",method = RequestMethod.GET)
    public String hola(){
        return "index";
    }
}
