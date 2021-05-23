import java.util.*;
import java.text.*;
public class Main {

public static void main(String [] args) {
   
        //Fill the Code
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        sdf.setLenient(false);
        Date parsedate= null;
        Date parsedate2=null;
        Date sys_time= null;
        Scanner sc =new Scanner(System.in);
        String intime,outtime;
        long duration,fee;
        System.out.println("In-time");
        intime = sc.nextLine();
        try{
            parsedate =sdf.parse(intime);
            sys_time =sdf.parse("29/10/2019 20:09");
            if(parsedate.compareTo(sys_time)>0){
                System.out.println(intime+" is an Invalid In-Time");
                return;
            }
                
        }
        catch(ParseException pe){
            System.out.println(intime+" is an Invalid In-Time");
            return;
        }
        System.out.println("Out-time");
        outtime = sc.nextLine();
        try{
            parsedate2 =sdf.parse(outtime);
            if(parsedate2.compareTo(parsedate)>0){
                duration = (parsedate2.getTime() - parsedate.getTime())/(1000*60*60);
                fee = (duration+1)*10;
                System.out.println(fee+" Rupees");
                return;
            }
            else{
                System.out.println(outtime+" is an Invalid Out-Time");
                return;
            }
        }
        catch(ParseException pe){
            System.out.println(outtime+" is an Invalid Out-Time");
            return;
        }
        
}
}