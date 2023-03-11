package controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
  @RequestMapping("/save")
  @ResponseBody
  public String save(){
    System.out.println("User save:");
    return "{'info':'user save'}";
  }

  @RequestMapping("/commonParam")
  @ResponseBody
  public String CommonParam()
  {
    return "{'module':'common param'}";
  }
}
