public class triangle extends Shape{
    
    private int side1;
    private int side2;


    public triangle(Point location, int side1, int side2) {
        super(location);
        this.side1 = side1;
        this.side2 = side2;
    }


    public int getSide1() {
        return side1;
    }


    public void setSide1(int side1) {
        this.side1 = side1;
    }


    public int getSide2() {
        return side2;
    }


    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public double area(){
        return (side1*side2)/2;
    }

    @Override
    public double perimeter(){
        return side1 +side2 + Math.sqrt(side1*side1+side2*side2);
    }


    


    

}
