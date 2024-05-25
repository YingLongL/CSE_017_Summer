/** Month
 * @author  Yinglong Lin
 * @version Java 11 / VSCode
 * @since   2024-05-24 (date of last revision) 
*/

public enum Month{
    JANUARY ("January"),
    FEBRUARY ("February"),
    MARCH ("March"),
    APRIL ("April"),
    MAY ("May"),
    JUNE ("June"),
    JULY ("July"),
    AUGUST ("August"),
    SEPTEMBER ("September"),
    OCTOBER ("October"),
    NOVEMBER ("November"),
    DECEMBER ("December");

    // Private field to hold the full name of the month.
    private final String value;
    Month(String val){
        value= val;
    }
    /**
     * Gets the full name of the month.
     * 
     * @return The full name of the month.
     */
    public String value() { return value;}

}