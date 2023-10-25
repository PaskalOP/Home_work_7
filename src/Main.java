public class Main {
    public static void main(String[] args) {
    Circle cr = new Circle();
    Shape qd = new Square();
    Triangle tr = new Triangle();
    Rhombus rb = new Rhombus();
    Shape trpz = new Trapezoid();

    PrintShapeName print = new PrintShapeName();
        print.printShapeName(cr);
        print.printShapeName(qd);
        print.printShapeName(tr);
        print.printShapeName(rb);
        print.printShapeName(trpz);

    }
}