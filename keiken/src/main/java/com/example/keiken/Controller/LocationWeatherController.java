package com.example.keiken.Controller;

import com.example.keiken.entity.LocationWeatherInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LocationWeatherController {

    @PostMapping("/get-activities")
    public ResponseEntity<String> getActivities(@RequestBody LocationWeatherInfo data) {
        // Utilisez les données pour demander des activités à GPT-3
        // Appelez GPT-3 avec les données de localisation et de météo
        // Récupérez la réponse de GPT-3 et renvoyez-la en tant que réponse HTTP

        // Exemple (à remplacer par votre logique réelle avec GPT-3)
        String gptResponse = "Faire une promenade dans le parc.";

        return ResponseEntity.ok(gptResponse);
    }
}
