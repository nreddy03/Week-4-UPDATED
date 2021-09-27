
public class BlanketsType {
	String name;
	String type;
	boolean available;
	double price;
 
	public BlanketsType(String name, 
	                String type, 	
	                boolean available, 
	                double price) 
	{
		this.name = name;
		this.type = type;
		this.available = available;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getType() {
		return type;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isAvailable() {
		return available;
	}
}
