package a3.search;

import java.io.*;
import java.util.*;
// 요솟수가 n인 배열 arr에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고
// 일치한 요솟수를 반환하는 메서드를 작성
public class practice5_ms {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input3.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("요솟수: ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print("검색할 값:");
		int key = Integer.parseInt(br.readLine());
		int answer = binSearchX(arr, n, key); //배열 arr에서 값이 key인 요소를 검색
		
		System.out.print(answer);
	}

	static int binSearchX(int[] arr, int n, int key) {
		int start = 0; //검색 범위의 첫 인덱스
		int end = n-1; //검색 범위의 끝 인덱스
		int idx = -1; //정답
		while(true) {
			int mid = start+end/2;
//			System.out.println(start+" "+end+" "+mid+" "+key);
			if(arr[mid] == key) {
				idx = mid;
				// 앞에 더 작은 인덱스가 있는지 확인
				end = mid-1;
			}else if(arr[mid]<key) { //검색 범위를 뒤쪽 절반으로
				start = mid+1;
			}else if(arr[mid]>key) {
				end = mid-1;
			}
			if(start>=end) break;
		}
		
		return idx;
	}
}
