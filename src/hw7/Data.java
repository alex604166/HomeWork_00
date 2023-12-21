package hw7;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Data {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("C:\\THA105_Workspace\\HomeWorK_05\\src\\hw7\\Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			for (int i = 0; i < 10; i++) {
				int randon = (int) (Math.random() * 1001);
				pw.print(randon + "\t");
			}
			pw.println();
			
			pw.close();
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
