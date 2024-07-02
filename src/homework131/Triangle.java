package homework131;

public class Triangle extends Figures implements Calculable {
    int base;
    int highest;

    public Triangle(int base, int highest) {
        this.base = base;
        this.highest = highest;
    }

    @Override
    public double calculate() {
        return (double) (base * highest) / 2;

    }
}
