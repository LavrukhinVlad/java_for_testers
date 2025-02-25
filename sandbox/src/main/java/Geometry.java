public class Geometry {
    public static void main(String[] args) {
        printSquareArea(  7.0);
        printSquareArea(  5.0);
        printSquareArea(  3.0);

        printRectangArea(3.0, 5.0);
        printRectangArea(7.0, 9.0);
    }

    private static void printRectangArea(double a, double b) {
        System.out.println("������� �������������� �� ��������� " + a + " � " + b + " = " + rectangleArea(a, b));
    }

    private static double rectangleArea(double a, double b) {
        return a * b;
    }

    static void printSquareArea(double side) {
        System.out.println("������� �������� �� �������� " + side + " = " + squareArea(side));
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
