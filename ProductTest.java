import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;

/**
 * Created by User on 3/12/2016.
 */
public class ProductTest
{
    public static final String EXPECTED_ID = "one";
    public static final String EXPECTED_DESC = "classical";
    public static final double EXPECTED_PRICE = 24.99;
    public static final String EXPECTED_TITLE = "Mozart";

    private CD _cd1;// = new CD(EXPECTED_ID, EXPECTED_DESC, EXPECTED_PRICE, EXPECTED_TITLE);
    private CD _cd2;// = new CD("", "",0.0 , "");

    @Before
    public void initialize()
    {
        _cd1 = new CD(EXPECTED_ID, EXPECTED_DESC, EXPECTED_PRICE, EXPECTED_TITLE);
        _cd2 = new CD("", "",0 , "");
    }

    @Test
    public void testConstructor() throws Exception
    {
        Assert.assertNotNull(_cd1);
        Assert.assertTrue(_cd1 instanceof CD);
        this.testGetProductDesc();
        this.testGetProductID();
        this.testGetProductPrice();

    }
//
//    @Before
//    public void setUp() throws Exception {
//
//    }

    @Test
    public void testGetProductID() throws Exception
    {
        Assert.assertEquals(_cd1.getProductID(), EXPECTED_ID);
    }

    @Test
    public void testGetProductDesc() throws Exception
    {
        Assert.assertEquals(_cd1.getProductDesc(), EXPECTED_DESC);
    }

    @Test
    public void testGetProductPrice() throws Exception
    {
        Assert.assertEquals(_cd1.getProductPrice(), EXPECTED_PRICE, 0.0);
    }
}