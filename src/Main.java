public class Main {
    public static void main(String[] args) {
        Interval interval = new Interval(0, 5);
        Function function = new LinearFunction();
        Integral integral = new Integral(interval, function, 5);

        double result = integral.calculate();
        System.out.println(result);
    }
}