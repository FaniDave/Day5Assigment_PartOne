package Day5.PersonalExcercise;

//Triangle class
final class Triangle {
    //fields
    private final double base;
    private final double height;

    //Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //computeArea() method
    public double computeArea() {
        return (base * height * 0.5);
    }

}

//Rectangle class
final class Rectangle {
    //fields
    private final double length;
    private final double width;

    //Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //computeArea() method
    public double computeArea() {
        return (length * width);
    }

}

//Circle class
final class Circle {
    //fields
    private final double radius;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //computeArea() method
    public double computeArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

}

public class BadWayOOP {

    //main method
    public static void main(String[] args) {

        Object[] objects = new Object[]{
                new Triangle(5, 6),
                new Rectangle(3, 4),
                new Circle(7)
        };


        computeArea(objects);

    }

    //computeArea method
    public static void computeArea(Object[] objects) {
        for (Object o : objects) {
            if (o instanceof Triangle t) System.out.println(t.computeArea());
            if (o instanceof Rectangle r) System.out.println(r.computeArea());
            if (o instanceof Circle c) System.out.println(c.computeArea());
        }
    }
}
