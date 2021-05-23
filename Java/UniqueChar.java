import java.util.*;
class UniqueChar {
    static final int NO_OF_CHARS = 256;
       
    /* Print duplicates present in the passed string */
    static void printDistinct(String str)
    {
        int[] count = new int[NO_OF_CHARS];
        int flag=1;
        int i;
        for (i = 0; i < str.length(); i++){
            if((!Character.isLetter(str.charAt(i)))&& (str.charAt(i)!=' ')){
                System.out.println("Invalid Sentence");
                return;
            }
            if(str.charAt(i)!=' ')
                count[(int)str.charAt(i)]++;
        }
        int n = i;
        for (i = 0; i < n; i++){
            if (count[(int)str.charAt(i)] == 1){
                flag=0;
                System.out.println("Unique characters:");
                break;
            }
        }
        if(flag==1){
            System.out.println("No unique characters");
            return;
        }
        for (i = 0; i < n; i++){
            if (count[(int)str.charAt(i)] == 1)
                System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the sentence:");
        str = sc.nextLine();
        printDistinct(str);
    }
}