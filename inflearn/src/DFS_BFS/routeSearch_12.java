package DFS_BFS;

import java.util.Scanner;

/*
입력값
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
*/
public class routeSearch_12 {
	static int n,m,answer = 0;
	static int[][] graph;
	static int ch[];	//방문체크
	
	public void DFS(int v) {
		if(v==n) answer++;	//입력값과 n(정점의 수)가 같을 경우 answer +1
		else {
			for(int i=1;i<=n;i++) {
				if(graph[v][i]==1 && ch[i]==0) { //graph[v][i] = v -> i로 가는 방향의 값의 데이터가 1일 경우 간선이 있음 && ch[i]가 0일 경우 아직 안가본 노선
					ch[i] = 1; //방문을 체크
					DFS(i);//v->i로 이동했으므로 i로 변경
					ch[i] =0; //방문체크 취소 // DFS() -> 다음값이 없다면 다시 돌아와서 ch[i] =0;으로 초기화 시킨다.
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		routeSearch_12 R = new routeSearch_12();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	//정점의 수
		m = sc.nextInt();	//간선의 수
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;	//방향그래프 
		}
		ch[1] = 1;
		R.DFS(1);
		System.out.println(answer);
		
	}

}
