package cn.Shisan.ProblemCb;

import java.util.Scanner;

public class test06_特别数和 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sum(num);
	}
	static void sum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(len(i)) {
				System.out.print(i+"  ");
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	static Boolean len(int num) {
		String str=String.valueOf(num);
		int x=1;
		for(int i=0;i<str.length();i++) x*=10;
		for(int i=0;i<str.length();i++) {
			int n=num%x;
			n/=(x/=10);
			if(pd(n)) return true;
		}
		return false;
	}
	static Boolean pd(int n) {
		if(n==2 || n==0 || n==1 || n==9) return true;
		else return false;
	}
}
