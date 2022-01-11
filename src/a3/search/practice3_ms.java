package a3.search;

import java.io.*;
import java.util.*;
// 요솟수가 n인 배열 arr에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고
// 일치한 요솟수를 반환하는 메서드를 작성
public class practice3_ms {
	static int[] idx;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input2.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("요솟수: ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		idx = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print("검색할 값:");
		int key = Integer.parseInt(br.readLine());
		int answer = searchIdx(arr, n, key); //배열 arr에서 값이 key인 요소를 검색
		
		System.out.println(sb.toString());
		System.out.print(answer);
	}

	static int searchIdx(int[] arr, int n, int key) {
		int index = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				idx[index++] = i;
				sb.append(i).append(' ');
			}
		}
		return index;
	}
}
