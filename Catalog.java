/**
 * The {@code Catalog} class represents a collection of {@code Title} objects.
 * It provides methods to add titles, find titles by different criteria, and sort the titles.
 * 
 * @version Java 11 / VSCode
 * @since 2024-05-24 (date of last revision)
 * @author Yinglong Lin
 * @see Title
 */
import java.util.ArrayList;

public class Catalog {
    private Title[] titles;
    private int count;
    
    /**
     * Constructs an empty {@code Catalog} with a default capacity of 50 titles.
     */
    public Catalog(){
        this.titles = new Title[50];
        this.count = 0;
    }
    
    /**
     * Returns the number of titles in the catalog.
     * 
     * @return the number of titles in the catalog
     */
    public int getCount(){
        return count;
    }
    
    /**
     * Adds a new {@code Title} to the catalog.
     * 
     * @param t the title to be added
     * @return {@code true} if the title was added successfully, {@code false} if the catalog is full
     */
    public boolean addTitle(Title t){
        if (count<titles.length){
            titles[count] = t;
            count++;
            return true;
        } else{
            return false;
        }
    }
    
    /**
     * Finds a {@code Title} in the catalog by its call number.
     * 
     * @param callN the call number of the title to find
     * @return the {@code Title} with the specified call number, or {@code null} if not found
     */
    public Title findCallN(String callN) {
        for (int i = 0; i < count; i++) { 
            if (titles[i].getCallN().equals(callN)) {
                return titles[i]; 
            }
        }
        return null; 
    }
    
    /**
     * Finds titles in the catalog by their title.
     * 
     * @param title the title of the titles to find
     * @return an array of {@code Title} objects that match the specified title, or {@code null} if none found
     */
    public Title[] findTitle(String title) {
        ArrayList<Title> matchingTitles = new ArrayList<>();

        for (int i = 0; i < this.count; i++) {
            if (this.titles[i].getTitle().toLowerCase().equals(title.toLowerCase())) {
                matchingTitles.add(this.titles[i]);
            }
        }

        if (matchingTitles.isEmpty()) {
            return null;
        } else {
            return matchingTitles.toArray(new Title[0]);
        }
    }
    
    /**
     * Finds titles in the catalog by their year of publication.
     * 
     * @param year the year of publication to find
     * @return an array of {@code Title} objects that match the specified year, or {@code null} if none found
     */
    public Title[] findYear(int year) {
        ArrayList<Title> matchingTitles = new ArrayList<>();

        for (int i = 0; i < this.count; i++) {
            if (this.titles[i].getCopies() == year) { 
                matchingTitles.add(this.titles[i]);
            }
        }
        if (matchingTitles.isEmpty()) {
            return null; 
        } else {
            return matchingTitles.toArray(new Title[0]);
        }
    }

    /**
     * Sorts the titles in the catalog by their year of publication in ascending order.
     */
    public void sort() {
        for (int i = 1; i < count; i++) { 
            Title currentTitle = titles[i];
            int currentYear = titles[i].getCopies();
            int j = i;
            while (j > 0 && currentYear < titles[j - 1].getCopies()) {
                titles[j] = titles[j - 1];
                j--;
            }
            titles[j] = currentTitle;
        }
    }

    public String toString() {
        String str = "";
        System.out.printf("%-12s\t%-35s\t%-25s\t%-5s\t%-7s\t%-12s\t%-10s\t\n", "Call Number","Title","Publisher","Year","#Copies","Author/Month","ISBN/Issue");
        for (int i = 0; i < count; i++) {
            if(titles[i].getCallN().charAt(0)=='B'){
                Book b = (Book) titles[i];
                str += b.toString();
                str += "\n";
            }
            if(titles[i].getCallN().charAt(0)== 'P'){
                Periodical p = (Periodical) titles[i];
                str += p.toString();
                str += "\n";
            }
        }
        return str;
    }
}