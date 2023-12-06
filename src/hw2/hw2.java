package hw2;

public class hw2 {

	public static void main(String[] args) {

		System.out.println("第一題");

		int sum = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("1~1000偶數和:" + sum);
		System.out.println("==================================================");

		System.out.println("第二題");
		int sum1 = 1;
		for (int j = 1; j <= 10; j++) {
			sum1 *= j;
		}
		System.out.println("1~10連乘積:" + sum1);

		System.out.println("==================================================");

		System.out.println("第三題");

		int sum2 = 1, k = 1;

		while (k <= 10) {
			sum2 *= k;
			k++;
		}

		System.out.println("1~10連乘積:" + sum2);

		System.out.println("==================================================");

		System.out.println("第四題");

		int sum3;
		for (int i1 = 1; i1 <= 10; i1++) {
			sum3 = (int) Math.pow(i1, 2);
			System.out.print(sum3 + "\t");
		}

		System.out.println();

		System.out.println("==================================================");

		System.out.println("第五題");

		int count = 0;
		System.out.print("可選擇數字:");
		for (int i2 = 1; i2 <= 39; i2++) {
			if (i2 % 10 == 4)
				continue;
			else {
				count++;
				System.out.print(i2 + " ");
			}
		}
		System.out.println();
		System.out.println("共" + count + "個");

		System.out.println("==================================================");

		System.out.println("第六題");

		for (int i6 = 10; i6 >= 0; i6--) {
			for (int j6 = 1; j6 <= i6; j6++) {
				System.out.print(j6);
			}
			System.out.println();
		}
		
		System.out.println("==================================================");

		System.out.println("第七題");
		
		
		int k7 = 64;
		for (int i7 = 1; i7 <= 6; i7++) {
			k7++;
			for (int j7 = 1; j7 <= i7; j7++) {
				char A7 = (char)k7;
				System.out.print(A7);
			}
			System.out.println();
		}

	}

}
