package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.inputValue(1, 10);

        int area = r.calculateArea();
        System.out.println("Area = " + area);

        int perimeter = r.calculatePerimeter();
        System.out.println("Perimeter = " + perimeter);

        boolean isSquare = r.isSquare();
        System.out.println("Is Square = " + isSquare);
    }
}
