public class Circle extends Shape { //circle extends from the abstract shape class.

    private double radius; //radius of the circle.

    public Circle (double radius) { //constructor of circle
        super(1); //set sides to 1, override sides from shape through super.
        this.radius = radius; //sets the radius of the value based on the value inputted.
    }

    public double getRadius() { //gets and returns the radius of the circle.
        return radius;
    }

    public void setRadius(double radius) { //sets the radius of the circle.
        this.radius = radius;
    }

    public int getArea() { //constructor to calculate area of a circle.
        return (int) (Math.PI * radius * radius);
    }
    public String toString() { //displays the values of the shape attributes.
        return "Circle: Sides = " + getSides() + ", Radius = " + radius + ", Area = " + getArea();
    }
}
