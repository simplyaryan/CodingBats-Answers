public class CircleClient {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Circle c1 = new Circle(4, p1, "green");
        Circle c2 = new Circle(3, 5, 6, "purple");
        Circle c3 = new Circle();

        System.out.println("c1's radius is " + c1.getRadius());
        System.out.println("c2's center is " + c2.getCenter());
        System.out.println("c3's color is " + c3.getColor());

        c1.setXCenter(-3);
        System.out.println("c1's center's x-coordinate is " + c1.getXCenter());

        System.out.println("The area of c1 is " + c1.getArea());
        System.out.println("The circumference of c2 is " + c2.getCircumference());
        System.out.println("it is " + c3.isOnCircle(p1) + " that p1 is on c3");
        System.out.println("it is " + c2.isOnCircle(new Point(5, 9)) + " that (5, 9) is on c2");
    }
} // end of class
/*
 * Expected Output to Console:
 * c1's radius is 4.0
 * c2's center is (5.0, 6.0)
 * c3's color is black
 * c1's center's x-coordinate is -3.0
 * The area of c1 is 50.26548245743669
 * The circumference of c2 is 18.84955592153876
 * it is false that p1 is on c3
 * it is true that (5, 9) is on c2
 */
