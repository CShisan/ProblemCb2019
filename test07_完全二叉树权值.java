package cn.Shisan.ProblemCb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test07_完全二叉树权值 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> sums=new ArrayList<Integer>();
		int n=sc.nextInt(),index=0,count=0;
		int[] qz=new int [n];
		for(int i=0;i<n;i++) qz[i]=sc.nextInt();   //记录权值
		double m=0;
		while(m<n) {//判断总深度
			m+=Math.pow(2, count);
			count++;
		}
		for(int i=0,num=0;i<count;i++) {//求和每层权值
			int sum=0;
			for(int j=0;j<Math.pow(2,i)&&num<n;j++,num++) {
				if(i==0||i==1) sum+=qz[(int) (Math.pow(2,i-1)+j)];
				else sum+=qz[(int) (Math.pow(2,i-1)+1+j)];
			}
			sums.add(sum);
		}
		for(int i=0,max=0;i<sums.size()-1;i++) {//比较每层权值和输出最大深度
			max=Math.max(sums.get(i), sums.get(i+1));
			if(i==sums.size()-2) index=sums.indexOf(max)+1;
		}
		System.out.println("index="+index);
	}
}
	
	
	
