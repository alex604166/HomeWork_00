package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Read {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\data\\Object.ser");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Object obj1 = ois.readObject();
			Object obj2 = ois.readObject();

			if (obj1 instanceof Animal) {
				Animal animal1 = (Animal) obj1;
				animal1.speak();
			}

			if (obj2 instanceof Animal) {
				Animal animal2 = (Animal) obj2;
				animal2.speak();
			}

			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
