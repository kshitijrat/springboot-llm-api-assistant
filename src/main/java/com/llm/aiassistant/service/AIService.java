package com.llm.aiassistant.service;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class AIService {
    private final String API_KEY = "YOUR_GEMINI_API_KEY";

    public String getAPIResponse(String question) {
        try {
            String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key="
                    + API_KEY;
            RestTemplate restTemplate = new RestTemplate();
            JSONObject reqBody = new JSONObject();
            reqBody.put("contents", new Object[] {
                    new JSONObject().put("parts", new Object[] {
                            new JSONObject().put("text", question)
                    })
            });

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<String> entity = new HttpEntity<>(reqBody.toString(), headers);

            ResponseEntity<String> response = restTemplate.exchange(
                    url,
                    HttpMethod.POST,
                    entity,
                    String.class);
            JSONObject jsonResponse = new JSONObject(response.getBody());

            return jsonResponse
                    .getJSONArray("candidates")
                    .getJSONObject(0)
                    .getJSONObject("content")
                    .getJSONArray("parts")
                    .getJSONObject(0)
                    .getString("text");

        } catch (Exception e) {
            return "Error calling AI service: " + e.getMessage();
        }
    }
}
