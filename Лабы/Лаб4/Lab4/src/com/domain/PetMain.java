package com.domain;
import petsclasses.*;

public class PetMain {

	public static void main(String[] args) 
	{
		Animal a;
		Spider s=new Spider();
		s.eat();
		s.walk();
		s.Info();
		Cat c= new Cat("Tom");
		c.eat();
		c.sleep();
		c.play();
		IPet p;
		p=new Cat();
		p.setName("Mary");
		p.play();
		Fish f=new Fish();
		f.setName("Mike");
		f.eat();
		f.swim();
		f.play();
		a=new Fish();
		((Fish)a).eat();
		((Fish)a).swim();
		Ferret h=new Ferret("Борис");
		h.eat();
		h.play();
		h.sleep();
	}

}
