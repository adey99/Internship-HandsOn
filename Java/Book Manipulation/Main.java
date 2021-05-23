import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<Book>();
        Library lib = new Library();
        int choice,isbnno;
        String bname,author;
        do{
           System.out.println("1.Add Book\n2.Display all book details\n3.Search Book by author\n4.Count number of books - by book name\n5.Exit\nEnter your choice:");
           choice = sc.nextInt();
           sc.nextLine();
           switch(choice){
               case 1:  Book bobj = new Book();
                        System.out.println("Enter the isbn no:");
                        isbnno = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the book name:");
                        bname = sc.nextLine();
                        System.out.println("Enter the author name:");
                        author = sc.nextLine();
                        lib.addBook(bobj);
                        break;
                case 2: list = lib.viewAllBooks();
                        if(lib.isEmpty()){
                            System.out.println("The list is empty");
                            break;
                        }
                        for(Book b:list){
                            System.out.println("ISBN no: "+b.getIsbnno());
                            System.out.println("Book name: "+ b.getBookName());
                            System.out.println("Author Name: "+b.getAuthor());
                        }
                        break;
                case 3: System.out.println("Enter the author name:");
                        author = sc.nextLine();
                        list = lib.viewBooksByAuthor(author);
                        if(list.isEmpty()){
                            System.out.println("None of the book published by the author "+author);
                            break;
                        }
                        for(Book b:list){
                            System.out.println("ISBN no: "+b.getIsbnno());
                            System.out.println("Book name: "+ b.getBookName());
                            System.out.println("Author Name: "+b.getAuthor());
                        }
                        break;
                case 4: System.out.println("Enter the author name:");
                        bname = sc.nextLine();
                        System.out.println("Count:"+lib.countnoofbook(bname));
                        break;
                case 5: System.exit(0);
           }
        }while(choice>=1&&choice<=4);
    }
}