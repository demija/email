package ba.gabela.email.controller;

import ba.gabela.email.database.model.Email;
import ba.gabela.email.service.impl.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private EmailServiceImpl emailService;

    @GetMapping("/")
    public final String home(Model model) {
        model.addAttribute("email", new Email());
        model.addAttribute("history", false);
        return "index";
    }

    @PostMapping("/send")
    public final String sendEmail(@Valid Email email, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("history", false);
            return "index";
        }

        emailService.saveEmail(email);
        return "redirect:/";
    }

    @PostMapping("/cancel")
    public final String cancelEmail(Model model) {
        return "redirect:/";
    }

    @GetMapping("/history")
    public final String showHistory(Model model) {
        model.addAttribute("history", true);
        model.addAttribute("listOfEmails", emailService.getListOfEmails());
        return "index";
    }
}
