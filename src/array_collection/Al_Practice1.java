package array_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Al_Practice1 {

	public static void main(String[] args) {
		
		String [] str= {"Dinesh","Rakesh","Dhaval","Yogiraj","Vijay"};
		
		
		List<String> list= new ArrayList<String>();
		
		Collections.addAll(list,str);
		
		//Second list
		List al=Arrays.asList(str);
		
		
		System.out.println(list);
		System.out.println(al);

	}

}
