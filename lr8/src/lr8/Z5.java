package lr8;


import java.io.*;
import java.util.Scanner;

public class Z5 {

	public static void main(String[] args) throws IOException {
		try (FileWriter writer = new FileWriter("f_z5.txt",false)){
			for(int i =0;i<10;i++) {
				int ch=(int)(Math.random()*100);
				writer.write(Integer.toString(ch));
				writer.write(System.lineSeparator());
			}
		}
		try (FileWriter writer = new FileWriter("g_z5.txt",false)){
			for(int i =0;i<10;i++) {
				int ch=(int)(Math.random()*100);
				writer.write(Integer.toString(ch));
				writer.write(System.lineSeparator());
			}
		}
		try (FileWriter writer = new FileWriter("h_z5.txt",false)){
			FileReader readf_z5 = new FileReader("f_z5.txt");
			Scanner scan=new Scanner(readf_z5);
			while(scan.hasNextLine()) {
				writer.write(scan.nextLine());
				writer.write(System.lineSeparator());
			}
			FileReader readg_z5 = new FileReader("g_z5.txt");
			Scanner scan1=new Scanner(readg_z5);
			while(scan1.hasNextLine()) {
				writer.write(scan1.nextLine());
				writer.write(System.lineSeparator());
			}
		}
	}

}
