import java.util.*;
import java.util.Scanner;
public class Switch {
public static void main(String[]args) {
	int choice;
	System.out.println("Pick one: 1.Hi\t2.Hello\t3.Hey");
	Scanner sc= new Scanner(System.in);
	choice=sc.nextInt();
	switch (choice)
	{
	case 1: System.out.println("You said Hi");
	break;
	case 2: System.out.println("You said Hello");
	break;
	case 3: System.out.println("You said Hey");
	}
}
}
