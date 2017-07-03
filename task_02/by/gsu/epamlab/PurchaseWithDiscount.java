package by.gsu.epamlab;

public class PurchaseWithDiscount extends Purchase{
    private double discountPercent;

    public PurchaseWithDiscount(String commodityName, double commodityPrice, int quantity, double discountPercent) {
        super(commodityName, commodityPrice, quantity);
        this.discountPercent = discountPercent;
        cost=calculateCost();
    }
    public double getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Calculating the purchase cost with discount.
     * @return calculateCost()
     */

    @Override
    public double calculateCost(){
        return ((commodityPrice-(commodityPrice*discountPercent/100))*quantity);
    }

    @Override
    public String toString() {
        return  commodityName + ';' +
                commodityPrice +';'+ quantity+ ';'+discountPercent+';' + getCost();
    }
}



