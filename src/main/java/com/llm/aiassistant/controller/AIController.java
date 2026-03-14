package com.llm.aiassistant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.llm.aiassistant.model.PromptRequest;
import com.llm.aiassistant.service.AIService;

@RestController
@RequestMapping("/ai")
public class AIController {

    @Autowired
    private AIService aiService;

    @PostMapping("/ask")
    public String askAI(@RequestBody PromptRequest request) {
        return aiService.getAIResponse(request.getQuestion());
    }
}