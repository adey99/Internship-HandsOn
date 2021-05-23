import java.util.Scanner;
class CumulativeSum{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int size,i,sum=0;
        System.out.println("Enter number of elements");
        size = sc.nextInt();
        if(size<=0||size>20){
            System.out.println("Invalid Range");
            return;
        }
        System.out.println("Enter the elements");
        for(i=0;i<size;i++)
            arr[i]= sc.nextInt();
        for(i=0;i<size;i++){
            sum+=arr[i];
            System.out.print(sum+" ");
        }
    }
}