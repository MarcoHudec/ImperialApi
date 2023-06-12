package at.technikum.imperialapi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialApiController {

    double inch ;
    double centi;


    @RequestMapping("/api/CentiToInch")
    public double InchToCenti(@RequestParam double inch)
    {
        return inch * 2.54;
    }


}
