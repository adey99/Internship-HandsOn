import java.util.Scanner;
class AsciValue{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter the digits:\n");
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
        sc.nextLine();
        c = sc.nextInt();
        sc.nextLine();
        d = sc.nextInt();
        System.out.println(a+"-"+(char)a+"\n"+b+"-"+(char)b+"\n"+c+"-"+(char)c+"\n"+d+"-"+(char)d);
    }
}