import java.util.*;
public class Main{
    public static void main (String[] args) {
        PhoneBook pb =new PhoneBook();
        Scanner sc = new Scanner(System.in);
        String firstName;
	    String lastName;
	    long  phoneNumber;
	    String emailId;
	    int choice;
	    char ch;
	    Contact c;
	    List<Contact> list = new ArrayList<Contact>();
	    do{
	        System.out.println("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1: System.out.println("Add a Contact:");
                        System.out.print("Enter the First Name: ");
                        firstName = sc.nextLine();
                        System.out.print("\nEnter the Last Name: ");
                        lastName = sc.nextLine();
                        System.out.print("Enter the Phone No.: ");
                        phoneNumber=sc.nextLong();
                        sc.nextLine();
                        System.out.print("Enter the Email: ");
                        emailId = sc.nextLine();
                        c=new Contact(firstName,lastName,phoneNumber,emailId);
                        pb.addContact(c);
                        break;
                case 2: System.out.println("The contacts in the List are:");
                        list = pb.viewAllContacts();
                        for(Contact ct:list){
                            System.out.println("First Name: "+ct.getFirstName());
                            System.out.println("Last Name: "+ct.getLastName());
                            System.out.println("Phone No.: "+ct.getPhoneNumber());
                            System.out.println("Email: "+ct.getEmailId());
                        }
                        break;
                case 3: System.out.print("Enter the Phone number to search contact:");
                        phoneNumber = sc.nextLong();
                        sc.nextLine();
                        c= pb.viewContactGivenPhone(phoneNumber);
                        if(c!=null){
                        System.out.println("The contact is:");
                        System.out.println("First Name: "+c.getFirstName());
                        System.out.println("Last Name: "+c.getLastName());
                        System.out.println("Phone No.: "+c.getPhoneNumber());
                        System.out.println("Email: "+c.getEmailId());
                        }
                        break;
                case 4: System.out.print("Enter the Phone number to remove :");
                        phoneNumber = sc.nextLong();
                        sc.nextLine();
                        System.out.print("Do you want to remove the contact (Y/N): ");
                        ch = sc.nextLine().charAt(0);
                        if(ch=='Y')
                            if(pb.removeContact(phoneNumber))
                                System.out.println("The contact is successfully deleted.");
                        break;
                case 5: System.exit(0);
            }
	    }while(choice>=1&&choice<=4);
    }
}