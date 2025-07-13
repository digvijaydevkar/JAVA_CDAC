package com.app;

public class Fruit {
    private String name;
    private String col;
    private double wt;
    private boolean isfresh;
    
    public Fruit(String name, String col, double wt) {
   	   this.name=name;
   	   this.col=col;
   	   this.wt=wt;
   	   this.isfresh=true;
   	 
    }
    
    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isfresh;
    }

    public void setFresh(boolean fresh) {
        isfresh = fresh;
    }

    public String taste() {
        return "no specific taste";
    }

    @Override
    public String toString() {
        return "Fruit: " + name + ", Color: " + col + ", Weight: " + wt;
    }
	
}

