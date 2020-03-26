package cn.Shisan.ProblemCb;

public class test02_×Ö·û´®ÄêºÅ {
	public static void main(String[] args) {
		char[] c = new char[5];
		int n = 2027,index = 0,t; 
		for (;n > 0;index++) {
			t = n % 26;n = n / 26;
			if(t==0) {
				c[index]='Z';
				n-=1;
			}else if(t!=0) c[index] = (char)(64+t);
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}
}
