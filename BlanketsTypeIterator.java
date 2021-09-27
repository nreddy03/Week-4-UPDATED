import java.util.*;
public class BlanketsTypeIterator implements Iterator, BlanketTypeIteratorInterface{
	List<BlanketsType> blankets;
	int length;
	
	public BlanketsTypeIterator(List<BlanketsType> blankets ) {
		this.blankets = blankets;
	}
	@Override
	public boolean hasNext() {
		if(length >= blankets.size()) {
			return false;
		}
		else {
			return true;
		}
	}
	@Override
	public BlanketsType next() {
		BlanketsType btype = blankets.get(length);
		length = length + 1;
		return btype;
	}
}