package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {
       if (message==null || message.trim().isEmpty()){
           return "Please say something.";
       }
        String s=message.trim().toLowerCase();
        switch (s) {
            case "hi":
                return pick(type,
                        "Hello. How may I assist you today?",
                        "Hey there! 😊 How can I help?",
                        "Hello. How can I help?");
            case "hello":
                return pick(type,
                        "Hello. How may I assist you today?",
                        "Hi! 👋 What’s up?",
                        "Hello. How can I help?");
            case "how are you":
                return pick(type,
                        "I am functioning properly. How may I assist you?",
                        "Doing great! 😄 How can I help?",
                        "I’m good. How can I help?");
            case "i need help":
                return pick(type,
                        "I can assist with that. Please provide more details.",
                        "I’ve got you! 🙂 Tell me a bit more.",
                        "Share details; I’ll help.");
            case "can you help me with my account":
                return pick(type,
                        "Certainly. Please describe the account issue.",
                        "Sure thing! 😊 What’s wrong with the account?",
                        "Describe the account issue…");
            case "thanks":
                return pick(type,
                        "You are welcome.",
                        "Anytime! 🙌",
                        "You’re welcome.");
            case "bye":
                return pick(type,
                        "Goodbye.",
                        "See you later! 👋",
                        "Goodbye.");
            case "what is your name":
                return pick(type,
                        "I am your virtual assistant.",
                        "I’m your helper bot 🤖",
                        "I’m your assistant.");
            default:
                // any other text
                return pick(type,
                        "Could you clarify your request?",
                        "Could you tell me more?",
                        "Please clarify.");

       }

    }
    private String pick(ReplyType type, String formal, String friendly, String concise) {
        switch (type) {
            case FORMAL:   return formal;
            case FRIENDLY: return friendly;
            case CONCISE:  return concise;
            default:       return concise; // safe default
        }
    }
}

