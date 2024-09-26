public class Driver {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(6, 4);
        Rectangle rectangle2 = new Rectangle(2, 6);
        Rectangle rectangle3 = new Rectangle(9, 4);

        Circle circle1 = new Circle(7);
        Circle circle2 = new Circle(12);
        Circle circle3 = new Circle(5);

        Ellipse ellipse1 = new Ellipse(7,3);
        Ellipse ellipse2 = new Ellipse(9,5);
        Ellipse ellipse3 = new Ellipse(14,6);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println("");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println("");
        System.out.println(ellipse1);
        System.out.println(ellipse2);
        System.out.println(ellipse3);
    }
}
