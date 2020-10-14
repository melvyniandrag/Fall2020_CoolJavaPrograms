//a simple program for user to enter thier name and age
import java.util.Scanner;

public class NameAge
{
	public static void main(String args[]) throws Exception
	{
		String name;
		int age;

		Scanner SC=new Scanner(System.in);

		System.out.print("Enter name: ");
		name= SC.nextLine();

		System.out.print("Enter age: ");
		age=SC.nextInt();

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);

	}
}
