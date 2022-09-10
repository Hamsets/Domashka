import org.jetbrains.annotations.NotNull;

public class Rectangle {
    double x;
    double y;
    public Rectangle (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Rectangle (double x) {
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
        if (((this.x == rComp.x) && (this.y == rComp.y))||((this.y == rComp.x) && (this.x == rComp.y))){
            return true;
        } else {
            return false;
        }
    }

    public Boolean isTheSameRectangle(Rectangle r) {
        if (this.equals(r)) {
            return true;
        } else {
            return false;
        }
    }
}
