import java.util.*;
public class Solution {
	static int a1=0;
	static int a2=1;
	static int a3=0;
	static void Fibonacci(int count) {
		if(count>0) {
			a3=a1+a2;
			a1=a2;
			a2=a3;
			System.out.println(" "+a3);
			Fibonacci(count-1);
		}
	}
public static void main(String[]args) {
	int count=10;
	System.out.println(a1+" "+a2);
	Fibonacci(count-2);
	
}
}
