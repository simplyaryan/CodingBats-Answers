
public class QuadraticClient {
    public static void main(String[] args) {

        Point p1 = new Point(7, -9);
        Point p2 = new Point(7, 9);

        Quadratic q1 = new Quadratic(-2, 10, 19);
        Quadratic q2 = new Quadratic();

        System.out.println("The number of Quadratics created is: " + Quadratic.numQuadratics());
        System.out.println();

        System.out.println("For q1: " + q1.vertex());
        System.out.println();

        System.out.print("The zeroes of q1 are ");
        q1.quadraticFormula();
        Quadratic q3 = new Quadratic(1, 1, 1);
        System.out.print("The zeroes of q3 are ");
        q3.quadraticFormula();
        System.out.println();

        System.out.println("it is " + q1.isOnQuadratic(p1) + " that " + p1.toString() + " is on " + q1.toString());
        System.out.println("it is " + q2.isOnQuadratic(p2) + " that " + p2.toString() + " is on " + q2.toString());
        System.out.println();

        System.out.println("The number of Quadratics created is: " + Quadratic.numQuadratics());

    }
}// end of class

/*
 * Expected Console Output:
 * The number of Quadratics created is: 2
 * 
 * For q1: The vertex is at (2.5, 31.5)
 * 
 * The zeroes of q1 are x = -1.468626966596886 and x = 6.4686269665968865
 * The zeroes of q3 are no real solutions
 * 
 * it is true that (7.0, -9.0) is on y = -2.0x^2 + 10.0x + 19.0
 * it is false that (7.0, 9.0) is on y = 1.0x^2 + 0.0x + 0.0
 * 
 * The number of Quadratics created is: 3
 */
