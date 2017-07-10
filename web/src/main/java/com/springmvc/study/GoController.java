
package com.springmvc.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/7/10 0010.
 */
@Controller
public class GoController {

    @RequestMapping(value = {"/"},method = {RequestMethod.HEAD})
    public String head(){
        return "springmvc.jsp";
    }

    @RequestMapping(value = {"/index","/"},method = {RequestMethod.GET})
    public String index(Model model) throws  Exception{
        model.addAttribute("msg","go go go!");
        return "springmvc.jsp";
    }
}
