package org.example;

import java.text.ParseException;
import java.util.Calendar;

public class Cheese extends Product{
    int wetness;
    boolean isOpen;
    String hardnessType;
    public Cheese(String name, String date, int wetness) throws ParseException {
        super(name, date);
        this.wetness=wetness;
        hardnessType();
    }
    private void hardnessType()
    {
        if(wetness<51)
        hardnessType="Very hard cheese";
        else if (wetness< 56) {
            hardnessType = "Hard cheese";
        }
        else if(wetness<63){
            hardnessType="";
        }
        else if(wetness<69){
            hardnessType="Semi-hard cheese";
        }
        else if(wetness>69){
            hardnessType="Soft cheese";
        }
        else hardnessType="Uncorrected hardness";
    }
    private void status()
    {
        Calendar newDate = Calendar.getInstance();
        if(hardnessType.equals("Soft cheese")) {
            newDate.add(Calendar.DATE, 3);
            this.date = newDate.getTime();
        }
    }
    public void isOpen(boolean isOpen)
    {
        this.isOpen=isOpen;
        status();
    }
    public void writeProduct()
    {
        System.out.print("Name:" + name + "  Date:" + date + "  isNormal:"+ isNormal+ "  isInside:"+ isInside+ "  Cheese Type: "+ hardnessType +"\n");
    }
}
