package cn.Shisan.ProblemCb;

public class test01_选球员问题 {
	static int[][] team = {	
			{ 1, 97, 90,  0,  0,  0 }, 
			{ 2, 92, 85, 96,  0,  0 }, 
			{ 3,  0,  0,  0,  0, 93 }, 
			{ 4,  0,  0,  0, 80, 86 },
			{ 5, 89, 83, 97,  0,  0 }, 
			{ 6, 82, 86,  0,  0,  0 }, 
			{ 7,  0,  0,  0, 87, 90 }, 
			{ 8,  0, 97, 96,  0,  0 }, 
			{ 9,  0,  0, 89,  0,  0 },
			{10, 95, 99,  0,  0,  0 }, 
			{11,  0,  0, 96, 97,  0 }, 
			{12,  0,  0,  0, 93, 98 }, 
			{13, 94, 91,  0,  0,  0 }, 
			{14,  0, 83, 87,  0,  0 },
			{15,  0,  0, 98, 97, 98 }, 
			{16,  0,  0,  0, 93, 86 }, 
			{17, 98, 83, 99, 98, 98 }, 
			{18, 93, 87, 92, 96, 98 },
			{19,  0,  0,  0, 89, 92 }, 
			{20,  0, 99, 96, 95, 81 } 
	};
	
	static int[] vis=new int[20];
	static int max_sum=0;
	
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			vis[i]=0;
		}
		dfs(1,0);
		System.out.println(max_sum);
	}
	static void dfs(int col,int sum) {
		if(col==6) {
			max_sum=Math.max(sum,max_sum);
		}else {
			for(int i=0;i<20;i++) {
				if(vis[i]==0) {
					vis[i]=1;
					dfs(col+1,sum+team[i][col]);
					vis[i]=0;
				}
			}
		}
	}
	
}
