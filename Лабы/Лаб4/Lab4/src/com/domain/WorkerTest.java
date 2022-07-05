package com.domain;
import workers.*;

public class WorkerTest {

	public static void main(String[] args) 
	{
		FixedPay f=new FixedPay(350);
		System.out.println("‘иксированна€ среднемес€чна€ зарплата: "+f.Calculate());
		HourlyPay h= new HourlyPay(2,0);
		System.out.println("—реднемес€чна зарплата с почасовой оплатой ("+h.salInHo+") равна: "+h.Calculate());
	}

}
