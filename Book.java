/**
 * Created by User on 3/10/2016.
 */
public class Book extends Product
{
    private String _bookTitle;
    private String _bookAuthor;

    public Book(String id, String desc, double price, String title, String author)
    {
        super(id, desc, price);
        this._bookTitle = title;
        this._bookAuthor = author;
    }

    public String getBookTitle()
    {
        return _bookTitle;
    }

    public String getBookAuthor()
    {
        return _bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + _bookTitle + '\'' +
                ", Author='" + _bookAuthor + '\'' +
                '}';
    }
}