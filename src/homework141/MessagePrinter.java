package homework141;

public class MessagePrinter implements Printer {

    private final Message message;

    public MessagePrinter(Message message) {
        this.message = message;
    }

    @Override
    public void print() {
        if (message.getText().isEmpty()) {
            System.out.printf("User: '%s', send empty message", message.sender);
        } else if (message.text.isEmpty()) {
            System.out.printf("Unknown user send message: < %s >", message.text);
        } else {
            System.out.printf("User: '%s', send message: < %s >", message.sender, message.text);
        }
        Printer emptyMessage = new Printer() {
            @Override
            public void print() {
                if (message.sender.isEmpty() & message.text.isEmpty()) {
                    System.out.println("Processing empty message, from unknown user...");
                }
            }
        };
    }

    public static class Message {
        private String sender;
        private String text;

        public Message(String sender, String text) {
            this.sender = sender;
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static void main(String[] args) {
        Message message = new Message("Boris", "");
        MessagePrinter messagePrinter = new MessagePrinter(message);
        messagePrinter.print();
    }
}








