/**
 * Created by User on 3/10/2016.
 */
public class InventoryLineItem
{
    private static int instanceCounter;
    private int _lineItemNum;
    private Product _product;
    private int _lineItemQty;
    private double _lineItemDiscountRate;
    private double _lineItemSubtotal;


    public InventoryLineItem(Product product, int lineItemQty)
    {
        InventoryLineItem.instanceCounter++;
        _lineItemNum = instanceCounter;
        this._product = product;
        this._lineItemQty = lineItemQty;
    }

    public void setLineItemDiscountRate()
    {
        if (_lineItemQty >= 50)
        {
            _lineItemDiscountRate = 0.75;

        } else if (_lineItemQty >= 25)
        {
            _lineItemDiscountRate = 0.80;

        } else if (_lineItemQty >= 10)
        {
            _lineItemDiscountRate = 0.90;
        }

        else
        {
            _lineItemDiscountRate = 1;
        }

    }

    public void setLineItemSubtotal()
    {
        _lineItemSubtotal = _lineItemQty * getProduct().getProductPrice() * _lineItemDiscountRate;
    }

    public int getLineItemNum()
    {
        return _lineItemNum;
    }

    public Product getProduct()
    {
        return _product;
    }

    public int getLineItemQty()
    {
        return _lineItemQty;
    }

    public double getLineItemDiscountRate()
    {
        return _lineItemDiscountRate;
    }

    public double getLineItemSubtotal()
    {
        return _lineItemSubtotal;
    }

    @Override
    public String toString()
    {
        return "InventoryLineItem{" +
                "_lineItemNum=" + _lineItemNum +
                ", _product=" + _product +
                ", _lineItemQty=" + _lineItemQty +
                ", _lineItemDiscountRate=" + _lineItemDiscountRate +
                ", _lineItemSubtotal=" + _lineItemSubtotal +
                '}';
    }

    public static void main(String[] args)
    {
        CD myCD = new CD("id", "Classical", 24.99, "mozart");
        Book myBook = new Book("theId", "aBook", 52.99, "BookTitleWow", "AwesomeAuthor");
        InventoryLineItem myILI = new InventoryLineItem(myCD, 25);
        InventoryLineItem myILI2 = new InventoryLineItem(myBook, 50);
        //CD myCD2 = new CD("id", "Classical2", 29.99, "mozart2");
        System.out.println(myCD.getProductDesc());
        System.out.println(myCD.getProductPrice());
        System.out.println(myCD.getProductID());
        System.out.println(myCD.getCDTitle());
        //InventoryLineItem myILI = new InventoryLineItem(myCD, 25);
        //InventoryLineItem myILI2 = new InventoryLineItem(myCD2, 250);
        myILI.setLineItemSubtotal();
        myILI.setLineItemDiscountRate();
        myILI2.setLineItemDiscountRate();
        System.out.println(myILI.getLineItemDiscountRate());
        System.out.println(myILI.toString());
        System.out.println(myILI2.toString());
        System.out.println(myILI.getLineItemSubtotal());






    }
}
