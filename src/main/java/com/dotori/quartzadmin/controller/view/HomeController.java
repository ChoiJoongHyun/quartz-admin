package com.dotori.quartzadmin.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping(value = { "", "triggers", "cron/triggers", "simple/triggers", "about" })
    public String triggers (Model model) {

        model.addAttribute("title", "Qrtz Scheduler CMS");
        model.addAttribute("name", "최중현");

        return "index";
    }
}
