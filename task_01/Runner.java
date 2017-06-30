package by.gsu.epamlab;

import java.util.ArrayList;
import  java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class Runner {
    private static Purchase p;

    public static void main(String[] args) {
        List<Purchase> purchase = new ArrayList<Purchase>();
        purchase.add(new Purchase("Milk", 2600, 1, 25));
        purchase.add(new Purchase("Coffee", 3600, 1, 10));
        purchase.add(new Purchase("Potato", 200, 1, 15));
        System.out.println( purchase);

        int sum =0;
        int res=0;
        for(Purchase i: purchase){
            System.out.println(i);
            sum+=i.getPrice();
            if (i.getDate()==10){
              res=1;
            }else
                res=0;
        }
                System.out.println("Value of all purchases-" + sum);
        if (res==1){
            System.out.println("On the 10th day the purchase was made");}
            else
                System.out.println("There were no purchases on the 10th day");

        Collections.sort(purchase, new Comparator<Purchase>() {
            public int compare(Purchase date1, Purchase date2) {
                return date1.getDate() - date2.getDate();
            }
        });
        System.out.println(purchase);








}
}