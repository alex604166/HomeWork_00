package hw6_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int answer = 0;
		while (answer == 0) {
			try {
				Calculator c = new Calculator();
				System.out.println("請輸入X值是:");
				// 判斷 x 是否為數字
				if (sc.hasNextInt()) {
					int x = sc.nextInt();
					System.out.println("請輸入Y值是:");
					// 判斷 y 是否為數字
					if (sc.hasNextInt()) {
						int y = sc.nextInt();
						if (x == 0 && y == 0)
							throw new CalException("0的0次方沒有意義!!!");
						else if (y < 0)
							throw new CalException("次方負數回傳不為整數!!!!");
						else {
							answer = c.powerXY(x, y);
							System.out.println(x + "的" + y + "次方等於" + answer);
							break;
						}
					} else {
						throw new InputMismatchException("格式不對，麻煩請重新輸入");
					}
				} else {
					throw new InputMismatchException("格式不對，麻煩請重新輸入");
				}

			} catch (CalException c) {
				c.printStackTrace();

			} catch (InputMismatchException im) {
				im.printStackTrace();
				sc.next();

			} catch (RuntimeException r) {
				r.printStackTrace();
			}
		}
		sc.close();
	}
}