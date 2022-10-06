package org.example;

import java.util.ArrayList;


public class refrigerator {
    ArrayList<Product> productList;
    public refrigerator(ArrayList<Product> productList)
    {
        this.productList=productList;
        for (Product product:productList) {
            product.isInside =true;
            product.writeProduct();
        }
    }
    public void takeProduct(Product name)
    {
        this.productList.add(name);
        name.isInside=false;
        name.writeProduct();
    }
    public void takeProduct(Milk name)
    {
        this.productList.add(name);
        name.isOpen(true);
        name.isInside=false;
        name.writeProduct();
    }
    public void takeProduct(Cheese name)
    {
        this.productList.add(name);
        name.isOpen(true);
        name.isInside=false;
        name.writeProduct();
    }
    public void putProduct(Product name)
    {
        this.productList.remove(name);
        name.isInside=true;
        name.writeProduct();
    }
}
