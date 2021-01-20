import java.util.*;
import java.util.Scanner;
public class matices {
	public static void main(String[]args) {
		int m1[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int m2[][]= {{1,3,4},{2,4,3},{3,4,5}};
		 int c[][]=new int[3][3];

	      for(int i = 0;i<3;i++){
	         for(int j = 0;j<3;j++){
	            c[i][j] = m1[i][j]+m2[i][j];
	            System.out.print(c[i][j]+" ");
	         }
	         System.out.println();
	      }
	   }
	}