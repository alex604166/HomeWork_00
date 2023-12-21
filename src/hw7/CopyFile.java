package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	public static void copyFile(String source, String goal) {
		try {
			FileReader inputFile = new FileReader(source);
			FileWriter outputFile = new FileWriter(goal);

			BufferedReader in = new BufferedReader(inputFile);
			BufferedWriter out = new BufferedWriter(outputFile);
			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();
			}

			in.close();
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String source = "./src/hw7/source.txt";
		String goal = "./src/hw7/goal.txt";

		try {
			copyFile(source, goal);
			System.out.println("複製成功");
		} catch (Exception e) {
			System.out.println("複製失敗：" + e.getMessage());
		}

	}

}
