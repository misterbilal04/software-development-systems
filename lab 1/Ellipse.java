public class Ellipse extends Rectangle{

    public Ellipse(int width, int height) {
        super(width, height);
    }

    public int getArea() {
        return (int) (Math.PI * (getWidth()/2.0 * getHeight()/2.0));
    }

    public String toString() {
        return "Ellipse: Width = " + getWidth() + ", Height = " + getHeight() + ", Area = " + getArea();
    }
}
