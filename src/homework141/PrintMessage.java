package homework141;

public class PrintMessage implements Printer {

    @Override
    public void print() {
    }

    public static class Message implements Printer {
        @Override
        public void print() {
            if (sender.isEmpty() & text.isEmpty()) {
                System.out.println("Unknown send empty message.");
            } else if (sender.isEmpty()) {
                System.out.println("Unknown user send message: " + "'" + text + "'");
            } else if (text.isEmpty()) {
                System.out.println("User: " + sender + " send empty message");
            } else {
                System.out.println("User: " + sender + ", send message: " + "'" + text + "'");
            }
        }

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
        Printer message = new Message("Boris", "hello");
        message.print();
    }
}








