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
    private String reference = "";
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int booknumPages, boolean required)
    {
        author = bookAuthor;
        title = bookTitle;
        numPages = booknumPages;
        courseText = required;
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
    
    public boolean getCourseText()
    {
        return courseText;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void increaseBorrowed()
    {
        borrowed += 1;
    }
    
    public void printDetails()
    {
        System.out.println("The title of the book is: " +title);
        System.out.println("The author of the book is: " + author);
        System.out.println("The number of pages is: " +numPages);
        System.out.println("Currently on page: " +reference);
        System.out.println("The book has been borrowed " + borrowed + " times");
        
    }
    
    public void setReference(String r)
    {
        reference = r;
        
        if(r.length() > 0)
        System.out.print(r);
        
        else
        System.out.print("error");
    }
}
