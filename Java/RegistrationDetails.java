import java.util.Scanner;
class RegistrationDetails{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,age,ph_no,qual,email_id,nexp;
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextLine();
        System.out.println("Enter your phoneno:");
        ph_no = sc.nextLine();
        System.out.println("Enter your qualification:");
        qual = sc.nextLine();
        System.out.println("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
        email_id = sc.nextLine();
        System.out.println("Enter your noofexperience[if any]:");
        nexp = sc.nextLine();
        System.out.println("Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+email_id+" within 2 working days");
    }
}