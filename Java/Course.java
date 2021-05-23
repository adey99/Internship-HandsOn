import java.util.Scanner;
class Course{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String search_course;
        String[] courses = new String[20];
        System.out.println("Enter no of course:");
        n = sc.nextInt();
        sc.nextLine();
        if(n<=0||n>20){
            System.out.println("Invalid Range");
            return;
        }
        System.out.println("Enter course names:");
        for(int i = 0;i<n;i++){
            courses[i]= sc.nextLine();
        }
        System.out.println("Enter the course to be searched:");
        search_course =sc.nextLine();
        for(int j=0;j<n;j++){
            if(courses[j].equals(search_course)){
                System.out.println(search_course+" course is available");
                return;
            }
        }
        System.out.println(search_course+" course is not available");
    }
}