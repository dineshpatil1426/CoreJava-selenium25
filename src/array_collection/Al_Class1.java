package array_collection;

import java.util.ArrayList;
import java.util.List;

public class Al_Class1 {

	public static void main(String[] args) {
		
		//Non-Generic Collection
		
		List list1=new ArrayList();
		
		list1.add("Dinesh");
		list1.add("Dipesh");
		list1.add("Chetan");
		list1.add("Rakesh");
		
		System.out.println(list1);
		
		list1.remove(2);
		
		System.out.println(list1);

	}

}
