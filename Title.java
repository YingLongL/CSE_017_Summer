/**
 * The {@code Title} class represents general information about a publication.
 * It is an abstract class that serves as a base for specific types of publications.
 * @author Yinglong Lin
 * @version Java 11 / VSCode
 * @since 2024-05-24 (date of last revision)
 */
public abstract class Title{
    
    protected String callN, title, publisher;
    protected int year, copies;
    
    protected Title(){
        this( "none", "none", "none", 0, 0);
    }
    
    /**
     * Constructs a {@code Title} with the specified details.
     * 
     * @param callN      the call number of the publication
     * @param title      the title of the publication
     * @param publisher  the publisher of the publication
     * @param year       the year of publication
     * @param copies     the number of copies available
     */
    protected Title(String callN, String title, String publisher, int year, int copies){
        this.callN = callN;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.copies = copies;
    }

    /**
     * Gets the call number of the publication.
     * 
     * @return the call number
     */
    public String getCallN(){
         return callN;
    }

    /**
     * Gets the title of the publication.
     * 
     * @return the title
     */
    public String getTitle(){
        return title;
    }

    /**
     * Gets the publisher of the publication.
     * 
     * @return the publisher
     */
    public String getPublisher(){
        return publisher;
    }
    
    /**
     * Gets the year of publication.
     * 
     * @return the year
     */
    public int getYear(){
        return year;
    }

    /**
     * Gets the number of copies available.
     * 
     * @return the number of copies
     */
    public int getCopies(){
        return copies;
    }

    /**
     * Sets the call number of the publication.
     * 
     * @param callN the call number to set
     */
    public void setCallN(String callN){
        this.callN = callN;
    }

    /**
     * Sets the title of the publication.
     * 
     * @param title the title to set
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Sets the publisher of the publication.
     * 
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    /**
     * Sets the year of publication.
     * 
     * @param year the year to set
     */
    public void setYear(int year){
        this.year = year;
    }

    /**
     * Sets the number of copies available.
     * 
     * @param copies the number of copies to set
     */
    public void setCopies(int copies){
        this.copies = copies;
    }

    /**
     * Returns a string representation of the {@code Title} object, including its details.
     * 
     * @return a string representation of the {@code Title}
     */
    @Override
    public String toString(){
        String str = String.format("%-12s\t%-35s\t%-25s\t%-5d\t%-8d", callN, title, publisher, copies, year);
        return str;
    }
}