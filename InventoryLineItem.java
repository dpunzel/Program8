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
            _lineItemDiscountRate = 0.25;

        } else if (_lineItemQty >= 25)
        {
            _lineItemDiscountRate = 0.20;

        } else if (_lineItemQty >= 10)
        {
            _lineItemDiscountRate = 0.10;
        }

        else
        {
            _lineItemDiscountRate = 0.0;
        }

    }

    public void setLineItemSubtotal()
    {
        _lineItemSubtotal = _lineItemQty * this.getLineItemDiscountRate();
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
        CD myCD2 = new CD("id", "Classical2", 29.99, "mozart2");
        System.out.println(myCD.getProductDesc());
        System.out.println(myCD2.getProductPrice());
        System.out.println(myCD.getProductID());
        System.out.println(myCD.getCDTitle());
        InventoryLineItem myILI = new InventoryLineItem(myCD, 25);
        InventoryLineItem myILI2 = new InventoryLineItem(myCD2, 250);
        myILI.setLineItemDiscountRate();
        System.out.println(myILI.getLineItemDiscountRate());
        System.out.println(myILI.toString());




    }
}
