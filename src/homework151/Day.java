package homework151;

public enum Day implements DayAdvice {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public void advice(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("To be productive in job!");
                break;
            case TUESDAY:
                System.out.println("To be productive in job!");
                break;
            case WEDNESDAY:
                System.out.println("To be productive in job!");
                break;
            case THURSDAY:
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
}
