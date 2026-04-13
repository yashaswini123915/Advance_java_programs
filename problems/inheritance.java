package interview;
import java.util.*;
 class fruits{
	private String fruitsname;
	public String getFruitsname() {
		return fruitsname;
	}
	public void setFruitsname(String fruitsname) {
			this.fruitsname = fruitsname;
	}
	
}

public class Test1 {
	public static void main(String args[]) {
	 
		fruits obj = new fruits();
		obj.setFruitsname("Mango");
		System.out.println("the fruit name is "+obj.getFruitsname());
	}

}
