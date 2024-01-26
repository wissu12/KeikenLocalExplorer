package com.example.keiken.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GPT3Service {

    @Value("${openai.apiKey}")
    private String apiKey; // Add your OpenAI API key to application.properties

    private final String apiUrl = "https://api.openai.com/v1/engines/davinci-codex/completions";

    public String generateActivitySuggestions(String location, String weather, String dateTime) {
        RestTemplate restTemplate = new RestTemplate();

        String prompt = "Proposez des activités pour la localisation: [adresse], conditions météorologiques: [description du temps], heure actuelle: [heure]";
        String promptWithValues = prompt.replace("[adresse]", location)
                .replace("[description du temps]", weather)
                .replace("[heure]", dateTime);

        String requestBody = "{\"prompt\": \"" + promptWithValues + "\"}";

        String accessToken = "Bearer " + apiKey;

        String result = restTemplate.postForObject(apiUrl, requestBody, String.class);
        return result;
    }
}
