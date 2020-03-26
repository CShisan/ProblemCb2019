package cn.Shisan.ProblemCb;

public class test04_数的分解 {
	static boolean pd(int num) {
		while(num>0) {
			int temp=num%10;
			if(temp==2||temp==4)
				return false;
			num /= 10;
		}
		return true;
	}
	public static void main(String[] args) {
		int n=0;
		for(int i=1;i<=2019;i++) {
			if(pd(i))
				for(int j=i+1;j<=2019;j++) {
					if(pd(j)) {
						int k=2019-i-j;
						if(k>j&&pd(k)) n++;
					}
				}
		}
		System.out.println(n);
	}
}
