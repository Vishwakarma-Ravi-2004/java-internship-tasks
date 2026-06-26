public class ChatBot {

    public String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        }

        else if (input.contains("name")) {
            return "I am Java AI ChatBot.";
        }

        else if (input.contains("how are you")) {
            return "I am fine. Thanks for asking!";
        }

        else if (input.contains("java")) {
            return "Java is an object-oriented programming language.";
        }

        else if (input.contains("bye")) {
            return "Goodbye! Have a nice day.";
        }

        else {
            return "Sorry, I don't understand.";
        }
    }
}
