package algorithm.DFSandBFS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

// 단어변환 (프로그래머스 Lv3 문제와 동일)
// begin = "hit", target = "cog", list = "hot", "dot", "dog", "lot", "log", "cog"
public class BFS_WordLadder {
	public int ladderLength_neighbor(String beginWord, String endWord, List<String> wordList) {
		// 1. null , wordList 값 체크 
		if(wordList == null || !wordList.contains(endWord)) {
			return 0;
		}
		
		Queue<String> queue = new LinkedList<String>();
		Set<String> dict = new HashSet<String>(wordList);
		
		queue.offer(beginWord);
		dict.add(endWord);
		dict.remove(beginWord);
		
		int level = 1;
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				String str = queue.poll();
				
				if(str.equals(endWord)) {
					return level;
				}
				
				for(String neighbor : neighbors(str, wordList)) {
					queue.offer(neighbor);
				}
			}
			level++;
		}
		
		return 0;
	} 
	//
	public List<String> neighbors(String s, List<String> wordList) {
		List<String> result = new LinkedList<String>();
		Set<String> dict = new HashSet<String>(wordList);
		
		for(int i = 0; i < s.length(); i++) {
			char[] chars = s.toCharArray();
			for(char ch = 'a'; ch <= 'z'; ch++) {
				chars[i] = ch; // ait ~ zit
				String word = new String(chars);
				if(dict.remove(word)) {
					result.add(word);
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String[] word = {"hot", "dot", "dog", "lot", "log", "cog"};
		List<String> wordList = Arrays.asList(word);
		
		BFS_WordLadder a = new BFS_WordLadder();
		System.out.println(a.ladderLength_neighbor("hit", "cog", wordList));
	}
}




