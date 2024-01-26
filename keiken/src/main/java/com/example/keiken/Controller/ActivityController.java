package com.example.keiken.Controller;

import com.example.keiken.entity.LocationWeatherDateTimeRequest;
import com.example.keiken.service.GPT3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @Autowired
    private GPT3Service gpt3Service;

    @PostMapping("/generate-activities")
    public String generateActivities(@RequestBody LocationWeatherDateTimeRequest request) {
        String location = request.getLocation();
        String weather = request.getWeather();
        String dateTime = request.getDateTime();

        return gpt3Service.generateActivitySuggestions(location, weather, dateTime);
    }
}
