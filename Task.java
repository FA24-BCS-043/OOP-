import java.util.Scanner;
public class Task{
public static void main(String[] args){
	
	//Declaration
	int i;
	short s;
	long l;
	byte b;

	float f;
	double d;
	
	boolean bool;
	
	char c;
	String str;
	
	//Inputs
	Scanner input = new Scanner(System.in);

	System.out.print("Enter int value: ");
	i = input.nextInt();
	System.out.print("Enter short value: ");
	s = input.nextShort();
	System.out.print("Enter long value: ");
	l = input.nextLong();
	System.out.print("Enter byte value: ");
	b = input.nextByte();

	System.out.print("Enter float value: ");
	f = input.nextFloat();
	System.out.print("Enter double value: ");
	d = input.nextDouble();	

	System.out.print("Enter boolean value: ");
	bool = input.nextBoolean();

	System.out.print("Enter char value: ");
	c = input.next().charAt(0);
	System.out.print("Enter string value: ");
	str = input.next();
	
	//Printing Values
	System.out.printf("Value of int: %d \n", i);
	System.out.printf("Value of short: %d \n", s);
	System.out.printf("Value of long: %d \n", l);
	System.out.printf("Value of byte: %d \n", b);

	System.out.printf("Value of float: %.2f \n", f);
	System.out.printf("Value of double: %.3f \n", d);

	System.out.printf("Value of bool: %b \n", bool);

	System.out.printf("Value of char: %c \n", c);
	System.out.printf("Value of string: %s \n", str);	
}
}