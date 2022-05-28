package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class craneGame_3 {

	public int solution(int n, int[][] board, int m , int[] moves ) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		//moves Ž��
		for(int pos : moves) {
			//board.length�� ��ũ�� , board[0].length �� ��ũ��
			for(int i =0; i<board.length; i++) {
				if(board[i][pos-1] != 0) {
					int tmp= board[i][pos-1];
					board[i][pos-1] = 0; //������ 0���� �ʱ�ȭ
					//�ٱ��Ͽ� ���� �̹� �����鼭 , tmp�� stack���� �������
					if(!stack.isEmpty() && tmp ==stack.peek()) {
						answer +=2;
						stack.pop();
					}else {						
						stack.push(tmp);
					}
					break; //�ѹ� ������ break�ؾ���
					
				}
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		craneGame_3 C = new craneGame_3();
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    int[][] board = new int[n][n];
	    
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<n;j++) {
	    		board[i][j] += in.nextInt(); 
	    	}
	    }
	    int m = in.nextInt();
	    int[] moves = new int[m];
	    for(int i=0;i<m;i++) {
	    	moves[i] += in.nextInt();
	    }
	    System.out.println(C.solution(n, board, m, moves));
	}

}
