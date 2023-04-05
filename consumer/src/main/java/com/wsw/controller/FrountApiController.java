package com.wsw.controller;

import com.wsw.bean.Boss;
import com.wsw.entity.User;
import com.wsw.service.IUserService;
import com.wsw.service.RuoZhiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangsiwei
 * @Date: 2022/5/19 15:40
 * @Description:
 */
@RestController
@RequestMapping("/consumer-api")
public class FrountApiController {



    @Autowired
    RuoZhiService ruoZhiService;

    @GetMapping("/get/boss")
    public Boss fetchASB(){
        return ruoZhiService.giveMeASB();
    }

    @GetMapping("/get/user")
    public User fetchUser(@RequestParam(name = "user_name")String name){
        return ruoZhiService.giveMeOneUser(name);
    }

}
