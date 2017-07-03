package by.gsu.epamlab;

public class Purchase {
   public String commodityName;
   public double commodityPrice;
   public int quantity;
   public double cost;

   public Purchase() {
   }

   public Purchase(String commodityName, double commodityPrice, int quantity) {
      this.commodityName = commodityName;
      this.commodityPrice = commodityPrice;
      this.quantity = quantity;
      cost=calculateCost();
   }

   public String getCommodityName() {
      return commodityName;
   }

   public double getCommodityPrice() {
      return commodityPrice;
   }

   public int getQuantity() {
      return quantity;
   }

   public void setCommodityName(String commodityName) {
      this.commodityName = commodityName;
   }

   public void setCommodityPrice(int commodityPrice) {
      this.commodityPrice = commodityPrice;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public double getCost(){
      return cost;
   }

   /**
    * Calculating the purchase cost.
    * @return calculateCost()
    */

   public double calculateCost(){
      return quantity*commodityPrice;
    }

   @Override
   public String toString() {
      return  commodityName + ';' +
              commodityPrice +';'+ quantity+ ';' + getCost();
   }
}
