import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.PurchaseWithDiscount;
import by.gsu.epamlab.PurchaseWithQuantytiDiscount;

public class Runner {
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase("Milk", 25, 2);
        Purchase purchase2 = new Purchase("Juice", 36, 4);
        PurchaseWithDiscount purchaseWithDiscount1 =
                new PurchaseWithDiscount("Sweets", 63, 2, 7);
        PurchaseWithDiscount purchaseWithDiscount2 =
                new PurchaseWithDiscount("Coffee", 85, 1, 15);
        PurchaseWithQuantytiDiscount purchaseWithQuantytiDiscount1 =
                new PurchaseWithQuantytiDiscount("Apple", 25, 2);
        PurchaseWithQuantytiDiscount purchaseWithQuantytiDiscount2 =
                new PurchaseWithQuantytiDiscount("Sugar", 30, 5);

        Purchase[] array = {purchase1, purchase2, purchaseWithDiscount1, purchaseWithDiscount2,
                purchaseWithQuantytiDiscount1, purchaseWithQuantytiDiscount2};

        Purchase max = array[0];
        boolean equalPurchase = false;
        for (Purchase i : array) {
            System.out.println(i);
            if (max.getCost() < i.getCost()) {//*Finding the maximum cost purchase.
                max = i;
            }
            if (array[0].equals(i)) {//*Determine whether all purchases are equal.
                equalPurchase = true;
            } else {
                equalPurchase = false;
            }
        }
        System.out.println("The maximum cost purchase: " + max);
        System.out.println("Equal purchases: " + equalPurchase);
    }
}