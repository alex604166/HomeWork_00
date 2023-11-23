package hw1;

public class hw1 {

	public static void main(String[] args) {
		int a = 12, x = 6;
		System.out.println("第一題");
		System.out.println("和" + (a + x) + "積" + (a * x));

		System.out.println("================================");
		System.out.println("第二題");

		int eggs = 200, basket = 12;

		System.out.println("雞蛋分為" + (eggs / basket) + "盒" + (eggs % basket) + "顆");
		System.out.println("================================");
		System.out.println("第三題");

		int times = 256559;
		int day, hour, min, day1, hour1, min1;

		day = 256559 / 86400;
		day1 = 256559 % 86400;
		hour = day1 / 3600;
		hour1 = day1 % 3600;
		min = hour1 / 60;
		min1 = hour1 % 60;

		System.out.println("256559為" + day + "天" + hour + "時" + min + "分" + min1 + "秒");
//		System.out.println(min1);
		System.out.println("================================");
		System.out.println("第四題");

		final double Pi = 3.1415;
		double r = 5.0;
		System.out.println("圓面積" + r * r * Pi);
		System.out.println("圓周長" + r * Pi);
		System.out.println("================================");
		System.out.println("第五題");

		int p = 1500000, sum = 0;
		double rate = 0.02;

		for (int i = 1; i <= 10; i++) {
			int m1 = (int) (p * Math.pow(1 + rate, i));
			sum = m1;
		}
		System.out.println("10年後可以獲取" + sum);
		System.out.println("================================");
		System.out.println("第六題");

		int z = 5, y = 5;
		char v = '5';
		String c = "5";
		// int 型態相加，整數相加
		System.out.println("5 + 5 :" + (z + y));
		// char型態相加，字元相加，char('5') 是 53
		System.out.println("5 + '5' :" + (z + v));
		// String型態相加，字串相加
		System.out.println("5 + \"5\" :" + (z + c));

	}

}
