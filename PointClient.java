public class PointClient {
    public static void main(String[] args) {

        Point p1 = new Point(3, 4);
        Point p2 = new Point(8, -8);
        Point p3 = new Point();

        System.out.println("p1 = " + p1.toString());
        System.out.println("p1's x-Coordinate is " + p1.getX());
        p3.setY(-2);
        System.out.println("p3's y-Coordinate is " + p3.getY());

        System.out.println("distance from the origin to p1: " + p1.distance());
        System.out.println("distance from p1 to p2: " + p1.distance(p2));
        System.out.println("distance from p3 to the point (1, 2): " + p3.distance(1, 2));

    }
}// end of class

/*
 * Expected Output to Console:
 * p1 = (3.0, 4.0)
 * p1's x-Coordinate is 3.0
 * p3's y-Coordinate is -2.0
 * distance from the origin to p1: 5.0
 * distance from p1 to p2: 13.0
 * distance from p3 to the point (1, 2): 4.123105625617661
 */
