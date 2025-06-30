package array_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Al_Color {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();

		color.add("Red");
		color.add("Black");
		color.add("Blue");
		color.add("Green");
		color.add("Pink");
		color.add(0, "Yellow");
		color.add("Green");
		color.add("");
		color.add(null);
		color.add(" ");

		ArrayList<String> color1 = new ArrayList<String>();
		color1.add("pink");
		color1.add("Silver");
		color1.add("Gold");
		color1.add("White");
		color1.add(0, "Sky-Blue");
		color1.add("Gold");

		System.out.println(color);

		// System.out.println(color.get(0));
		// System.out.println(color.get(2));

		color.set(3, "Orange");
		System.out.println(color);
		color.remove(5);
		System.out.println(color);
		System.out.println("****************************");
		Collections.sort(color);
		System.out.println(color);
		Collections.reverse(color);
		System.out.println(color);

		if (color.contains("Red")) {
			System.out.println("Color is Found");
		} else {
			System.out.println("Color is not Found");
		}

		for (String s : color) {
			System.out.println(s);
		}

		System.out.println("*******************************************");

		System.out.println("color: " + color);

		System.out.println("color1:" + color1);

		System.out.println("***********After Copy***********");

		Collections.copy(color, color1);

		System.out.println("color: " + color);

		System.out.println("Color1:" + color1);

		List<String> color2 = new ArrayList<String>();

		color2.add("pink");
		color2.add("Silver");
		color2.add("Gold");
		color2.add("White");
		color2.add(0, "Sky-Blue");

		System.out.println("Original list: " + color2);
		List<String> sub_List = color2.subList(0, 3);
		System.out.println("List of first three elements:" + sub_List);

		ArrayList<String> color3 = new ArrayList<String>();

		for (String e : color1) {
			color3.add(color2.contains(e) ? "Yes" : "No");

		}
		System.out.println(color3);

		System.out.println("***********Swap Array list***********");

		System.out.print("Array list before Swap:");
		System.out.println(color2);
		System.out.print("Array list After Swap:");
		Collections.swap(color2, 0, 2);
		System.out.println(color2);
		System.out.println("***********Join Two ArrayLists***********");

		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.addAll(color);
		arrlist.addAll(color2);
		System.out.println(arrlist);

		System.out.println("Original array list: " + color1);
		ArrayList<String> newc1 = (ArrayList<String>) color1.clone();
		System.out.println("Cloned array list: " + newc1);
		
		System.out.println("Original array list: " + color1);
		color1.removeAll(color1);
		System.out.println("Remove array list: " + color1);
		
		
		
		
		
	}

}
