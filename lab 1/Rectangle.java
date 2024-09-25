public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(4);
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public String toString() {
        return "Rectangle: Sides = " + getSides() + ", Width = " + width + ", Height = " + height + ", Area = " + getArea();
    }
}
