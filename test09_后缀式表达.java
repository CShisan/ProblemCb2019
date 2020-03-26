package cn.Shisan.ProblemCb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test09_后缀式表达 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int add,sign,sum=0;
		add=sc.nextInt();
		sign=sc.nextInt();
		int[] nums=new int[add+sign+1];
		for(int i=0;i<nums.length;i++) nums[i]=sc.nextInt();
		px(nums);
		for(int i=0;i<nums.length;i++) {
			if(i<=add) sum+=nums[i];
			else sum-=nums[i];
		}
		System.out.println(sum);
	}
	static void px(int[] sz) {//冒泡排序
		for(int i=0;i<sz.length;i++) {
			for(int j=0;j<sz.length-i-1;j++) {
				if(sz[j]<sz[j+1]) {
					int temp=sz[j];
					sz[j]=sz[j+1];
					sz[j+1]=temp;
				}
			}
		}
	}
}
