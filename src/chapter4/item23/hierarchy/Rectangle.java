package chapter4.item23.hierarchy;

// Class hierarchy replacement for a tagged class  (Page 110-11)
public class Rectangle extends Figure {

    final double width;
    final double length;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
