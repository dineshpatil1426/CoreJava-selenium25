package practicalformyside;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;


public class StringTranslator {
		
	/*
	 * static { try { Field value=String.class.getDeclaredField("value");
	 * value.setAccessible(true);
	 * 
	 * value.set("Hello Dinesh",value.get("Hola Dinesh"));
	 * value.set("Good morning Dinesh",value.get("Buenos días Dinesh"));
	 * value.set("How are you?",value.get("¿Cómo estás?"));
	 * 
	 * } catch (NoSuchFieldException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (SecurityException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } catch (IllegalArgumentException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } catch
	 * (IllegalAccessException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
	
	public static void main(String[] args) {
		
		
		try {
			
			System.out.println(new URL("https://naveenautomationlabs.com")
					.equals(new URL("https://45.90.229.244")));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
