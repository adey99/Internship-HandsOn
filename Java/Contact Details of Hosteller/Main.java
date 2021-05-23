import java.util.Scanner;
public class Main{
    public static Hosteller getHostellerDetails(){
        Hosteller h=new Hosteller();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int id = sc.nextInt();
        sc.nextLine();
        h.setStudentId(id);
        System.out.println("Student Name");
        String name = sc.nextLine();
        h.setName(name);
        System.out.println("Department Id");
        int deptid = sc.nextInt();
        sc.nextLine();
        h.setDepartmentId(deptid);
        System.out.println("Gender");
        String gen=sc.nextLine();
        h.setGender(gen);
        System.out.println("Phone Number");
        String ph=sc.nextLine();
        h.setPhone(ph);
        System.out.println("Hostel Name");
        String hname = sc.nextLine();
        h.setHostelName(hname);
        System.out.println("Room Number");
        int rno = sc.nextInt();
        sc.nextLine();
        h.setRoomNumber(rno);
        return h;
    }
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        Hosteller hr=getHostellerDetails();
        char choice;
        System.out.println("Modify Room Number(Y/N)");
        choice = sc.nextLine().charAt(0);
        if(choice=='Y'){
            System.out.println("New Room Number");
            int rno = sc.nextInt();
            sc.nextLine();
            hr.setRoomNumber(rno);
        }
        System.out.println("Modify Phone Number(Y/N)");
        choice = sc.nextLine().charAt(0);
        if(choice=='Y'){
            System.out.println("New Phone Number");
            String ph = sc.nextLine();
            hr.setPhone(ph);
        }
        System.out.println("The Student Details:");
        System.out.println(hr.getStudentId()+" "+hr.getName()+" "+hr.getDepartmentId()+" "+hr.getGender()+" "+hr.getPhone()+" "+hr.getHostelName()+" "+hr.getRoomNumber());
    }
}