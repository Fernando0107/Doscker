import java.util.Scanner;


public class Main {
	public static void main(String[] args) {


	Scanner input=new Scanner(System.in);

	String User_input;

	System.out.print("ingrese la palabra");

	User_input=input.next();

	String CAPS;

	CAPS=User_input.toUpperCase();

	System.out.print(CAPS);
	}

}