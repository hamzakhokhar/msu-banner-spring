package com.msubanner.spring.msubannerspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for home page.
 *
 * @author team 3
 */
@Controller
class HomeController {

    /**
     * Display home page.
     * @return index page
     */
    @GetMapping("/")
    String home() {
        return "index";
    }
}
