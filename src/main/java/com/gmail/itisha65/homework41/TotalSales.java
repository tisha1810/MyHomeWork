package com.gmail.itisha65.homework41;

public class TotalSales {
    public static void main(String[] args) {
        String product = "Smartphone";
        double salesIncome = 15154.34;
        int totalDays = 5;
        double avarageSales = salesIncome / totalDays;

        System.out.println("Product No 1: " + product);
        System.out.println("Total sales for " + totalDays + " days is EUR: " + salesIncome);
        System.out.printf("Sales by day is EUR %.2f \n", avarageSales);

        product = "Computer";
        salesIncome = 18778.67;
        totalDays = 7;
        avarageSales = salesIncome / totalDays;

        System.out.println("Product No 2: " + product);
        System.out.println("Total sales for " + totalDays + " days is EUR: " + salesIncome);
        System.out.printf("Sales by day is EUR %.2f", avarageSales);
    }
}
