import java.util.*;
import java.io.*;
    //import necessary packages
     @SuppressWarnings("unchecked")//Do not delete this line
    public class Main
    {
        public static void main (String[] args){
        boolean wantToContinue=true;
		File f = FileManager.createFile();
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("Enter Phone Number");
			String ph = sc.nextLine();
			System.out.println("Enter email");
			String em = sc.nextLine();
			String record = name + "," + ph +"," + em + ";";
			FileManager.writeFile(f, record);
			System.out.println("Do you want to continue yes/no");
			String choice = sc.nextLine().toLowerCase();
			if(choice.equals("no")) {
				wantToContinue = false;
			}
		}while(wantToContinue);
		String[] reads = FileManager.readFile(f);
		for(int i = 0; i < reads.length; i++) {
			System.out.println(reads[i]);
		}
        }
        

}
