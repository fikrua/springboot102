package springboot_102.springboot_102;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @RequestMapping("/home")
    public String homeContrller(Model model){
        model.addAttribute("myVar","say hello to the people");
        model.addAttribute("myvar2","hello Ethiopian people");
        return "homeTemplet";

    }
}
