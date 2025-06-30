package practicalformyside;

public class GetDyanamicXpath {

	public static void main(String[] args) {
		
		System.out.println(getXpath("Dinesh")); 
		System.out.println(getXpath("patil"));
		System.out.println(getXpath("txtName"));
		System.out.println(getXpath("EnterFirst")); 
	}
	
	
	public static String getXpath(String name) {
		String xpath="//input[@id='"+name+"']";
		return xpath;
	}

}
