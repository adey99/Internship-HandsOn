public class Triangle extends Shape
{
    private double base,height;
    public double getBase(){
        return this.base;
    }
    public void setBase(double base){
        this.base=base;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double area(){
        double area= (base*height)/2;
        return area;
    }
    public double volume(){
        return -1;
    }
}