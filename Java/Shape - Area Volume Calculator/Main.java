import java.util.*;
public class Main
{
    public static void main(String args[])
    {   int i=0;
        Scanner sc =new Scanner(System.in);
        Shape ar[]=new Shape[5];
        while(i<5){
            String s=sc.nextLine();
            if(s.equals("Triangle")){
                Triangle t=new Triangle();
                double b=sc.nextDouble();
                sc.nextLine();
                double h=sc.nextDouble();
                sc.nextLine();
                t.setBase(b);
                t.setHeight(h);
                ar[i]=t;
                
            }
            else if(s.equals("Sphere")){
                Sphere s1=new Sphere();
                double rad=sc.nextDouble();
                sc.nextLine();
                s1.setRadius(rad);
                ar[i]=s1;
                
            }
            else if(s.equals("Rectangle")){
                Rectangle r=new Rectangle();
                double w=sc.nextDouble();
                sc.nextLine();
                double h1=sc.nextDouble();
                sc.nextLine();
                r.setWidth(w);
                r.setLength(h1);
                ar[i]=r;
                
            }
            else if(s.equals("Cube")){
                Cube c=new Cube();
                double w2=sc.nextDouble();
                sc.nextLine();
                double h2=sc.nextDouble();
                sc.nextLine();
                double l1=sc.nextDouble();
                sc.nextLine();
                c.setWidth(w2);
                c.setHeight(h2);
                c.setLength(l1);
                ar[i]=c;
                
            }
            i++;
        }
        for(int j=0;j<5;j++){
            System.out.println("Area "+ar[j].area());
            if(ar[j] instanceof Spatial){
                System.out.println("Volume "+ar[j].volume());
            }
        }
        
        
    }
    
    
    
    
    
}