package algorithm.programmerAndOthers;

import java.util.Stack;

// https://programmers.co.kr/learn/courses/30/lessons/64061
// 크레인 인형뽑기 문제 

public class ProgrammersMySol_1 {
	public static int solution(int[][] board, int[] moves) {
		Stack<Integer> st = new Stack<Integer>();

		int idx = 0;
		int cnt = 0;
		int[] getBoard = new int[board.length];

		for(int i = 0; i < moves.length; i++) {
			int firstIdx = moves[i] - 1;

			for(int j = 0; j < board.length; j++) {
				getBoard[j] = board[j][firstIdx];
				if(getBoard[j] != 0) {
					st.push(getBoard[j]);
					board[j][firstIdx] = 0;
					break;
				}
			}
			//System.out.println(st);

			if((st.size() > 1) && (st.get(st.size() - 1)  == st.get(st.size()- 2))) {
				st.pop();
				cnt++;
				st.pop();
				cnt++;
			}

		}
		//System.out.println(cnt);
		
		return cnt;
	}
	
	public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
		};

		int[] moves = {1,5,3,5,1,2,1,4};
		// 

		int result = solution(board, moves);
		System.out.println(result);
	}
}
