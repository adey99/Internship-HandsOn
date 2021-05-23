import java.util.Scanner;
class Test{
    public static void calculateAverage(int[] age){
        float avg_age=0;
        for(int j=0;j<age.length;j++)
            avg_age+=age[j];
        avg_age=(float)(avg_age/age.length);
        System.out.printf("The average age is %.2f", avg_age);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_emp;
        System.out.println("Enter total no.of employees:");
        n_emp = sc.nextInt();
        if(n_emp<2){
            System.out.println("Please enter a valid employee count");
            return;
        }
        int[] age = new int[n_emp];
        System.out.println("Enter the age for "+n_emp+" employees:");
        for(int i=0;i<n_emp;i++){
            age[i] = sc.nextInt();
            if(age[i]<28||age[i]>40){
                System.out.println("Invalid age encountered!");
                return;
            }
        }
        calculateAverage(age);
    }
}