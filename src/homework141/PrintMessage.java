package homework141;

public class PrintMessage implements Printer {

    private final Message message;

    public PrintMessage(Message message) {
        this.message = message;
    }

    @Override
    public void print() {
        if (message.getText().isEmpty()) {
            System.out.printf("User: '%s', send empty message", message.getSender());
        } else if (message.getSender().isEmpty()) {
            System.out.printf("Unknown user send message: < %s >", message.getText());
        } else {
            System.out.printf("User: '%s', send message: < %s >", message.getSender(), message.getText());
        }
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
        Message message = new Message("", "");
        message.setSender("Boris");
        message.setText("hello, i am Boris");
        PrintMessage printMessage = new PrintMessage(message);

        Printer emptyMessage = new Printer() {
            @Override
            public void print() {
                if (message.getSender().isEmpty() & message.getText().isEmpty()) {
                    System.out.println("Processing empty message, from unknown user...");
                }
            }
        };
        if (message.getSender().isEmpty() & message.getText().isEmpty()) {
            emptyMessage.print();
        } else {
            printMessage.print();
        }
    }
}








