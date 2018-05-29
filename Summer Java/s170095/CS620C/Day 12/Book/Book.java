
/**
 * Class for a book
 * 
 * @author James Basquill
 * @author 17186285
 * @version 12/9/17
 */
public class Book
{
    String title;
    int pages;
    int year;
    String author;
    String genre;

    /**
     * Default constructor for objects of class Book
     */
    public Book()
    {
        String title = "undefined";
        int pages = 0;
        int year = 1900;
        String author = "undefined";
        String genre = "undefined";
    }
    /**
     * Constructor for objects of class Book
     * @param t, the title of the book
     * @param p, the number of pages i the book
     * @param y, the year of publication
     * @param a, the author of the book
     * @param g, the genre of the book
     */
    public Book(String t,int p, int y, String a, String g)
    {
        title = t;
        pages = p;
        year = y;
        author = a;
        genre = g;
    }

    /**
     * Getter method for the title of the book
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * Getter method for the pages of the book
     */
    public int getPages()
    {
        return pages;
    }
    /**
     * Getter method for the year of publication
     */
    public int getYear()
    {
        return year;
    }
    /**
     * Getter method for the author of the book
     */
    public String getAuthor()
    {
        return author;
    }
    /**
     * Getter method for the genre of the book
     */
    public String getGenre()
    {
        return genre;
    }
    
    /**
     * Setter method for the title of the book
     */
    public void setTitle(String t)
    {
        title = t;
    }
    /**
     * Setter method for the pages of the book
     */
    public void setPages(int p)
    {
        pages = p;
    }
    /**
     * Setter method for the year of publication
     */
    public void setYear(int y)
    {
        year = y;
    }
    /**
     * Setter method for the author of the book
     */
    public void setAuthor(String a)
    {
        author = a;
    }
    /**
     * Setter method for the genre of the book
     */
    public void setGenre(String g)
    {
        genre = g;
    }
    
    /**
     * Method to print out the values of the book
     */
    public void printBook()
    {
        System.out.println("Title\t:"+title);
        System.out.println("Pages\t:"+pages);
        System.out.println("Year\t:"+year);
        System.out.println("Author\t:"+author);
        System.out.println("Genre\t:"+genre);
    }
}
