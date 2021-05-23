import java.util.Scanner;
class Main{
    public static void main (String[] args) {
        float cons;
        float ltrs=0.0f,kms=0.0f;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the no of liters to fill the tank");
            ltrs = sc.nextInt();
            sc.nextLine();
            if(ltrs<=0.0){
                System.out.println((int)ltrs+" is an Invalid input");
                return;
            }
            System.out.println("Enter the distance covered\n");
            kms = sc.nextInt();
            sc.nextLine();
            if(kms<=0.0){
                System.out.println((int)kms+" is an Invalid input");
                return;
            }
        }
        catch(Exception e){
            System.out.print("");
        }
        
        cons = (float)((ltrs/kms)*100);
        System.out.printf("Liters/100KM\n%.2f\n",cons);
        cons = (float)((kms*0.6214)/(ltrs*0.2642));
        System.out.printf("Miles/gallons\n%.2f",cons);
    }
}