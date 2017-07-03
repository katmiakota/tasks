package by.gsu.epamlab;

public class PurchaseWithQuantytiDiscount extends Purchase{
    private double discountPercent=10;

    public PurchaseWithQuantytiDiscount(String commodityName, double commodityPrice, int quantity) {
        super(commodityName, commodityPrice, quantity);
        cost=calculateCost();
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Calculating the purchase cost with discount depending from quantity purchased goods .
     * @return calculateCost()
     */

    @Override
    public double calculateCost() {
        if(quantity>=3) {
            return ((commodityPrice-(commodityPrice*discountPercent/100))*quantity);
        }
            else {
            return (quantity*commodityPrice);
        }
    }
}
