package org.example;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class product {
    String name;
    Date date;
    boolean isNormal;
    boolean correctName;
    public product(String name, String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        this.name=name;
        this.date=formatter.parse(date);
        status(this.name);
        status(this.date);
        System.out.print("Name:" + name + "  Date:" + date + "  isNormal:"+ isNormal+ "  CorrectName: "+correctName+"\n");
    }
    private void status(String name)
    {
        if(this.name.equals(name))
            this.correctName=true;
        else this.correctName=false;
    }
    private  void status(Date date)
    {
        Date calendarDate = Calendar.getInstance().getTime();
        if(date.before(calendarDate))
            this.isNormal=false;
        else this.isNormal=true;
    }
}
