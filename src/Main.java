import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Declaring ArrayList lol
        List<Book> listOfBooks = new ArrayList<>();
        Book javaInAction = new Book("Java in Action",
                "Yaxye Muxamed", "Malable", new BigDecimal(600));
        Book JavaCore = new Book("Java Core", "Yasin", "Shuceyp docs",
                new BigDecimal(800));
        Book advancedDatabases = new Book("advanced Databases", "Abdurazak", "Burtinle",
                new BigDecimal(250));
        listOfBooks.add(javaInAction);
        listOfBooks.add(JavaCore);
        listOfBooks.add(advancedDatabases);
        System.out.println(listOfBooks);


    }
}