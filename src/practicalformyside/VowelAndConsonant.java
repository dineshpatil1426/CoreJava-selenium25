package practicalformyside;

public class VowelAndConsonant {

	public static void main(String[] args) {
		
		//a e i o u
		
		char ch='a';
		
		// You have to Change for Capital Charater  like this
		//ch=='A'||ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'
		
		if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			System.out.println(ch +" is Vowel");
		}else {
			System.out.println(ch +" is Consonant");
		}
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': 	
			System.out.println(ch +" is Vowel");
			break;

		default:
			System.out.println(ch +" is Consonant");
			break;
		}
		

	}

}
