
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(double x2, double y2) {
        double x1 = this.getX();
        double y1 = this.getY();
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public double distance() {
        double x1 = this.getX();
        double y1 = this.getY();
        double result = Math.sqrt(Math.pow(x1 - 0, 2) + Math.pow(y1 - 0, 2));
        return result;
    }

    public double distance(Point p) {
        double x1 = this.getX();
        double y1 = this.getY();
        double x2 = p.getX();
        double y2 = p.getY();
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;

    }

}
