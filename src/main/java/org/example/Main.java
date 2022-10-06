package org.example;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ParseException {
        Cheese cheese = new Cheese("Cheese","10-10-2022",45);
        Cheese blueCheese = new Cheese("BlueCheese","05-10-2022",75);
        Product bread = new Product("Bread","02-10-2022");
        Milk niceMilk = new Milk("NiceMilk","8-10-2022","Pasteurized",false);
        Milk coolMilk = new Milk("CoolMilk","7-10-2022","fermented", false);
        ArrayList<Product> refrigeratorProducts=new ArrayList<>(Arrays.asList(cheese,blueCheese,bread,niceMilk,coolMilk));
        refrigerator firstRef=new refrigerator(refrigeratorProducts);
        firstRef.takeProduct(blueCheese);
        firstRef.putProduct(blueCheese);
        firstRef.takeProduct(coolMilk);
        firstRef.putProduct(coolMilk);
    }
}
