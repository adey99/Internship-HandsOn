public class Cube extends Shape implements Spatial
{
   private double length,width,height;
   public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double area(){
        double area=2*((length*width)+(width*height)+(height*length));
        return area;
    }
    public double volume(){
        double volume=length*width*height;
        return volume;
    }
}