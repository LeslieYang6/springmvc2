package controller;

import domain.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

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
  public String CommonParam(String name, int age)
  {
    System.out.println("普通参数传递 name:"+name);
    System.out.println("普通参数传递 age:"+age);
    return "{'module':'common param'}";
  }

  @RequestMapping("/commonParamDifferentName")
  @ResponseBody
  public String CommonParamDifferentName(@RequestParam("name") String userName, int age)
  {
    System.out.println("普通参数传递 name:"+userName);
    System.out.println("普通参数传递 age:"+age);
    return "{'module':'common param different name'}";
  }
/*
  @RequestMapping("/pojoParam")
  @ResponseBody
  public String pojoParam(User user)
  {
    System.out.println("pojo参数传递 user:"+user);
    return "{'module':'pojo param'}";
  }
*/
  @RequestMapping("/pojoContainPojoParam")
  @ResponseBody
  public String pojoContainPojoParam(User user)
  {
    System.out.println("pojo参数传递 user:"+user);
    return "{'module':'pojoContainPojoParam'}";
  }

  @RequestMapping("/arrayParam")
  @ResponseBody
  public String arrayParam(String[] likes)
  {
    System.out.println("pojo参数传递 user:"+ Arrays.toString(likes));
    return "{'module':'arrayParam'}";
  }

  @RequestMapping("/listParam")
  @ResponseBody
  public String listParam(@RequestParam List<String> likes)
  {
    System.out.println("pojo参数传递 user:"+ likes);
    return "{'module':'arrayParam'}";
  }

  @RequestMapping("/listParamForJson1")
  @ResponseBody
  public String listParamForJson1(@RequestBody List<String> likes)
  {
    System.out.println("pojo参数传递 user:"+ likes);
    return "{'module':'arrayParam'}";
  }

  @RequestMapping("/paramForJson")
  @ResponseBody
  public String paramForJson(@RequestBody User user)
  {
    System.out.println("pojo参数传递 user:"+ user);
    return "{'module':'arrayParam'}";
  }

  @RequestMapping("/listParamForJson")
  @ResponseBody
  public String listParamForJson(@RequestBody List<User> user)
  {
    System.out.println("pojo参数传递 user:"+ user);
    return "{'module':'arrayParam'}";
  }


}
