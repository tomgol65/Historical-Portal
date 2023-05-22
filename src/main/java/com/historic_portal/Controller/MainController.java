package com.historic_portal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/Iws")
    public String Iws(){
        return "Iws";
    }
    @GetMapping("/IIws")
    public String IIws(){
        return "IIws";

    }
    @GetMapping("/xxlecie")
    public String xxlecie(){
        return "xxlecie";

    }
    @GetMapping("/gallery")
    public String gallery(){
        return "gallery";

    }
    @GetMapping("/gallery_show")
    public String gallery_show(){
        return "gallery_show";

    }
}
