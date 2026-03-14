```markdown
# AI API Assistant (LLM Powered)

A simple Spring Boot backend project that integrates a Large Language Model (LLM) using the Gemini API.

The application exposes a REST API where a user can send a question and receive an AI generated response.

---

## Tech Stack

Java  
Spring Boot  
REST API  
Gemini LLM API  

---

## Project Structure

ai-api-assistant

src/main/java/com/example/aiassistant  
├── AiApiAssistantApplication.java  
├── controller  
│   └── AIController.java  
├── service  
│   └── AIService.java  
└── model  
    └── PromptRequest.java  

src/main/resources  
└── application.properties  

pom.xml  

README.md  

---

## Prerequisites

Before running the project make sure you have:

Java 17 or higher  
Maven  
A Gemini API Key  

---

## How to Run the Project

### Option 1: Using VS Code

1. Open the project folder in VS Code.

2. Make sure the following extensions are installed:
   - Extension Pack for Java
   - Spring Boot Extension Pack

3. Open the file:

AiApiAssistantApplication.java

4. Click the **Run** button above the main method.

The server will start on:

http://localhost:8080

---

### Option 2: Using Terminal

Navigate to the project folder.

Run:

```

mvn spring-boot:run

```

The application will start on port 8080.

---

## API Endpoint

POST /ai/ask

Example URL

```

[http://localhost:8080/ai/ask](http://localhost:8080/ai/ask)

```

---

## Example Request

Body (JSON)

```

{
"question": "Explain microservices in simple terms"
}

```

---

## Example Response

```

Microservices is an architecture where applications are divided into small independent services that communicate through APIs.

```

---

## application.properties Example

Create this file inside:

src/main/resources/application.properties

Example configuration:

```

spring.application.name=ai-api-assistant
server.port=8080

gemini.api.key=YOUR_GEMINI_API_KEY

```

Replace:

```

YOUR_GEMINI_API_KEY

```

with your actual Gemini API key.

---

```

application-example.properties

```

spring.application.name=ai-api-assistant
server.port=8080

gemini.api.key=YOUR_API_KEY_HERE

```

---

## Future Improvements

Add conversation memory  
Add prompt templates  
Add streaming responses  
Add frontend UI for chat interaction
```
