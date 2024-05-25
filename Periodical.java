/**
 * The {@code Periodical} class represents a periodical publication such as a magazine or journal.
 * It extends the {@code Title} class to include additional attributes specific to periodicals.
 * 
 * @version Java 11 / VSCode
 * @since 2024-05-24 (date of last revision)
 * @author Yinglong Lin
 * @see Title
 * @see Month
 */
public class Periodical extends Title{
    private Month month;
    private int issue;
    
    /**
     * Default constructor for {@code Periodical} which initializes the periodical with default values.
     * Calls the superclass {@code Title} default constructor.
     */
    public Periodical(){
        super();
        month = null;
        issue = 0;
    }
    
    /**
     * Constructs a {@code Periodical} with the specified details.
     * 
     * @param callN      the call number of the periodical
     * @param title      the title of the periodical
     * @param publisher  the publisher of the periodical
     * @param year       the year of publication
     * @param copies     the number of copies available
     * @param month      the month of publication
     * @param issue      the issue number of the periodical
     */
    public Periodical(String callN, String title, String publisher, int year, int copies, Month month, int issue){
        super(callN,title,publisher,year,copies);
        this.month =month;
        this.issue=issue;
    }
    
    /**
     * Gets the month of publication for the periodical.
     * 
     * @return the month of publication
     */
    public Month getMonth(){
        return month;
    }
    
    /**
     * Gets the issue number of the periodical.
     * 
     * @return the issue number
     */
    public int getIssue(){
        return issue;
    }
    
    /**
     * Sets the month of publication for the periodical.
     * 
     * @param month the month to set
     */
    public void setMonth(Month month){
        this.month =month;
    }
    
    /**
     * Sets the issue number for the periodical.
     * 
     * @param issue the issue number to set
     */
    public void setIssue(int issue){
        this.issue =issue;
    }

    /**
     * Returns a string representation of the periodical, including the details from the superclass.
     * 
     * @return a string representation of the periodical
     */
    @Override
    public String toString(){
        String str = super.toString();
        str += String.format("%-12s\t%-10d", month.value(), issue);
        return str;
    }
}