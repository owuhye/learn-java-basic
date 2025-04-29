package oop1.ex;

public class Rectangle {
    int width;
    int height;
    int calcurateArea() {
        return width * height;
    }

    int calcuratePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

}
