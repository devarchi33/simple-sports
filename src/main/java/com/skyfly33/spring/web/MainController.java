package com.skyfly33.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by donghoon on 15. 9. 7..
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
