package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        //객체생성
        Rectangle rectangle = new Rectangle();

        rectangle.width = 8;
        rectangle.height = 8;

        int area = rectangle.calcurateArea();
        System.out.println("넓이 : " + area);

        int preimeter = rectangle.calcuratePerimeter();
        System.out.println("둘레 길이 : " + preimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 : " + square);
    }

}