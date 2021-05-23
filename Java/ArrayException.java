import java.util.*;
public class ArrayException{
    public String getPriceDetails(){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of elements in the array");
        size = sc.nextInt();
        sc.nextLine();
        int[] arr=new int[size];
        System.out.println("Enter the price details");
        try{
            for(int i=0;i<arr.length;i++)
                arr[i]=sc.nextInt();
            System.out.println("Enter the index of the array element you want to access");
            int idx=sc.nextInt();
            return ("The array element is "+arr[idx]);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            return "Array index is out of range";
        }
        catch(InputMismatchException ime){
            return "Input was not in the correct format";
        }
    }
    public static void main (String[] args) {
        ArrayException ae = new ArrayException();
        System.out.println(ae.getPriceDetails());
    }
}