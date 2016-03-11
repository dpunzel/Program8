/**
 * Created by User on 3/10/2016.
 */
public class MP3 extends Product
{
    private int _mp3Memory;

    public MP3(String id, String desc, double price, int _mp3Memory)
    {
        super(id, desc, price);
        this._mp3Memory = _mp3Memory;
    }

    public int getMP3Memory()
    {
        return _mp3Memory;
    }

    @Override
    public String toString()
    {
        return "MP3{" +
                "_mp3Memory=" + _mp3Memory +
                '}';
    }
}
