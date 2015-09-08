package com.skyfly33.spring.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by donghoon on 15. 9. 7..
 */
@Controller
@RequestMapping("/")
public class MainController {

    Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/")
    public String home() {
        logger.info("main page!");
        return "home";
    }
}