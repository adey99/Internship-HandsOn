import java.util.Scanner;
class Numerology{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{65,1},{66,2},{67,3},{68,4},{69,5},{70,8},

                {71,3},{72,5},{73,1},{74,1},{75,2},{76,3},

                {77,4},{78,5},{79,7},{80,8},{81,1},{82,2},

                {83,3},{84,4},{85,6},{86,6},{87,6},{88,5},{89,1},{90,7}};
        String name;
        int i,sum=0;
        System.out.println("Enter your name:");
        name = sc.nextLine();
        for(i=0;i<name.length();i++){
            if(!Character.isUpperCase(name.charAt(i))){
                System.out.println("Invalid name");
                return;
            }
            else
                //System.out.println((int)(name.charAt(i))-65);
                sum+= arr[(int)(name.charAt(i))-65][1];
        }
        System.out.println("Your numerology no is:"+sum);
    }
}