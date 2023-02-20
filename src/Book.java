
import java.math.BigDecimal;

public class Book {
    private String myTitle;
    private String myAuthor;
    private String myPublisher;
    private BigDecimal myBookPrice;
    public Book(final String theTitle, final String theAuthor,
                final String thePublisher, BigDecimal theBookPrice){
        myTitle = theTitle;
        myAuthor = theAuthor;
        myPublisher = thePublisher;
        myBookPrice = theBookPrice;
    }
    public String getMyTitle(){
        return myTitle;
    }
    public String getMyAuthor(){
        return myAuthor;
    }
    public String getMyPublisher(){
        return myPublisher;
    }
    public Long getMyBookPrice(){
        return Long.valueOf(String.valueOf(myBookPrice));

    }
    @Override
    public String toString(){
        return "Book {" + "Title =' " + myTitle + '\'' + ", Author = ' " + myAuthor + '\''+
                ", Publisher = '" + myPublisher + '\'' + ", Book Price = '" + myBookPrice  +'}' + '\n';
    }




}
