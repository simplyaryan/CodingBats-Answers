public class Quadratic {

    private double a;
    private double b;
    private double c;
    public static int numOfObjects = 0;

    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        numOfObjects++;
    }

    public Quadratic() {
        a = 1;
        b = 0;
        c = 0;
        numOfObjects++;
    }

    public static int numQuadratics() {
        return numOfObjects;
    }

    public String toString() {
        return "y = " + a + "x^2 + " + b + "x + " + c;
    }

    public String vertex() {
        double x = -b / (2 * a);
        double y = a * x * x + b * x + c;
        return "The vertex is at (" + x + "," + y + ")";
    }

    public void quadraticFormula() {
        if (b * b - (4 * a * c) < 0) {
            System.out.println("No Solutions");
        } else {
            double x1 = (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);
            double x2 = (-b - Math.sqrt(b * b - (4 * a * c))) / (2 * a);
            System.out.println("x = " + x1 + " and x  = " + x2 + ".");
        }

    }

    public boolean isOnQuadratic(Point p) {
        if ((this.a * p.getX() * p.getX() + this.b * p.getX() + this.c) == p.getY()) {
            return true;
        }
        return false;
    }

}
