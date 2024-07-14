package com.gmail.itisha65.homework21;

public class Store {
    public static void main(String[] args) {

        String clientName = "Donald Trump";
        String product = "Smartphone";
        String adress = "Times Squere,";
        double price = 309.99;
        int streetNumber = 226;
        byte orderNumber = 1;

        System.out.print("Order No " + orderNumber);
        System.out.println(" Client: " + clientName);
        System.out.println("Product: " + product);
        System.out.println("Price:EUR " + price);
        System.out.print("Adress: " + adress);
        System.out.println(" " + streetNumber);

        clientName = "Boris Jonson";
        product = "Playstation";
        adress = "Baker st.";
        price = 570.99;
        streetNumber = 332;
        orderNumber = 2;

        System.out.print("Order No " + orderNumber);
        System.out.println(" Client: " + clientName);
        System.out.println("Product: " + product);
        System.out.println("Price:EUR " + price);
        System.out.print("Adress: " + adress);
        System.out.println(" " + streetNumber);

        System.out.println("Thats All!");
    }
}
