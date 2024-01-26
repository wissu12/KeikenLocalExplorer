package com.example.keiken.Controller;

import com.example.keiken.service.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api")
public class DateTimeController {

    private final DateTimeService dateTimeService;

    @Autowired
    public DateTimeController(DateTimeService dateTimeService) {
        this.dateTimeService = dateTimeService;
    }

    @GetMapping("/current-datetime-and-location")
    public String getCurrentDateTimeAndLocation(Model model) {
        String currentDateTime = dateTimeService.getCurrentDateTime();
        model.addAttribute("currentDateTime", "Date et heure actuelles : " + currentDateTime);
        return "location";
    }

    @GetMapping("/")
    public String welcome(Model model) {

        return "index";
    }
    @GetMapping("/get-activity")
    public String activity(Model model) {

        return "activity";
    }
}
