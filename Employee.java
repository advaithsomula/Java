import java.util.Scanner;
import java.util.*;
public class Employee {
 
 int year;
 String name;
String address;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the year :: ");
  year = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the address :: ");
  address = in.next();
 }
 
 public void display() {
  
  System.out.println("Year of Joining = " + year);
  System.out.println("Employee name = " + name);
  System.out.println("Employee address = " + address);
 }
 
 public static void main(String[] args) {
 
  Employee e[] = new Employee[3];
  
  for(int i=0; i<3; i++) {
   
   e[i] = new Employee();
   e[i].getInput();
  }
  
  System.out.println("**** Data Entered as below ****");
  
  for(int i=0; i<3; i++) {
   
   e[i].display();
  }
 }
}