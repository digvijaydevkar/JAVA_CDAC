import java.io.*;
import java.util.*;

public class Vehicle_management {
	public static void WriteVehicle(String filename) {
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle(101,"Swift","HatchBack",700000));
		vehicles.add(new Vehicle(102,"XUV700","SUV",3000000));
		vehicles.add(new Vehicle(103,"FORTUNER","SUV",5000000));
		vehicles.add(new Vehicle(104,"Waganor","HatchBack",500000));

		try(FileOutputStream file = new FileOutputStream(filename);
			DataOutputStream dos = new DataOutputStream(file)){
				
			for(Vehicle v : vehicles) {
				if(v.price > 0) {
					dos.writeInt(v.vehicleID);
					dos.writeUTF(v.model);
					dos.writeUTF(v.type);
					dos.writeDouble(v.price);
				}
				else {
					System.out.println("Invalid Vehicles with price less than 0 "+v.model);
					
				}
			}
			System.out.println("Vehicles are Written succesfully to "+file);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void ReadVehicle(String filename) {
		List<Vehicle> vehicles = new ArrayList<>();


		try(FileInputStream file = new FileInputStream(filename)) {
			try(DataInputStream dis = new DataInputStream(file)){
			
			while(true) {
					int id=dis.readInt();
					String s=dis.readUTF();
					String t = dis.readUTF();
					double p = dis.readDouble();
					vehicles.add(new Vehicle(id,s,t,p));
				}
			}
		}
	
		catch(Exception e){
			//e.printStackTrace();
		}
	    vehicles.sort((v1, v2) -> Double.compare(v2.price, v1.price));
	
	    System.out.println("\n--- Sorted Vehicle Records (by Price Descending) ---");
	    for (Vehicle v : vehicles) {
	        System.out.println(v);
	    }
}

	
	
	public static void main(String[] args) {
		
	    String filename = "Vehicles.db";
	    //WriteVehicle(filename);
        ReadVehicle(filename);

	}

}
