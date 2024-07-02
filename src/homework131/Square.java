package homework131;

public class Square extends Figures implements Calculable {
  int firstSide;
  int secondSide;

    public Square(int firstSide, int secondSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculate() {
        return firstSide * secondSide;
    }
}
