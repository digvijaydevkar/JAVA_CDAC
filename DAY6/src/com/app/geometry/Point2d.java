
package com.app.geometry;

public class Point2d {

	private double x;
	private double y;
	
	
	public Point2d(){
		this.x=0.0;
		this.y=0.0;
	}
	public Point2d(double x,double y){
		this.x=0.0;
		this.y=0.0;
	}
	
	public void setdata(double x,double y){
		this.x=x;
		this.y=y;
	}
	public String getdetails(){
		return ("X : "+x +"Y : "+y);
	}
	
	
	public boolean isEqual(Point2d a) {
	    return this.x == a.x && this.y == a.y;
	}
	
	@Override
	public String toString() {
	    return "X: " + x + " Y: " + y;
	}

	
	public double caldis(Point2d a) {
		double dx=this.x - a.x;
		double dy=this.y - a.y;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

}
