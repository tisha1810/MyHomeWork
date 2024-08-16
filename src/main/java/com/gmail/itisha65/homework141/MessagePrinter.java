package com.gmail.itisha65.homework141;

public class MessagePrinter implements Printer {
    private static String sender;
    private static String text;

    public MessagePrinter(Message message) {
        sender = message.sender;
        text = message.text;
    }

    @Override
    public void print(Message message) {
        if (sender == null & text == null) {
            Printer printer = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Processing empty message from unknown user...");
                }
            };
        } else {
            assert sender != null;
            assert text != null;
            if (sender.isBlank() & text.isBlank()) {
                System.out.println("Processing empty message from unknown user...");
            } else if (text.isBlank()) {
                System.out.printf("User: '%s', send empty message!", sender);
            } else if (sender.isBlank()) {
                System.out.printf("Unknown user send message: < %s >", text);
            } else {
                System.out.printf("User: '%s', send message: <%s>", sender, text);
            }
        }
        if (sender == null & text == null) {
            Printer printer = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Processing empty message from unknown user...");
                }
            };
            printer.print(message);
        }
    }

    public static class Message {
        private final String sender;
        private final String text;

        public Message(String sender, String text) {
            this.sender = sender;
            this.text = text;
        }
    }

    public static void main(String[] args) {
        Message message = new Message("Boris", "    ");
        MessagePrinter messagePrinter = new MessagePrinter(message);
        messagePrinter.print(message);
    }
}

