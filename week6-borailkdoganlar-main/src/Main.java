public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        String s1 = new String( "Ali");

        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);

        Point p2 = new Point(3 ,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Point tLeft = new Point(3 ,4);
        Rectangle r1 = new Rectangle(
                tLeft,
                3,
                4
        );
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().xCoord);
        System.out.println(r1.getTopLeft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Circle c1 = new Circle(
                new Point(3,4),
                5
        );
        System.out.println(c1.getRadius());

        c1.setRadius(-21);
        System.out.println(c1.getRadius());

        Point p = new Point(3,4);
        Rectangle r2 = new Rectangle(p,3,4);
        System.out.println(Rectangle.counter);
        System.out.println(r2.counterForObject);

        Rectangle r3 = new Rectangle(p,3,4);
        System.out.println(Rectangle.counter);
        System.out.println(r2.counterForObject);
        System.out.println(r3.counterForObject);

        System.out.println(p);

        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        triangle t1 = new triangle(p, 3, 4);
        System.out.println(t1.area());
        System.out.println(t1.perimeter());



    }
}