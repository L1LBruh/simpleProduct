package org.example;

import java.util.ArrayList;


public class refrigerator {
    ArrayList<product> productList = new ArrayList<>();
    public refrigerator(ArrayList<product> productList)
    {
        this.productList=productList;
        for (product products:productList) {
            System.out.println(products);
        }
    }
    public void takeProduct(product name)
    {
        this.productList.add(name);
        for (product products:productList) {
            System.out.println(products);
        }
    }
    public void putProduct(product name)
    {
        this.productList.remove(name);
        for (product products:productList) {
            System.out.println(products);
        }
    }
}
