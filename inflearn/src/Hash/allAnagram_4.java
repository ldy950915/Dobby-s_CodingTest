package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class allAnagram_4 {

	public int solution(String s , String t) {
		int answer = 0;
		HashMap<Character, Integer> sm = new HashMap<Character, Integer>();
		HashMap<Character, Integer> tm = new HashMap<Character, Integer>();
		
		//�Է°� t �ؽ��� ����
		for(char x : t.toCharArray()) {
			tm.put(x, tm.getOrDefault(x, 0) +1);
		}
		
		//�Է°� s �ؽ��� �ʱⰪ ����
		for(int i= 0; i<t.length()-1 ; i++) {
			sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0)+1);
		}
		
		int lt=0;
		for(int rt = t.length()-1; rt<s.length();rt++) {
			sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0) +1);
			if(sm.equals(tm)) { //Map ��
				answer++;
			}
			sm.put(s.charAt(lt), sm.get(s.charAt(lt))-1 );
			if(sm.get(s.charAt(lt)) ==0) {
				sm.remove(s.charAt(lt));
			}
			lt++;
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allAnagram_4 A = new allAnagram_4();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		System.out.println(A.solution(s, t));
	}

}
