package com.jeven.library.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jeven on 2019/1/27.
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/UserLogin")
    public String toUserLogin() {
        return "student/login";
    }
    @RequestMapping("/AdminLogin")
    public String toAdminLogin() {
        return "admin/login";
    }
    @RequestMapping("/Register")
    public String toRegister() {
        return "student/register";
    }
    @RequestMapping("/adminBook")
    public String toadminBook() {
        return "admin/adminBook";
    }

    @RequestMapping("/adminUser")
    public String toadminUser() {
        return "admin/adminUser";
    }

    @ResponseBody
    @RequestMapping(value = "/toUserInfo/{id}", method = RequestMethod.GET)
    public ModelAndView jumpToProjectInfoPage(@PathVariable("id") String id) {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("id", id);
        mav.setViewName("admin/userInfo");
        return mav;
    }

    @ResponseBody
    @RequestMapping(value = "/toBookInfo/{id}", method = RequestMethod.GET)
    public ModelAndView jumpToBookInfoPage(@PathVariable("id") String id) {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("id", id);
        mav.setViewName("admin/bookInfo");
        return mav;
    }

    @ResponseBody
    @RequestMapping(value = "/bookCenter/{id}", method = RequestMethod.GET)
    public ModelAndView jumpTobookCenterPage(@PathVariable("id") String id) {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("id", id);
        mav.setViewName("student/tushu");
        return mav;
    }


    @ResponseBody
    @RequestMapping(value = "/userCenter/{id}", method = RequestMethod.GET)
    public ModelAndView jumpTouserCenterPage(@PathVariable("id") String id) {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("id", id);
        mav.setViewName("student/userInfo");
        return mav;
    }


    @ResponseBody
    @RequestMapping(value = "/readBook/{id}", method = RequestMethod.GET)
    public ModelAndView jumpToreadBookPage(@PathVariable("id") String id) {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("id", id);
        mav.setViewName("student/read");
        return mav;
    }
}
