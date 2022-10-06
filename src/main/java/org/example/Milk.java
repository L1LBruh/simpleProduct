package org.example;

import java.text.ParseException;
import java.util.Calendar;

public class Milk extends Product{
    String itemType;
    boolean isOpen;
    public Milk(String name, String date, String itemType,boolean isOpen) throws ParseException {
        super(name, date);
        this.itemType=itemType;
        this.isOpen=isOpen;
        status();
    }
    private void status(){
        Calendar newDate = Calendar.getInstance();
        if(isOpen)
        {
            switch (itemType.toLowerCase()) {
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
}
