import java.util.Scanner;
public class StudentMain{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st;
        int flag=1;
        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student's Name:");
        String name=sc.nextLine();
        System.out.println("Enter Student's address:");
        String addr=sc.nextLine();
        do{
            System.out.println("Whether the student is from NIT(Yes/No):");
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("YES")){
                st = new Student(id,name,addr);
                System.out.println("Student id:"+ st.getStudentId());
                System.out.println("Student name:"+st.getStudentName());
                System.out.println("Address:"+st.getStudentAddress());
                System.out.println("College name:"+st.getCollegeName());
            }
            else if(choice.equalsIgnoreCase("NO")){
                System.out.println("Enter the college name:");
                String colname=sc.nextLine();
                st = new Student(id,name,addr,colname);
                System.out.println("Student id:"+ st.getStudentId());
                System.out.println("Student name:"+st.getStudentName());
                System.out.println("Address:"+st.getStudentAddress());
                System.out.println("College name:"+st.getCollegeName());
            }
            else{
                System.out.println("Wrong Input");
                flag=0;
            }
        }while(flag==0);
    }
}