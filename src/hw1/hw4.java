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
//		System.out.println("請輸入三個數字 YYYY年 MM月 DD日");
//
//		int yyyy = sc.nextInt();
//		int MM = sc.nextInt();
//		int DD = sc.nextInt();
//		int sum = 0;
//		int[] year = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//
//		if ((yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0 && yyyy % 100 == 0)) {
//			if (MM == 2 && DD > 29) {
//				System.out.println("(月份輸入為2,則日期不該超過29)");
//			} else {
//				for (int i = 0; i < (MM - 1); i++) {
//					sum += year[i];
//				}
//				sum += DD;
//				System.out.println(sum+1);
//			}
//
//		} else {
//			if (MM == 2 && DD > 28) {
//				System.out.println("(月份輸入為2,則日期不該超過28)");
//			} else {
//				for (int i = 0; i < (MM - 1); i++) {
//					sum += year[i];
//				}
//				sum += DD;
//				System.out.println(sum);
//			}
//		}


//		System.out.println("===========================================");
//
//		System.out.println("第六題");
//		int[][] score = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
//				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
//				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
//		int[] highestCount = new int[8];
//		int[] maxScore = new int[6];
//		int[] x62 = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		// 找出最大值
//		for (int i6 = 0; i6 < score.length; i6++) {
//			int max = 0;
//			for (int j6 = 0; j6 < score[i6].length; j6++) {
//				if (score[i6][j6] > max) {
//					max = score[i6][j6];
//					maxScore[i6] = max;
//				}
//			}
//		}
//		// 同學最高分次數相加
//		for (int i1 = 0; i1 < score.length; i1++) {
//			for (int j1 = 0; j1 < score[i1].length; j1++) {
//				if (maxScore[i1] == score[i1][j1]) {
//					highestCount[j1]++;
//				}
//			}
//		}
//		// 顯示同學
//		for (int i = 0; i < x62.length; i++) {
//			System.out.print(x62[i] + "號同學\t");
//		}
//		System.out.println();
//		// 顯示次數
//		for (int i = 0; i < highestCount.length; i++) {
//			System.out.print(highestCount[i] + "次最高分\t");
//		}

	}

}
