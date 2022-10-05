package org.example;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException {

        product chees = new product("Chees","10-10-2022");
        product blueChees = new product("BlueChees","05-10-2022");
        product bread = new product("Bread","02-10-2022");
        ArrayList<product> products=new ArrayList<>();
        refrigerator firstRef=new refrigerator(products);
        firstRef.putProduct(chees);
        firstRef.putProduct(blueChees);
        firstRef.putProduct(bread);
        firstRef.takeProduct(blueChees);
    }
}
