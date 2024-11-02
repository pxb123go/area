class shape{
    public double getArea(){
        return 0;
    }
}
class triangle extends shape{
    private double base,height;
    public triangle(double base,double height)
    {
this.base=base;
this.height=height;
    }
    public double getArea(){
        return 0.5*base*height;
    }
}
class square extends shape{
    private double side;
    public square(double side)
    {
this.side=side;
    }
    public double getArea(){
        return side*side;
    }
}
class program{
    public static void main(String[] args) {
        shape[] s1=new shape[2];
        s1[0] = new square(4);
        s1[1] = new triangle(5,6);
        System.out.println("the area of the triangle is" + s1[1].getArea());
        System.out.println("the area of the square is" + s1[0].getArea());
    }
}