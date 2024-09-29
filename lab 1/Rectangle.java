public class Rectangle extends Shape { //rectangle extends shape.
    private int width; //width of the rectangle.
    private int height; //height of the rectangle.

    public Rectangle(int width, int height) { //constructor for rectangle.
        super(4); //set sides to 4.
        this.width = width; //width of the rectangle as 1st value.
        this.height = height; //height of the rectangle as 2nd value.
    }
    public int getWidth() { //gets the width of the rectangle.
        return width;
    }
    public void setWidth(int width) { //sets the width of the rectangle.
        this.width = width;
    }
    public int getHeight() { //gets the height of the rectangle.
        return height;
    }
    public void setHeight(int height) { //sets the height of the rectangle.
        this.height = height;
    }

    public int getArea() { //constructing the area calculation for the rectangle.
        return width * height;
    }

    public String toString() { //displays the values of the shape attributes.
        return "Rectangle: Sides = " + getSides() + ", Width = " + width + ", Height = " + height + ", Area = " + getArea();
    }
}
