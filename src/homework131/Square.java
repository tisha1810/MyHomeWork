package homework131;

public class Square extends Figures implements Calculable {
    private final int FIRST_SIDE;
    private final int SECOND_SIDE;

    public Square(int FIRST_SIDE, int SECOND_SIDE){
        this.FIRST_SIDE = FIRST_SIDE;
        this.SECOND_SIDE = SECOND_SIDE;
    }

    @Override
    public double calculate() {
        return FIRST_SIDE * SECOND_SIDE;
    }
}
