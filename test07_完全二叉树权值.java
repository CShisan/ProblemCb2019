package cn.Shisan.ProblemCb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test07_��ȫ������Ȩֵ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> sums=new ArrayList<Integer>();
		int n=sc.nextInt(),index=0,count=0;
		int[] qz=new int [n];
		for(int i=0;i<n;i++) qz[i]=sc.nextInt();   //��¼Ȩֵ
		double m=0;
		while(m<n) {//�ж������
			m+=Math.pow(2, count);
			count++;
		}
		for(int i=0,num=0;i<count;i++) {//���ÿ��Ȩֵ
			int sum=0;
			for(int j=0;j<Math.pow(2,i)&&num<n;j++,num++) {
				if(i==0||i==1) sum+=qz[(int) (Math.pow(2,i-1)+j)];
				else sum+=qz[(int) (Math.pow(2,i-1)+1+j)];
			}
			sums.add(sum);
		}
		for(int i=0,max=0;i<sums.size()-1;i++) {//�Ƚ�ÿ��Ȩֵ�����������
			max=Math.max(sums.get(i), sums.get(i+1));
			if(i==sums.size()-2) index=sums.indexOf(max)+1;
		}
		System.out.println("index="+index);
	}
}
	
	
	
