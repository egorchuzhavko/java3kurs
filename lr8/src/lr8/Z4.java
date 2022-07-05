package lr8;

import java.io.*;

public class Z4 {

	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
		double sum=0;
        while (input.available() > 0) {
            sum += Double.parseDouble(input.readLine());
        }
        System.out.println("Среднее число = " + sum/15);
        input.close();
	}

}
