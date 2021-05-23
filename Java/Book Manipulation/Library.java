import java.util.*;
public class Library{
    private ArrayList<Book> bookList;
    public Library(){
        bookList = new ArrayList<Book>();
    }
    public ArrayList<Book> getBookList(){
        return this.bookList;
    }
    public void setBookList(ArrayList<Book> bookList){
        this.bookList = bookList;
    }
    public void addBook(Book bobj){
        bookList.add(bobj);
    }
    public boolean isEmpty(){
        if(this.bookList.isEmpty())
            return true;
        else
            return false;
    }
    public ArrayList<Book> viewAllBooks(){
        return this.bookList;
    }
    public ArrayList<Book> viewBooksByAuthor(String author){
        ArrayList<Book> l2=new ArrayList<Book>();
        for(Book b:this.bookList){
            if(b.getAuthor().equals(author)){
                l2.add(b);
            }
        }
        return l2;
    }
    public int countnoofbook(String bname){
        int count=0;
        for(Book b:this.bookList){
            if(b.getBookName().equals(bname))
                count++;
        }
        return count;
    }   
}