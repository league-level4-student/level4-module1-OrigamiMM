package _06_Snake;

import java.util.Random;

public class Module1Check {
	
	public static void main(String[] args) {
		Random r = new Random();
		Integer number;
		number = r.nextInt(4);
		
		switch(number) {
		case 0:
			System.out.println("This is number 0");
			break;
		case 1:
			System.out.println("This is the second random msg");
			break;
		case 2: 
			System.out.println("The third");
			break;
		case 3:
			System.out.println("number 4");
			break;
		case 4:
			System.out.println("the last possible one");
			break;
		default: 
			System.out.println("you somehow got this msg");
		}
	}
}
