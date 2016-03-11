/**
 * Created by User on 3/9/2016.
 */
public class CD extends Product
{
    private String _cdTitle;


    public CD(String id, String desc, double price, String title)
    {
        super(id, desc, price);
        this._cdTitle = title;
    }

    public String getCDTitle()
    {
        return _cdTitle;
    }

    @Override
    public String toString()
    {
        return "CD{" +
                "Title='" + _cdTitle + '\'' +
                '}';
    }
}
