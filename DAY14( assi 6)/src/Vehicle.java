import java.io.Serializable;

public class Vehicle implements Serializable{

	 int vehicleID;
	 String model;
	 String type;
	 double price;
	

	public Vehicle(int vehicleID, String model, String type, double price) {
		super();
		this.vehicleID = vehicleID;
		this.model = model;
		this.type = type;
		this.price = price;
	}


	public int getVehicleID() {
		return vehicleID;
	}


	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getType() {
		return type;
	}


	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + ", model=" + model + ", type=" + type + ", price=" + price + "]";
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
}
