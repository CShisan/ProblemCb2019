package cn.Shisan.ProblemCb;

public class test02_Ω‡±ÚÀ„∑® {
	public static void main(String[] args) {
		int num=676;
		System.out.println(B(num));
	}
	public static String B(int num) {
	    char[] S = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
	            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	    StringBuilder s = new StringBuilder();
	    int sub = 0;
	    for (int count = 0; (Math.pow(26, sub + 1)) + count < num; count += Math.pow(26, sub)) sub++;
	    while (sub >= 0) {
	        int fig = 1;
	        int POW = (int) Math.pow(26, sub);
	        int count = 0;
	        for (int i = sub - 1; i >= 0; i--) count += Math.pow(26, i);
	        while (num - POW * (fig + 1) >= (POW == 1 ? 0 : count)) fig++;
	        num = num - POW * fig;
	        s.append(S[fig - 1]);
	        sub--;
	    }
	    return s.toString();
	}
}
