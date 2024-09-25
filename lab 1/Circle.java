public class Circle extends Shape {

    private double radius;

    public Circle (double radius) {
        super(1);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }
    public String toString() {
        return "Circle: Sides = " + getSides() + ", Radius = " + radius + ", Area = " + getArea();
    }
}
