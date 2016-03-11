/**
 * Created by User on 3/10/2016.
 */
public class Book extends Product
{
    private String _bookTitle;
    private String _bookAuthor;

    public Book(String id, String desc, double price, String _bookTitle, String _bookAuthor)
    {
        super(id, desc, price);
        this._bookTitle = _bookTitle;
        this._bookAuthor = _bookAuthor;
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
                "_bookTitle='" + _bookTitle + '\'' +
                ", _bookAuthor='" + _bookAuthor + '\'' +
                '}';
    }
}