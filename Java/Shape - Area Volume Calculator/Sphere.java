public class Sphere extends Shape implements Spatial
{
  private double radius;
  public double getRadius(){
      return this.radius;
  }
  public void setRadius(double radius){
      this.radius=radius;
  }
  public double area(){
      double area= 4*Math.PI*Math.pow(radius,2);
      return area;
  }
  public double volume(){
      double volume=(4*Math.PI*Math.pow(radius,3))/3;
      return volume;
  }
}