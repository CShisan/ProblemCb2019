package cn.Shisan.ProblemCb;

import java.util.Date;

public class test03_数列求值 {
	public static void main(String[] args) {		
		int[] a= {0,1,1,1};
		int i;
		for(i=4;i<=20190324;i++) {
			a[i%4]=(a[(i-1)%4]+a[(i-2)%4]+a[(i-3)%4])%10000;	
		}
		System.out.println(a[(i-1)%4]);
	}
}
