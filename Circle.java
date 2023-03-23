
public class Circle {
    private double r;
    private Point p;
    private String colour;

    public Circle(double r, Point p, String c) {
        this.r = r;
        this.p = p;
        this.colour = c;
    }

    public Circle(double r, double x, double y, String c) {
        this.r = r;
        Point p = new Point(x, y);
        this.p = p;
        this.colour = c;
    }

    public Circle() {
        this.r = 1.0;
        Point p = new Point(0, 0);
        this.p = p;
        this.colour = "black";
    }

    public double getRadius() {
        return r;
    }

    public String getColor() {
        return colour;
    }

    public String getCenter() {
        double x = this.p.getX();
        double y = this.p.getY();
        String result = "(" + x + "," + y + ")";
        return result;
    }

    public double getXCenter() {
        return p.getX();
    }

    public double getYCenter() {
        return p.getY();
    }

    public void setRadius(double r) {
        this.r = r;
    }

    public void setColor(String c) {
        this.colour = c;
    }

    public void setCenter(double x, double y) {
        p.setX(x);
        p.setY(y);
    }

    public void setXCenter(double x) {
        p.setX(x);
    }

    public void setYCenter(double y) {
        p.setX(y);
    }

    public double getArea() {
        return Math.pow(r, 2) * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * r;
    }

    public boolean isOnCircle(Point p) {

        double distance = p.distance(this.p.getX(), this.p.getY());
        if (distance == r) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Circle: center = (" + p.getX() + "," + p.getY() + ") , radius = " + r + " , colour = " + colour;
    }

}
