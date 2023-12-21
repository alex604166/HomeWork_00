package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Write {

	public static void main(String[] args) throws Exception {

		File folder = new File("C:\\data");
		if (!folder.exists()) {
			folder.mkdir();
		}

		Dog myDog = new Dog("HotDog");
		Cat myCat = new Cat("FatCat");

//		寫入

		File file = new File("C:\\data\\Object.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(myDog);
		oos.writeObject(myCat);
		System.out.println("成功寫入!");

		oos.close();
		fos.close();

	}

}
