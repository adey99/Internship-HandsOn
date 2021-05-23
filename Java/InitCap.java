import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
class InitCap
{
 public static void main(String[] args)throws IOException    
 {
     
     System.out.println("Enter the String:");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String s = "";
    
    int flag=0;
    int no_caps_needed=1;
    if(Character.isLowerCase(str.charAt(0))==true){
        no_caps_needed=0;
       s=s+(char)(str.charAt(0)-32);
    }   
     else
         s=s+(char)(str.charAt(0));
    
    for(int i=1;i<str.length();i++)
    {
        
         if(Character.isLowerCase(str.charAt(i))==true)
        {
            char c=(char)(str.charAt(i-1));
               if(c==' ')
            {
              char ch= (char)(str.charAt(i)-32);
              no_caps_needed=0;
              s = s + ch;
               flag=1;
            }
        }
           
           if(flag==0)
        {
            s = s + str.charAt(i);
        }
          flag=0;
    }
    if(no_caps_needed==1)
        System.out.println("First character of each word is already in uppercase");
    else
        System.out.println(s);
  }
}