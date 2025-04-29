package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {

        int width = 5;
        int height = 8;

        int area = calcurateArea(width, height);
        System.out.println("넓이 : " + area);

        int preimeter = calcuratePerimeter(width, height);
        System.out.println("둘레 길이 : " + preimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부 : " + square);
    }
    static int calcurateArea(int width, int height) {
        return width * height;
    }
    static int calcuratePerimeter(int width, int height) {
        return 2 * (width + height);
    }
    static boolean isSquare(int width, int height) {
        return width == height;
    }
}