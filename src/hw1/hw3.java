package hw1;

import java.util.Scanner;

public class hw3 {
	public static void main(String[] args) {
//		hw3 hw = new hw3();
//
//		int a1, b1, c1;
		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入三個正整數 :");
//		a1 = sc.nextInt();
//		b1 = sc.nextInt();
//		c1 = sc.nextInt();
//		hw.One(a1, b1, c1);

//		System.out.println("開始猜數字吧!");
//
//		int a2 = sc.nextInt();
//		int b2 = (int)(Math.random() * 10);
//		while (a2 != b2) {
//
//			if (a2 != b2) {
//				System.out.println("猜錯了");
//				a2 = sc.nextInt();
//			} else
//				System.out.println("");
//		}
//		System.out.println("恭喜答對");

//		System.out.println("開始猜數字吧!");
//
//		int a21 = sc.nextInt();
//		int b21 = (int)(Math.random() * 101);
//
//		while (a21 != b21) {
//
//			if (a21 > b21) {
//				System.out.println("小於" + a21);
//				a21 = sc.nextInt();
//			}else if (a21 < b21) {
//				System.out.println("大於" + a21);
//				a21 = sc.nextInt();
//			}else
//				System.out.println();			
//		}
//		System.out.println("恭喜答對，答案就是"+ a21);

		System.out.println("請輸入不想要的數字(1-9)：");

		int a3 = sc.nextInt();
		int num = 0;
		int[] a4 = new int[45];
		for (int i = 1; i <= 49; i++) {
			if (!((i >= 10 && i / 10 == a3) || (i % 10 == a3))) {
				System.out.print(i + "\t");
				a4[num] = i;
				num++;
			}
			if (num % 6 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("共有" + num + "個");
		System.out.print("亂數印出6個號碼：");
		
		for (int t = 0; t <= 5; t++) {
			int b = (int)(Math.random() * 45);
			if(a4[b] != 0)
				System.out.print(a4[b]+ " ");
			else
				t--;					
		}
	}

	public void One(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0)
			System.out.println("不是三角形");
		else if (a == b && a == c && b == c)
			System.out.println("正三角形");
		else if (a == b || a == c || b == c)
			System.out.println("等腰三角形");
		else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a))
			System.out.println("直角三角形");
		else if (a + b >= c || a + c >= b || b + c >= a)
			System.out.println("其他三角形");
	}

}
