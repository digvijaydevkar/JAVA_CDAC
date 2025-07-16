
public class Staff   {

	int id;
	String name;
	
	public Staff(int id, String nm) {
		this.id=id;
		this.name=nm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "\nName: "+name +" ID: "+id;
	}
}
