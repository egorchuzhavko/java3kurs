package lr8;

import java.io.*;
import java.util.Scanner;

public class Z6 {

	public static void main(String[] args)throws IOException {
		try (FileWriter writer = new FileWriter("f_z6.txt",false)){
			for(int i =0;i<10;i++) {
				int ch=(int)(Math.random() * 200 - 100);
				writer.write(Integer.toString(ch));
				writer.write(System.lineSeparator());
			}
		}
		try(FileReader reader=new FileReader("f_z6.txt")){
			Scanner scan = new Scanner(reader);
			int k = 0;
			while(scan.hasNextLine()) {
				if(Integer.parseInt(scan.nextLine())>0)
					k++;
			}
			System.out.println("Количество положительных элементов: " + k);
		}
	}

}
