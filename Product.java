/**
 * Created by User on 3/9/2016.
 */
public class Product
{
    private String _productID;
    private String _productDesc;
    private double _productPrice;

    public Product()
    {

    }
    public Product(String id, String desc, double price)
    {
        this._productID = id;
        this._productDesc = desc;
        _productPrice = price;
    }

    public String getProductID() {
        return _productID;
    }

    public String getProductDesc() {
        return _productDesc;
    }

    public double getProductPrice() {
        return _productPrice;
    }


}
