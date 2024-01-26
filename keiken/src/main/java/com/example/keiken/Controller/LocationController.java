package com.example.keiken.Controller;

import com.example.keiken.entity.LocationResponse;
import com.example.keiken.entity.LocationWeatherInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class LocationController {

    @GetMapping("/get-location")
    public String getLocationPage() {
        return "openai"; // Cela renverra à votre fichier HTML location.html
    }

    @PostMapping("/save-location-and-weather")
    public ResponseEntity<String> saveLocationAndWeather(@RequestBody LocationWeatherInfo info) {
        // Traitez les informations, par exemple, stockez-les dans une base de données
        System.out.println("Received info: " + info);

        // Vous pouvez appeler un service pour traiter les informations, les stocker dans une base de données, etc.

        // Répondre avec un message de confirmation
        return ResponseEntity.ok("Information received successfully.");
    }


}