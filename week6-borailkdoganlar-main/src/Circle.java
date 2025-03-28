public class Circle extends  Shape {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            this.radius = 0;
            System.out.println("Radius can't be negative");
        }else {
            this.radius = radius;

        }
    }

    @Override
    public String toString() {
        return "Circle [center=" + center + ", radius=" + radius + ", getLocation()=" + getLocation() + "]";
    }


    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
    
    @Override
    public double perimeter(){
        return Math.PI;
    }

}
