package com.zking.crm.client.controller;


import com.zking.crm.role.controller.ParentController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/input")
public class InputController extends ParentController {

    public InputController() {
        super();
    }


    @RequestMapping("/{dir}/{page}")
    public String doForward(@PathVariable String dir, @PathVariable String page) {
        String path = dir + "/" + page;
        return path;
    }

    @RequestMapping("/{page}")
    public String doForward3( @PathVariable String page) {
        String path =page;
        return path;
    }



    //权限认证的跳转
    @RequestMapping("/{dir1}/{dir2}/{page}")
    public String doForward2(@PathVariable String dir1,@PathVariable String dir2,
                              @PathVariable String page) {

       if(!subject.hasRole("usrname")){
           return "";
       }




        return null;
    }

}



