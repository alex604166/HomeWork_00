package hw7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) {

		try {
			FileReader file = new FileReader("C:\\THA105_Workspace\\HomeWorK_05\\src\\hw7\\Sample.txt");
			BufferedReader bufferedReader = new BufferedReader(file);

			String line;
			int byteCount = 0;
			int charCount = 0;
			int lineCount = 0;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				byteCount += line.getBytes().length;
				charCount += line.length();
				lineCount++;
			}
			
			bufferedReader.close();
			file.close();

			System.out.println("================================================================================");
			System.out.println("文字檔共有 " + byteCount + " 個位元組, " + charCount + " 個字元, " + lineCount + " 列資料。");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
