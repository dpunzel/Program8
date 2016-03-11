/**
 * Created by User on 3/9/2016.
 */
public class CD extends Product
{
    private String _cdTitle;


    public CD(String id, String desc, double price, String _cdTitle)
    {
        super(id, desc, price);
        this._cdTitle = _cdTitle;
    }

    public String getCDTitle()
    {
        return _cdTitle;
    }

    @Override
    public String toString()
    {
        return "CD{" +
                "_cdTitle='" + _cdTitle + '\'' +
                '}';
    }
}
