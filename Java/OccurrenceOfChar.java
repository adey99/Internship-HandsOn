import java.util.*;
class OccurrenceOfChar
{
	public static int count(String s, char c)
	{
		int res = 0;

		for (int i=0; i<s.length(); i++)
		{
			// checking character in string
			if (s.charAt(i) == c)
			res++;
		}
		return res;
	}
	public static void main(String args[])
	{
		String str;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:\n");
		str = sc.nextLine();
		for(int i =0;i<str.length();i++){
		    if(!Character.isLetter(str.charAt(i))){
		        System.out.println("Not a valid string");
		        return;
		    }
		}
		System.out.println("Enter the character:");
		c = sc.next().charAt(0);
		if(!Character.isLetter(c)){
		    System.out.println("Given character is not an alphabet");
		    return;
		}
		int char_count = count(str, c);
		if(char_count>0)
		    System.out.println("No of '"+c+"' present in the given word is "+char_count+".");
		else
		    System.out.println("The given character '"+c+"' not present in the given word.");
	}
}
