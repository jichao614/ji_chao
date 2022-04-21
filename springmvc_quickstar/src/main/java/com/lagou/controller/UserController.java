package com.lagou.controller;

import com.lagou.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/quick")
    public String quick() {
        System.out.println("SpringMVC入门成功！");
        return "success";
    }

    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(required = false) Integer id, @RequestParam(required = false) String username) {
        System.out.println(id);
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/pojoParam")
    public String pojoParam(User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/forward")
    public String forward(Model model) {
        model.addAttribute("username", "拉勾招聘");
        return "forward:/WEB-INF/pages/success.jsp";
    }

    @RequestMapping("/redirect")
    public String redirect(Model model) {
        model.addAttribute("username", "拉勾教育");
        return "redirect:/a.jsp";
    }

    @ResponseBody
    @RequestMapping(value = "/ajaxRequest")
    public List<User> ajaxRequest(@RequestBody List<User> list) {
        System.out.println(list);
        return list;
    }
}
