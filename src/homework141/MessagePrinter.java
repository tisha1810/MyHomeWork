package homework141;

public class MessagePrinter implements Printer {
    private Message message;
    private static String sender;
    private static String text;

    public MessagePrinter(Message message) {
        this.message = message;
        sender = message.sender;
        text = message.text;
    }

    @Override
    public void print(Message message) {
        if (sender.isEmpty() & text.isEmpty()) {
            System.out.println("Processing empty message from unknown user...");
        } else if (text.isEmpty()) {
            System.out.printf("User: '%s', send empty message!", sender);
        } else if (sender.isEmpty()) {
            System.out.printf("Unknown user send message: < %s >", text);
        } else {
            System.out.printf("User: '%s', send message: < %s >", sender, text);
        }
        Printer printer = new Printer() {
            @Override
            public void print(Message message) {
                System.out.println("Processing empty message from unknown user...");
            }
        };
        if (sender == null & text == null) {
            printer.print(message);
        }
    }

    public static class Message {
        private String sender;
        private String text;

        public Message(String sender, String text) {
            this.sender = sender;
            this.text = text;
        }
    }

    public static void main(String[] args) {
        Message message = new Message("Boris", "hello, i am Boris!");
        MessagePrinter messagePrinter = new MessagePrinter(message);
        messagePrinter.print(message);
    }
}

