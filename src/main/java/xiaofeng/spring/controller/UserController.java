package xiaofeng.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiaofeng.spring.repo.service.UserService;

/**
 * @author lixf
 * @date 2019/4/8
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger log= LoggerFactory.getLogger(Controller.class);

    @Autowired
    private UserService userService;

//因为是RestController 所以不需要标注@ResponseBody
    @RequestMapping(value = "/testReturnPage",method = RequestMethod.GET)
//    @ResponseBody
    public String testReturnPage(String name,Long id){
        userService.findByName("lixf");
        System.out.println(name);
        System.out.println(id);
        return "122";
    }


    @RequestMapping("/findUserByName")
    @ResponseBody
    public String findUserByName(String name, Long id){
        userService.findByName(name);
        System.out.println(name);
        System.out.println(id);
        return "1111";
    }
}
