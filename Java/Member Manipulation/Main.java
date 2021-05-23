import java.util.*;
public class Main{
    public static void main (String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int id,choice;
        String name,address;
        Member m;
        List<Member> list = new ArrayList<Member>();
        do{
           System.out.println("1.Add Member\n2.View All Members\n3.Search Member by address\n4.Exit\nEnter your choice:");
           choice = sc.nextInt();
           sc.nextLine();
           switch(choice){
               case 1:  System.out.println("Enter the id:");
                        id=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the name:");
                        name=sc.nextLine();
                        System.out.println("Enter the address:");
                        address =sc.nextLine();
                        m = new Member(id,name,address);
                        lib.addMember(m);
                        break;
                case 2: list = lib.viewAllMembers();
                        for(Member mb:list){
                            System.out.println("Id:"+mb.getMemberId());
                            System.out.println("Name:"+mb.getMemberName());
                            System.out.println("Address:"+mb.getAddress());
                        }
                        break;
                case 3: System.out.println("Enter the address:");
                        address = sc.nextLine();
                        list = lib.viewMembersByAddress(address);
                        for(Member mb:list){
                            System.out.println("Id:"+mb.getMemberId());
                            System.out.println("Name:"+mb.getMemberName());
                            System.out.println("Address:"+mb.getAddress());
                        }
                        break;
                case 4: System.exit(0);
           }
        }while(choice>=1&&choice<=3);
    }
}