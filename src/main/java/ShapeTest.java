public class ShapeTest {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape diamond = new Diamond();
        Shape pentagon = new Pentagon();
        Shape square = new Square();
        Shape triangle = new Triangle();

        circle.printShape();
        diamond.printShape();
        pentagon.printShape();
        square.printShape();
        triangle.printShape();
    }
}