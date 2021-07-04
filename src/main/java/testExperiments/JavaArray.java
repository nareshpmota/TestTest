package testExperiments;

import java.util.Scanner;

public class JavaArray {
    public static int a[][];
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int arraySize=sc.nextInt();
		a=new int[arraySize][arraySize];
		System.out.println("Array Size :- "+arraySize);
		for(int i=0;i<arraySize;i++)
			for(int j=0;j<arraySize;j++)
				a[i][j]=sc.nextInt();
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=0;j<arraySize;j++)
			{
				System.out.print("  "+a[i][j]);
			}
			System.out.println("");
		}	
		
	}
	
	
}
