package cn.Shisan.ProblemCb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test08_�Ȳ����� {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] dc=new int[n];
		int[] cz=new int[n-1];
		for(int i=0;i<n;i++) dc[i]=sc.nextInt();//��¼����ֵ;
		px(dc);	
		for(int i=0;i<n-1;i++) cz[i]=dc[i+1]-dc[i]; //���ÿ�����Ĳ�ֵ
		px(cz);
		for(int i=1,num=dc[0];num<=dc[n-1];i++) {//��ӡ�Ȳ�����
			System.out.print(num+"\t");
			if(i==5)System.out.println();
			num+=cz[0];
		}
	}
	static void px(int[] sz) {//ð������
		for(int i=0;i<sz.length;i++) {
			for(int j=0;j<sz.length-i-1;j++) {
				if(sz[j]>sz[j+1]) {
					int temp=sz[j];
					sz[j]=sz[j+1];
					sz[j+1]=temp;
				}
			}
		}
	}
}
