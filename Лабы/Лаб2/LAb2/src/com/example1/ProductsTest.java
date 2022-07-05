package com.example1;

import Sons.*;
//import Sons.Milk;
//import Sons.Products;

public class ProductsTest 
{
	public static void main(String[] args) 
	{
		Products emp= new Products();
		emp.setProductId(12);
		emp.setName("Чипсы Лейс");
		emp.setCost(2.5);
		System.out.println(emp.GetInfo());
		
		Cassir emp1= new Cassir(12,"Чипсы Лейс", 2.5,2,"Игорь");
		System.out.println(emp1.GetInfo());
		
		Milk emp2= new Milk(1,"Молоко, Савушкин продукт", 2, 4.11);
		System.out.println(emp2.GetInfo());

	}

}
