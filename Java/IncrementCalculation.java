import java.util.*;
class IncrementCalculation{
    public static void  main(String args[]){
        try{
            int t_sa=0;
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the salary");
            float sa=sc.nextFloat();
            System.out.println("Enter the Performance appraisal rating");
            float ap_r=sc.nextFloat();
            if(sa<=0){
                System.out.println("Invalid Input");
                System.exit(0);
            }
            if(ap_r>=1 && ap_r<=3){
                t_sa=(int)(sa+sa*0.1);
            }
            else if(ap_r>=3.1 && ap_r<=4){
                t_sa=(int)(sa+sa*0.25);
            }
            else if(ap_r>=4.1 && ap_r<=5){
                t_sa=(int)(sa+sa*0.3);
            }
            else{
                System.out.println("Invalid Input");
                System.exit(0);
            }
            System.out.println(t_sa);
        }
        catch(Exception E){
            
            
            
        }
        
    }
    
    
    
}