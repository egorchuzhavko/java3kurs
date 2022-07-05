package lr8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Z3 {

	public static void main(String[] args) throws IOException {
		try (FileWriter writer = new FileWriter("f_z3.txt",false)){
			for(int i =0;i<10;i++) {
				int ch=(int)(Math.random()*100);
				writer.write(Integer.toString(ch));
				writer.write(System.lineSeparator());
			}
		}
		FileReader readf_z3 = new FileReader("f_z3.txt");
		Scanner scan=new Scanner(readf_z3);
		FileWriter writeg = new FileWriter("g.txt",false);
		FileWriter writeh = new FileWriter("h.txt",false);
		while(scan.hasNextLine()) {
			int i = Integer.parseInt(scan.nextLine());
			if(i%2==0) {
				writeg.write(Integer.toString(i));
				writeg.write(System.lineSeparator());
			}
			else {
				writeh.write(Integer.toString(i));
				writeh.write(System.lineSeparator());
			}
		}
		readf_z3.close();
		writeg.close();
		writeh.close();
	}

}
