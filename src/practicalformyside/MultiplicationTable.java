package practicalformyside;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter Number:");
		int num=s.nextInt();
		//int mul=0;
		if(num!=0) {
			for(int i=1;i<=10;i++)
			{
				//mul=num * i;
				System.out.println(num+" x "+ i + "=" +(num*i));
			}
		}
		s.close();
		

	}

}
