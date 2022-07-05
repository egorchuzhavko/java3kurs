package Lab1;

import java.util.Scanner;

public class z2 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n=10;
		int k=0;
		System.out.print("Введите x: ");
		int x=in.nextInt();
		int[] arr = new int[10];
		for (int i = 0; i < n; i++) 
		{
			arr[i] = 0 + (int) (Math.random() * 25);
		}

		for (int i = 0; i < n; i++) 
		{
			System.out.println(arr[i]);
		}
		for (int i = 0; i < n; i++) 
		{
			if (arr[i]==x)
			{
				k+=1;
			}
		}
		System.out.print("Количество равных чисел = "+k);
	}

}
