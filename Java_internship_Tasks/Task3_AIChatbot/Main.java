import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChatBot bot = new ChatBot();

        System.out.println("AI ChatBot Started (type 'bye' to exit)");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine();

            String response = bot.getResponse(input);
            System.out.println("Bot: " + response);

            if (input.equalsIgnoreCase("bye")) {
                break;
            }
        }

        sc.close();
    }
}
