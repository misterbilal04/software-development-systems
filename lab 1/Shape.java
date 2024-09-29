abstract class Shape { //abstract base class, it is not instantiated directly.
    private int sides; //to define the number of sides in a shape.

    public int getSides() { //gets and returns the number of sides within the shape.
        return sides;
    }

    abstract public int getArea(); //abstract method to get area of the shape.

    Shape(int sides) { //set sides directly to the constructor.
        this.sides = sides;
    }
}
