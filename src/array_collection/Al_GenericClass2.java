package array_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Al_GenericClass2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String >();
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the List :");
		
		for(int i=0;i<4;i++) {
			
			String val=s.nextLine();
			list.add(val);
		}
		System.out.println(list);
		
		for(String data:list) {
			System.out.println(data);
		}
		
		s.close();

	}

}
