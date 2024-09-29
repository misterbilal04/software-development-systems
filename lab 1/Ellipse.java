public class Ellipse extends Rectangle{ //ellipse extends from abstract shape class.

    public Ellipse(int width, int height) { //constructor for ellipse
        super(width, height); //overrides both height and width based on the values inputted.
    }

    public int getArea() { //constructor to calculate the area of an ellipse.
        return (int) (Math.PI * (getWidth()/2.0 * getHeight()/2.0));
    }

    public String toString() { //displays the values of the shape attributes.
        return "Ellipse: Width = " + getWidth() + ", Height = " + getHeight() + ", Area = " + getArea();
    }
}
