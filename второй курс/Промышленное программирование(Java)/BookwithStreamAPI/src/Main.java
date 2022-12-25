import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Book implements Comparable<Book> {

    String  name;
    String auth_name;
    List<Book>  MyList;
    public Book(String name,String auth_name){
        this.name = name;
        this.auth_name = auth_name;
    }

    public Book() {
    }
    @Override
    public String toString() {
        return name ;
    }
    public String getAuthName(){
        return this.auth_name;
    }
    public String GetName(){return name;}
    public String GetAuthName(){ return auth_name;}

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
    public int compareTo2(Book o){return this.auth_name.compareTo(o.auth_name);}
    public static List<Book>  AuthorBooks(List<Book> books , String auth_name){
        return books.stream()
                .filter(book ->book.auth_name.equals(auth_name))
                .collect(Collectors.toList());
    }
    public static Map<String , List<Book>> groupByAuthor(List<Book> books ) {
        return books.stream().collect (Collectors.groupingBy(Book:: getAuthName));
    }

}
public class Main {
    public static void main(String [] args) throws IOException {
        Book first = new Book("Harry Potter","J.K.Rowling");
        Book second = new Book("Witcher","Andrzej Sapkowski");
        Book third = new Book("Filosophi of java","Bruce Eckel");

        ArrayList <Book> list = new ArrayList<Book>();
        list.add(first);
        list.add(second);
        list.add(third);

        System.out.println("Enter author: ");
        Scanner in = new Scanner(System.in);
        String auth = in.nextLine();
        Map<String, List<Book>>  groupedByAuth = Book.groupByAuthor(list);


        System.out.println(groupedByAuth);

        System.out.println(groupedByAuth.get(auth));

        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("out.txt")));

        writer.write("Hello");
        writer.flush();
    }
}