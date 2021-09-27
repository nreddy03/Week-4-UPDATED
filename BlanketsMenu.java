
import java.util.ArrayList;
import java.util.List;

public class BlanketsMenu implements Blankets {
	List<BlanketsType> blanketsType;
 
	public BlanketsMenu() {
		blanketsType = new ArrayList<BlanketsType>();
    
		addBlanket(" Amazon Solimo Comforter.", 
			"Cotton", 
			true,
			18.99);
 
		addBlanket(" HUESLAND", 
			"By Ahmedabad Cotton Comforter.", 
			false,
			30.99);
 
		addBlanket(" Clasiko Reversible Comforter/Duvet.",
			"Cotton",
			true,
			42.49);

	}

	

	public void addBlanket(String name, String type,
	                    boolean available, double price)
	{
		BlanketsType types = new BlanketsType(name, type, available, price);
		blanketsType.add(types);
	}
 
	public Iterator getIterator() {
		return new BlanketsTypeIterator(blanketsType);
	}
	public List<BlanketsType> getBlankets(){
		return blanketsType;
	}




}