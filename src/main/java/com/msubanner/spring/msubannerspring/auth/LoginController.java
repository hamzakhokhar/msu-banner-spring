package com.msubanner.spring.msubannerspring.auth;

import com.msubanner.spring.msubannerspring.user.AuthUser;
import com.msubanner.spring.msubannerspring.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for login page.
 *
 * @author team 3
 */
@Controller
public class LoginController {
	/**
	 * define user service
	 */
    @Autowired
    private UserService userService;

    /**
     * Signup page display.
     * @param model model
     * @return link redirect
     */
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new AuthUser());

        return "auth/signup";
    }

    /**
     * Signup page post.
     * @param userForm userForm
     * @param bindingResult bindingResult
     * @param model model
     * @return link redirect
     */
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") AuthUser userForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);
        return "redirect:/";
    }

    /**
     * Login page.
     * @param model model
     * @param error error
     * @param logout logout
     * @return link redirect
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Your username and password is invalid.");
        }

        if (logout != null) {
            model.addAttribute("message", "You have been logged out successfully.");
        }

        return "auth/login";
    }
}
