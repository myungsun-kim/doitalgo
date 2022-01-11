package a3.search;

import java.io.*;
import java.util.*;

public class practice2_ms {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input1.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("요솟수: ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		
		for(int i=0;i<n;i++) {
			System.out.print("arr["+i+"]:");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print("검색할 값:");
		int key = Integer.parseInt(br.readLine());
		int idx = seqSearchSen(arr, n, key); //배열 arr에서 값이 key인 요소를 검색
		
		br.close();
		System.out.println(sb.toString());
		if(idx==-1) {
			System.out.print("그 값은 요소가 없습니다.");
		}else {
			System.out.print(key+"은(는) arr["+idx+"]에 있습니다.");			
		}
	}

	static int seqSearchSen(int[] arr, int n, int key) {
		int answer = -1;
		for(int i=0;i<n;i++) {
			print(arr, i);
			if(arr[i]==key) {
				answer = i;
				break;
			}
		}
		return answer;
	}
	
	static void print(int[] arr, int idx) {
		for(int i=0;i<arr.length;i++) {
			if(i==idx) sb.append('*').append(' ');
			else sb.append("   ");
		}
		sb.append('\n');
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]).append(' ');
		}
		sb.append('\n');
	}
}
