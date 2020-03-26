package cn.Shisan.ProblemCb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class test05_迷宫 {
	static int m=0;
	public static void main(String[] args) {
		bfs( 0 , 0,  49,  29 );//传入始点,终点左边(x为列,y为行)		
	}
	
	static class bean {
		String str=null;
		int x=0;
		int y=0;
	}
	
	static Map<Integer,Integer> count() {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int row=0,col=0;
		String str = null;
		try {
			FileReader r = new FileReader("src/cn/Shisan/ProblemCb/迷宫.txt");
			BufferedReader br=new BufferedReader(r);
			while((str=br.readLine())!=null) {
				row++;
				col=str.length();
			}
			map.put(1, row);
			map.put(2, col);
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		return map;
	}

	static char[][] rf() {
		Map<Integer,Integer> map=count();
		int c,i=0,j=0,row=map.get(1),col=map.get(2);	
		System.out.println(row+"  "+col);
		char[][] cbuf=new char[row][col];
		try {
			FileReader r = new FileReader("src/cn/Shisan/ProblemCb/迷宫.txt");
			BufferedReader br=new BufferedReader(r);
			while((c=br.read())!=-1) {
				if(c==13||c==10)continue;
				cbuf[i%row][j%col]=((char)c);
				
				j++;
				if(j!=0&&j%col==0)i++;
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
		
		return cbuf;
	}
	
	
	
	static void bfs(int sx,int sy,int zx,int zy) {
		bean que=new bean();
		char[][] mg=rf();
		int maxX=mg[0].length;
		int maxY=mg.length;
		int[][] vis=new int[maxY][maxX];
		String[] dire= {"U","D","L","R"};//字典
		List<bean> queue=new ArrayList<bean>();
		int[] nextx= {0, 0, -1, 1};//x为列,y为行
		int[] nexty= {-1, 1, 0, 0};//上下左右
		vis[0][0]=1;
		que.x=sx;que.y=sy;que.str="";
		queue.add(que);
		while(!queue.isEmpty()) {
			bean q=new bean();
			q.x=queue.get(0).x;
			q.y=queue.get(0).y;
			q.str=queue.get(0).str;
			if(q.x==zx&&q.y==zy)break;
			queue.remove(0);
			for(int i=0;i<4;i++) {
				int newx=q.x+nextx[i];
				int newy=q.y+nexty[i];
				if(newx>=0&&newx<maxX&&newy>=0&&newy<maxY) {//判断是否越界
					if(vis[newy][newx]==0) {//判断是否访问过
						if(mg[newy][newx]==48) {//判断是否有阻碍
							vis[newy][newx]=1;
							bean temp=new bean();
							temp.x=newx;
							temp.y=newy;
							temp.str=q.str+dire[i];
							queue.add(temp);
							m++;
						}
					}
				}
			}
		}
		System.out.println(queue.get(0).str);	
		System.out.println("一共走了"+m+"步");
	}
}
