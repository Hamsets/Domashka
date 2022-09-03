import org.jetbrains.annotations.NotNull;

public class Rectangle {
    static private int  createdRectangles = 0;
    static private final String RUSSIAN_CLASS_NAME = "Прямоугольник";
    static private final String ENGLISH_CLASS_NAME = "Rectangle";
    double x;
    double y;
    public Rectangle (double x, double y) {
        createdRectangles++;
        this.x = x;
        this.y = y;
    }
    public Rectangle (double x) {
        createdRectangles++;
        this.x = x;
        this.y = x;
    }

    public double calculateArea () {
        return x * y;
    }

    public void printArea() {
        System.out.printf("%.2f", this.calculateArea());
    }

    public String printRectangleKind() {
        if (x == y) {
            return "Это квадрат.";
        } else {
            return "Это прямоугольник.";
        }
    }

    @Override
    public boolean equals(Object r) {
        Rectangle rComp = (Rectangle) r;
        if ((this.x == rComp.x) && (this.y == rComp.y)){
            return true;
        } else {
            return false;
        }
    }

    public boolean isTheSameRectangle(Rectangle r) {
        if (this.equals(r)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printRectanglesCount(){
        System.out.printf("Всего было создано %s шт. прямоугольников", createdRectangles);
        System.out.println();
    }

    public static void printClassName (boolean printRussian) {
        if (printRussian == true) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }
}
