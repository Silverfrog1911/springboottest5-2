package com.springboottest5.test5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {


    @RequestMapping("/page")
    public String index(Model model){
        // 页面位置 /WEB-INF/views/page1.jsp
        //model.addAttribute("content"+ "（第二种）");
        //ModelAndView mav = new ModelAndView("HelloWorld");
        return "HelloWorld";
    }
    @RequestMapping("/page2")
    public String index2(Model model){
        // 页面位置 /WEB-INF/views/page1.jsp
        //model.addAttribute("content"+ "（第二种）");
        //ModelAndView mav = new ModelAndView("HelloWorld");
        return "HelloWorld2";
    }
    @RequestMapping("/page3")
    public String index3(Model model){
        // 页面位置 /WEB-INF/views/page1.jsp
        //model.addAttribute("content"+ "（第二种）");
        //ModelAndView mav = new ModelAndView("HelloWorld");
        return "HelloWorld";
    }
}
