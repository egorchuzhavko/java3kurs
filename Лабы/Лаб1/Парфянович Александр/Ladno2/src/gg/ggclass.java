package gg;

import java.util.Scanner;

public class ggclass {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) 
		{
			nums[i] = in.nextInt();
		}

		/*for (int i = 0; i < nums.length; i++) 
		{
			System.out.print(nums[i]);
		}
		*/
		/*
		for (int i = (nums.length - 1); i > -1; i--) 
		{
			System.out.print(nums[i]);		
		}
		*/
		/*int sum=0;
		for (int i = 0; i < nums.length; i++) 
		{
			sum+=nums[i];
		}
		System.out.print(sum);
		*/
		/*
		int k=0;
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i]==0)
			{
				System.out.print(i);
				k+=1;
			}
		}
		if (k==0)
		{
			System.out.print("��� ������� ���������!");
		}
		*/
		/*
		int min=nums[0];
		for (int i = 1; i < nums.length; i++) 
		{
			if (nums[i]<nums[i-1])
			{
				min=nums[i];
			}
		}
		System.out.print("������������ ������� : "+ min);
		*/
		
		/*int b=nums[0];
		nums[0]=nums[nums.length-1];
		nums[nums.length-1]=b;
		for (int i = 0; i < nums.length; i++) 
		{
			System.out.print(nums[i]);
		}*/
	}


	}

