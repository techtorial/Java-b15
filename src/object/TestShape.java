package object;

public class TestShape {
    public static void main(String[] args) {

        Shape shape1 = new Shape();

        shape1.perimeterCalculator(5, 8);

        shape1.perimeterCalculator(12, 20);

        shape1.areaCalculator(5.5, 2.2);

        shape1.areaCalculator(2,5);

        Shape a = new Shape();
        a.perimeterCalculator(1,3);

    }
}
