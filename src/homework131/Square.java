package homework131;

public class Square implements Calculable {
    int aSide;
    int bSide;
    public Square(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;

    }

    @Override
    public double calculateSquare() {
        return aSide * bSide;
    }
}
