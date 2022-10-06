package org.example;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Product {
    String name;
    Date date;
    boolean isNormal;
    boolean isInside;
    public Product(String name, String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        this.name=name;
        this.date=formatter.parse(date);
        status(this.date);
    }
    private  void status(Date date)
    {
        Date calendarDate = Calendar.getInstance().getTime();
        this.isNormal= !date.before(calendarDate);
    }
    public void writeProduct()
    {
        System.out.print("Name:" + name + "  Date:" + date + "  isNormal:"+ isNormal+ "  isInside:"+ isInside+"\n");
    }
}
