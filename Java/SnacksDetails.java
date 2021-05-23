import java.util.Scanner;
class SnacksDetails{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tot_price=0,npizza=0,npuff=0,ndrink=0;
        System.out.println("Enter the no of pizzas bought:");
        npizza = sc.nextInt();
        sc.nextLine();
        tot_price+=npizza*100;
        System.out.println("Enter the no of puffs bought:");
        npuff = sc.nextInt();
        sc.nextLine();
        tot_price+=npuff*20;
        System.out.println("Enter the no of cool drinks bought:");
        ndrink = sc.nextInt();
        sc.nextLine();
        tot_price+=ndrink*10;
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+npizza);
        System.out.println("No of puffs:"+npuff);
        System.out.println("No of cooldrinks:"+ndrink);
        System.out.println("Total price="+tot_price);
        System.out.println("ENJOY THE SHOW!!!");
        
    }
}