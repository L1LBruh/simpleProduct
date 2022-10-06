package org.example;

import java.text.ParseException;
import java.util.Calendar;

public class Milk extends Product{
    String milkType;
    boolean isOpen;
    public Milk(String name, String date, String milkType,boolean isOpen) throws ParseException {
        super(name, date);
        this.milkType=milkType;
        this.isOpen=isOpen;
        status();
    }
    private void status(){
        Calendar newDate = Calendar.getInstance();
        if(isOpen)
        {
            switch (milkType.toLowerCase()) {
                case "pasteurized" -> {
                    newDate.add(Calendar.DATE, 2);
                    this.date = newDate.getTime();
                }
                case "sterilized" -> {
                    newDate.add(Calendar.DATE, 4);
                    this.date = newDate.getTime();
                }
                case "fermented" -> {
                    newDate.add(Calendar.DATE, 3);
                    this.date = newDate.getTime();
                }
            }
        }
    }
    public void isOpen(boolean isOpen){
        this.isOpen=isOpen;
        status();
    }
    public void writeProduct()
    {
        System.out.print("Name:" + name + "  Date:" + date + "  isNormal:"+ isNormal+ "  isInside:"+ isInside+ "  Milk Type: "+ milkType.toLowerCase()+"\n");
    }
}
