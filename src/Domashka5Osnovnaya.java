public class Domashka5Osnovnaya {
    public static void main(String[] args) {
        System.out.println("Создаем 3 объекта Rectangle (квадрат, и два равных прямоугольника)");
        Rectangle r1 = new Rectangle(5.5);
        Rectangle r2 = new Rectangle(5.5, 4.4);
        Rectangle r3 = new Rectangle(5.5, 4.4);

        System.out.print("Методы 1-го объекта. Площадь - ");
        r1.printArea();
        System.out.println(". " + r1.printRectangleKind());
        System.out.print("Методы 2-го объекта. Площадь - ");
        r2.printArea();
        System.out.println(". " + r2.printRectangleKind());
        System.out.print("Методы 3-го объекта. Площадь - ");
        r3.printArea();
        System.out.println(". " + r3.printRectangleKind());

        System.out.println("____________________________");
        System.out.println("Сравним объект 1 с размерами сторон х " + r1.x + ", y " + r1.y + " и объект 2 с размерами сторон х " + r2.x + ", y " + r2.y);
        System.out.println("Результат - " + r1.isTheSameRectangle(r2));
        System.out.println();

        System.out.println("Сравним объект 2 с размерами сторон х " + r2.x + ", y " + r2.y + " и объект 3 с размерами сторон х " + r3.x + ", y " + r3.y);
        System.out.println("Результат - " + r2.isTheSameRectangle(r3));

    }
}
