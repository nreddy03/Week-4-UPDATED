import java.util.*;
  
     
public class BlanketsDisplay {
	Blankets blanketMenu=new BlanketsMenu();
	public BlanketsDisplay(Blankets blanketMenu) {
		this.blanketMenu=blanketMenu;
	}
	public void getBlanketsMenu() {
		Iterator blanketIterator = blanketMenu.getIterator();
		getBlanketsMenu(blanketIterator);

}
	void getBlanketsMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			BlanketsType blankets = iterator.next();
			System.out.print("Name :" +blankets.getName() + ", ");
			System.out.println("Price: "+blankets.getPrice() + "$");
			System.out.println("BlanketType:" +blankets.getType() +" , isAvailable:"+blankets.isAvailable());
		}
	}
}  