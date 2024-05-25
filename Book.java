/**
 * Represents a book with specific details such as author and ISBN.
 * Extends the {@code Title} class to include additional attributes.
 * 
 * @version Java 11 / VSCode
 * @since 2024-05-24 (date of last revision)
 * @author Yinglong Lin
 * @see Title
 */
public class Book extends Title{
    private String author;
    private String ISBN;
    /**
     * Default constructor for {@code Book} which initializes the book with default values.
     * Calls the superclass {@code Title} default constructor.
     */
    public Book(){
        super();
        author="none";
        ISBN = "none";
    }
    /**
     * Constructs a {@code Book} with the specified details.
     * 
     * @param callN      the call number of the book
     * @param title      the title of the book
     * @param publisher  the publisher of the book
     * @param year       the year of publication
     * @param copies     the number of copies available
     * @param author     the author of the book
     * @param ISBN       the ISBN of the book
     */
    public Book(String callN, String title, String publisher, int year, int copies, String author, String ISBN){
        super(callN,title,publisher,year,copies);
        this.author =author;
        this.ISBN=ISBN;
    }
    /**
     * Gets the author of the book.
     * 
     * @return the author of the book
     */
    public String getAuthor(){
        return author;
    }
    /**
     * Gets the ISBN of the book.
     * 
     * @return the ISBN of the book
     */
    public String getISBN(){
        return ISBN;
    }
    /**
     * Sets the author of the book.
     * 
     * @param author the author to set
     */
    public void setAuthor(String author){
        this.author =author;
    }
    /**
     * Sets the ISBN of the book.
     * 
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN){
        this.ISBN =ISBN;
    }
    /**
     * Returns a string representation of the book, including the details from the superclass.
     * 
     * @return a string representation of the book
     */
    public String toString(){
        String str = super.toString();
        str = str + String.format("%-12s\t%-10s",author,ISBN);
        return str;
    }
}