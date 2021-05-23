import java.util.*;
public class TestApplication {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    AddressBook ab = new AddressBook();
	    String name,street,city,state;
	    long phno;
	    System.out.println("Enter the permanent address");
	    System.out.println("Enter the house name");
	    name = sc.nextLine();
	    ab.getPermAddress().setName(name);
	    System.out.println("Enter the street");
	    street = sc.nextLine();
	    ab.getPermAddress().setStreet(street);
	    System.out.println("Enter the city");
	    city = sc.nextLine();
	    ab.getPermAddress().setCity(city);
	    System.out.println("Enter the state");
	    state = sc.nextLine();
	    ab.getPermAddress().setState(state);
	    System.out.println("Enter the temporary address");
	    System.out.println("Enter the house name");
	    name = sc.nextLine();
	    ab.getTempAddress().setName(name);
	    System.out.println("Enter the street");
	    street = sc.nextLine();
	    ab.getTempAddress().setStreet(street);
	    System.out.println("Enter the city");
	    city = sc.nextLine();
	    ab.getTempAddress().setCity(city);
	    System.out.println("Enter the state");
	    state = sc.nextLine();
	    ab.getTempAddress().setState(state);
	    System.out.println("Enter the phone number");
	    phno =sc.nextLong();
	    sc.nextLine();
	    ab.setPhoneNumber(phno);
	    System.out.println("Permanent address");
	    System.out.println("House name:"+ab.getPermAddress().getName());
	    System.out.println("Street:"+ab.getPermAddress().getStreet());
	    System.out.println("City:"+ab.getPermAddress().getCity());
	    System.out.println("State:"+ab.getPermAddress().getState());
	    System.out.println("Temporary address");
	    System.out.println("House name:"+ab.getTempAddress().getName());
	    System.out.println("Street:"+ab.getTempAddress().getStreet());
	    System.out.println("City:"+ab.getTempAddress().getCity());
	    System.out.println("State:"+ab.getTempAddress().getState());
	    System.out.println("Phone number\n"+ab.getPhoneNumber());
	    
	}
}