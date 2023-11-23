package hw1;

import java.util.Scanner;

public class hw3 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個正整數 :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a <= 0 || b <= 0 || c <= 0)
			System.out.println("不是三角形");
		else if (a == b || a == c || b == c)
			System.out.println("等腰三角形");
		else if (a + b <= c || a + c <= b || b + c <= a)
			System.out.println("其他三角形");
		else if (a == b && a == c && b == c)
			System.out.println("正三角形");

	}

}
