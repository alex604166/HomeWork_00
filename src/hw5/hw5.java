package hw5;

import java.util.Scanner;

public class hw5 {

	public void starSquare(int width, int height) {
//		int width1  = width;
//		int height1 = height;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void randAvg() {
		int[] x = new int[10];
		int sum = 0;
		System.out.println("本次亂數結果");
		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 101);
			sum += x[i];
			System.out.print(x[i] + "\t");
		}
		System.out.println();
		System.out.println((double) (sum) / x.length);
	}

	public int maxElement(int x[][]) {
		int max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	
	public double maxElement(double x[][]) {
		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("請輸入寬與高 :");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();

		hw5 one = new hw5();
		one.starSquare(w, h);

		System.out.println("=========================================================");

		randAvg();

		System.out.println("=========================================================");
		
		int[][] intArry = {{1,6,3},{9,5,2}};
		double[][] doubleArry = {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		hw5 three = new hw5();
		System.out.println(three.maxElement(intArry));
		System.out.println(three.maxElement(doubleArry));
		
		System.out.println("=========================================================");

	}	

}
