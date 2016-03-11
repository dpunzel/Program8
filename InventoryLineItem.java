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


    public InventoryLineItem(Product _product, int _lineItemQty)
    {
        InventoryLineItem.instanceCounter++;
        _lineItemNum = instanceCounter;
        //this._lineItemNum = _lineItemNum;
        this._product = _product;
        this._lineItemQty = _lineItemQty;
    }

    public void setLineItemDiscountRate()
    {
        if (_lineItemSubtotal >= 0)
        {
            _lineItemDiscountRate = 0.0;

        } else if (_lineItemSubtotal >= 10)
        {
            _lineItemDiscountRate = 0.10;

        } else if (_lineItemSubtotal >= 25)
        {
            _lineItemDiscountRate = 0.20;
        }

        else
        {
            _lineItemDiscountRate = .25;
        }

    }

    public void setLineItemSubtotal()
    {

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
        System.out.println(myCD.getProductDesc());
        System.out.println(myCD.getProductPrice());
        System.out.println(myCD.getProductID());
        System.out.println(myCD.getCDTitle());
        InventoryLineItem myILI = new InventoryLineItem(myCD, 25);
        myILI.setLineItemDiscountRate();
        System.out.println(myILI._lineItemDiscountRate);




    }
}
