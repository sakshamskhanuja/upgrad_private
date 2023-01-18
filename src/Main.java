public class Main {
    public static void main(String[] args) {
        // Initializing object c1 with radius set as 10.
        Circle c1 = new Circle(10F);
        printCircle(c1);

        // Initializing object c2 with radius set as 20.
        Circle c2 = new Circle(20F);
        printCircle(c2);

        // Initializing object c3 with radius set as 15.
        Circle c3 = new Circle(15F);
        System.out.println("Circumference of c3 Circle = " + c3.circumference());
    }

    /**
     * Prints the area of a {@link Circle}.
     */
    public static void printCircle(Circle c) {
        System.out.println("Area of circle = " + c.area());
    }
}

/**
 * Stores the radius of the circle and calculates its area.
 */
class Circle {

    /**
     * Stores the radius of the circle.
     */
    private final float radius;

    /**
     * Stores the value of PI in the class.
     */
    public static final float PI = 3.141F;

    // Default Constructor
    public Circle() {
        radius = 0F;
    }

    // Parameterized Constructor
    public Circle(float radius) {
        // this.radius refers to the instance variable radius.
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     */
    public float area() {
        return PI * radius * radius;
    }

    /**
     * Calculates the circumference of the circle.
     */
    public float circumference() {
        return 2 * PI * radius;
    }
}