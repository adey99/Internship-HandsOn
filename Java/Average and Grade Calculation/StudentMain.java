import java.util.Scanner;
public class StudentMain{
    public static Student getStudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        int nsub;
        do{
        System.out.println("Enter the no of subjects:");
        nsub=sc.nextInt();
        sc.nextLine();
        if(nsub<=0)
            System.out.println("Invalid number of subject");
        }while(nsub<=0);
        int[] marks=new int[nsub];
        for(int i=0;i<marks.length;i++){
            do{
                System.out.println("Enter mark for subject "+(i+1)+":");
                marks[i]=sc.nextInt();
                sc.nextLine();
                if(marks[i]<0||marks[i]>100)
                    System.out.println("Invalid Mark");
            }while(marks[i]<0||marks[i]>100);
        }
        Student st=new Student(id,name,marks);
        return st;
    }
    public static void main (String[] args) {
        Student st=getStudentDetails();
        st.calculateAvg();
        st.findGrade();
        System.out.println("Id:"+st.getId());
        System.out.println("Name:"+st.getName());
        System.out.printf("Average:%.2f"+st.getAverage());
        System.out.println("Grade:"+st.getGrade());
    }
}