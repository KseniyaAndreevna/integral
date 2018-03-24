public class Integral {
    private Interval interval;
    private Function function;
    private int n;

    Integral(Interval interval, Function function, int n) {
        this.interval = interval;
        this.function = function;
        this.n = n;
    }

    double calculate() {
        double delta = (interval.getB() - interval.getA()) / n;
        double result = 0;
        double point = interval.getA();

        do {
            result += function.calculate(point);
            point += delta;
        } while (point <= interval.getB());

        return result;
    }
}