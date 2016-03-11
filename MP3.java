/**
 * Created by User on 3/10/2016.
 */
public class MP3 extends Product
{
    private int _mp3Memory;

    public MP3(String id, String desc, double price, int memory)
    {
        super(id, desc, price);
        this._mp3Memory = memory;
    }

    public int getMP3Memory()
    {
        return _mp3Memory;
    }

    @Override
    public String toString()
    {
        return "MP3{" +
                "Memory=" + _mp3Memory +
                '}';
    }
}
