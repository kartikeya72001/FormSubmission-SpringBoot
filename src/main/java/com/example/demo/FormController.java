package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @GetMapping("edureka")
    public String Edureka(){
        return "edureka.jsp";
    }

    @PostMapping("ViewCustomers")
    public String ViewDetails(@RequestParam("cid") String cid, @RequestParam String cname, @RequestParam String cemail, ModelMap mp){
        mp.put("cid", cid);
        mp.put("cname", cname);
        mp.put("cemail", cemail);
        return "ViewCustomers.jsp";
    }
}
