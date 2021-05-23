import java.util.Scanner;
class FirstOccurence{
    public static void main (String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter the string:");
        String search = readInput.nextLine();
        System.out.println("Enter the character to be searched:");
        String find = readInput.nextLine();
        System.out.println("Enter the character to replace:");
        String replace = readInput.nextLine();
        if (search.contains(find)) {
            System.out.println(search.replaceFirst(find, replace));
        } 
        else
            System.out.println("character not found");
    }
}