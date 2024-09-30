public class Book 
{
    private String title;
    private int numberOfPages;
    
    public Book(String newTitle, int newNumberOfPages)
    {
        setTitle(newTitle);
        setNumberOfPages(newNumberOfPages);
    }
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    public void setNumberOfPages(int newNumberOfPages)
    {
       if(newNumberOfPages > 0)
       {
        numberOfPages = newNumberOfPages;
       }
       else
       {
           System.out.println("Invalid Number Of Pages");
       }
    }
    public String getTitle()
       {
           return title;
       }
       public int getNumberOfPages()
       {
           return numberOfPages;
       }
    
}
