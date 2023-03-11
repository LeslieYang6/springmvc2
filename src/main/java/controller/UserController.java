package controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UserController {
  @RequestMapping("/save")
  @ResponseBody
  public String save(){
    System.out.println("User save:");
    return "{'info':'firstSpringmvc'}";
  }
}
