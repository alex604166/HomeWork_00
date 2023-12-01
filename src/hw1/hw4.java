package hw1;

import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {

//		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		int sum = 0;
//		for (int i = 0; i < x.length; i++) {
//			sum += x[i];
//		}
//
//		System.out.println("第一題");
//		System.out.println("陣列平均數 :" + sum / x.length);
//		System.out.print("大於平均數的有 :");
//		for (int j = 0; j < x.length; j++) {
//			if ((sum / x.length) < x[j])
//				System.out.print(x[j] + " \t");
//		}
//		System.out.println();
//		System.out.println("===========================================");
//
//		System.out.println("第二題");
//		String s = "Hello World";
//
//		for (int i = 10; i >= 0; i--) {
//			char s1 = s.charAt(i);
//			System.out.print(s1);
//		}
//
//		System.out.println();
//		System.out.println("===========================================");
//
//		System.out.println("第三題");
//		int sumAll = 0;
//		String[] s3 = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//
//		for (int x1 = 0; x1 < s3.length; x1++) {
//			for (int j1 = 0; j1 < s3[x1].length(); j1++) {
//				char t = s3[x1].charAt(j1);
//
//				switch (t) {
//				case 'a':
//				case 'e':
//				case 'i':
//				case 'o':
//				case 'u':
//					sumAll += 1;
//					break;
//				}
//			}
//		}
//		System.out.print("陣列");
//		for (int y = 0; y < s3.length; y++)
//			System.out.print(" " + s3[y] + " ");
//		System.out.println();
//		System.out.println("這陣列裡面共有多少個母音(a, e, i, o, u) 共 :" + sumAll + "個");
//
//		System.out.println("===========================================");
//
//		System.out.println("第四題");
//		System.out.println("可借金額:");
//		Scanner sc = new Scanner(System.in);
//		int j4 = sc.nextInt();
//		int sum4 = 0;
//		int[][] x4 = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
//		System.out.print("「有錢可借的員工編號:" + " ");
//		for (int i4 = 0; i4 < x4.length; i4++) {
//
//			if (j4 <= x4[i4][1]) {
//				sum4++;
//				System.out.print(x4[i4][0] + " ");
//			}
//		}
//		System.out.println("共" + sum4 + "人!」");

//		System.out.println("===========================================");
//
//		System.out.println("第五題");
//
//		System.out.println("===========================================");
//
		System.out.println("第六題");
		int max = 0;
		int[][] x6 = { { 1, 10, 37, 100, 77, 98, 90 }, { 2, 35, 75, 70, 95, 70, 80 }, { 3, 40, 77, 79, 70, 89, 100 },
				{ 4, 100, 89, 90, 89, 90, 75 }, { 5, 90, 64, 75, 60, 75, 50 }, { 6, 85, 75, 70, 75, 90, 20 },
				{ 7, 75, 70, 79, 85, 89, 99 }, { 8, 70, 95, 90, 89, 90, 75 } };
		for (int i6 = 0; i6 < x6.length; i6++) {
			for (int j6 = 0; j6 < x6[i6].length; j6++) {
				if (x6[i6][j6] > max) {
					max = x6[i6][j6];
				}
			}
			System.out.println(i6); 
			System.out.print(max + "\t");
			max = 0;
		}

	}

}
