package com.driver;

import java.sql.SQLOutput;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill="0";
    private int cheese;
    private int toppings;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraToppingsAdded = false;
        this.isExtraCheeseAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;
        this.bill = "";

        if(isVeg == true){
            price = 300;
            toppings = 70;
        } else {
            price = 400;
            toppings = 120;
        }
        this.cheese = 80;
        this.bill+="Base Price Of The Pizza:"+this.price+"\n";
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            this.price = this.price + cheese;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.price = this.price+toppings;
            this.isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded){
            this.price += 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){
            if(isExtraCheeseAdded){
                this.bill+="Extra Cheese Added: "+this.cheese+"\n";
            }
            if(isExtraToppingsAdded){
                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
            }
            if(isTakeAwayAdded){
                this.bill+="Paperbag Added: "+20+"\n";
            }
            this.bill+="Total Price: "+this.price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
