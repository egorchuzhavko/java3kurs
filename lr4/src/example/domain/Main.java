package example.domain;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import zd2.FixedPay;
import zd2.HourlyPay;
import zd2.Worker;


public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee();

        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager mgr = new Manager(207, "Barbara Johnson", "054-12- 2367", 109_501.36, "US Marketing");
        Admin adm = new Admin(304, "Bill Munroe", "108-23-2367", 75_002.34);
        Director dir = new Director(12, "Susan Wheeler", "099-45- 2340", 120_567.36, "Global Marketing", 1_000_000.00);

        emp.printEmployee(eng);
        emp.printEmployee(mgr);
        emp.printEmployee(adm); 
        emp.printEmployee(dir);
        
        Animal a;
        Spider s = new Spider();
        s.eat();
        s.walk();
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();
        a = new Cat();
        a.eat();
        a.walk();
        Pet p;
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();
        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();
        a = new Fish();
        a.eat();;
        a.walk();

        Laska l = new Laska();
        l.setName("Kurkuma");
        l.eat();
        l.walk();
        l.play();
        a = new Laska();
        a.eat();;
        a.walk();

        HourlyPay hour = new HourlyPay("Vadim", 7);
        System.out.println(hour.Calculate());
        FixedPay fix = new FixedPay("Denis", 800);
        System.out.println(fix.Calculate());
        
        ArrayList<Worker> workers=new ArrayList<Worker>();
        workers.add(new Worker("Даниил",150));
        workers.add(new Worker("Андрей",300));
        workers.add(new Worker("Анатолий",300));
        workers.add(new Worker("Гном",500));
        workers.add(new Worker("Антон",650));
        
        for(Worker w : workers) {
        	System.out.println(w);
        }
        System.out.println();
        Collections.sort(workers,Worker.NameComparator);
        for(Worker w : workers) {
        	System.out.println(w);
        }
        System.out.println();

        Collections.sort(workers,Worker.ZPComparator);
        for(Worker w : workers) {
        	System.out.println(w);
        }
        System.out.println();

        System.out.println("\nПервые 5: ");
		for (int i = 0; i < 5; i++) {
			String s1 = workers.get(i).name + " index = " + i;
			System.out.println(s1);
		}
		 
		System.out.println("\nПоследние 3: ");
		for (int i = workers.size()-1; i > workers.size()-4; i--) {
			String s1 = workers.get(i).name + " index = " + i;
			System.out.println(s1);
		}
		
		try(FileWriter writer = new FileWriter("file.txt",false)){
			for(Worker w : workers) {
				String str = w.name+" "+w.zp_m+"\n";
				writer.write(str);
			}
		}
		catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		
		
        ArrayList<Worker> newworkers = new ArrayList<Worker>();

		try(FileReader reader = new FileReader("file.txt")){
			Scanner scan = new Scanner(reader);
			while(scan.hasNextLine()) {
				String[] stroka = scan.nextLine().split(" ");
				newworkers.add(new Worker(stroka[0],Double.parseDouble(stroka[1])));
			}
		}
		catch (FileNotFoundException e) {
			 System.out.println(e + "Fail dont exist ");
		}
		catch(IOException ex){
            System.out.println(ex.getMessage());
        }
		
		for(Worker w : newworkers) {
			System.out.println(w);
		}
    }
}
