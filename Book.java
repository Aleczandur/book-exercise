/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int numPages;
   
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int booknumPages)
    {
        author = bookAuthor;
        title = bookTitle;
        numPages = booknumPages;
    }

    
    /**
     * Method to print the author and title of book
     * 
     */
    public void printAuthor()
    {
        System.out.print(author);
    }
    
    public void printTitle()
    {
        System.out.print(title);
    }
    
    public int getnumPages()
    {
        return numPages;
    }
}
