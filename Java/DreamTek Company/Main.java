import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        Associate as = new Associate();
        System.out.println("Enter the associate id:");
        int id = sc.nextInt();
        sc.nextLine();
        as.setAssociateId(id);
        System.out.println("Enter the associate name:");
        String name = sc.nextLine();
        as.setAssociateName(name);
        System.out.println("Enter the number of days:");
        int days = sc.nextInt();
        as.trackAssociateStatus(days);
        System.out.println("The associate "+as.getAssociateName()+" work status:"+as.getWorkStatus());
    }
}