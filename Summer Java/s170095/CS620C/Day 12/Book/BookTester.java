
/**
 * Program to test Book class
 * 
 * @author James Basquill
 * @author 17186285
 * @version 12/9/17
 */
public class BookTester
{
    public static void main(String[] args)
    {
        Book[] favBooks = new Book[3];
        favBooks[0] = new Book("Magician",545,1982,"Raymond E. Feist","Fantasy novel");
        favBooks[1] = new Book("Gardens of the Moon", 712, 1999, "Steven Erikson", "High Fantasy");
        favBooks[2] = new Book("Sabriel", 491, 1995, "Garth Nix", "Fantasy novel");
        favBooks[0].printBook();
        favBooks[1].printBook();
        favBooks[2].printBook();
    }
}
