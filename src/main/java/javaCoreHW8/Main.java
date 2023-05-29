package main.java.javaCoreHW8;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape pentagon = new Pentagon();
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        ShapePrinter printer = new ShapePrinter();

        printer.printShapeName(circle);
        printer.printShapeName(pentagon);
        printer.printShapeName(quad);
        printer.printShapeName(rectangle);
        printer.printShapeName(triangle);
    }
}
