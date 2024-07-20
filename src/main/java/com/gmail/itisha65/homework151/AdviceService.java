package com.gmail.itisha65.homework151;

public class AdviceService implements DayAdvice {

    @Override
    public void advice(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY:
                System.out.println("To be productive in job!");
                break;
            case FRIDAY:
                System.out.println("Finally FRIDAY, yooouuu hooooou!");
                break;
            case SATURDAY:
                System.out.println("Visit a restaurant!");
                break;
            case SUNDAY:
                System.out.println("Visit a cinema!");
                break;
        }
    }

    public static void main(String[] args) {
        AdviceService adviceService = new AdviceService();
        adviceService.advice(Day.SUNDAY);
    }
}
