package a3.search;

import java.io.*;
import java.util.*;

public class practice7_ms {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PhyscData[] arr = {
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("김한결", 159, 0.5),
				new PhyscData("홍준기", 171, 0.6),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("이호연", 154, 1.2),
				new PhyscData("이수민", 175, 2.0)
		};
		System.out.print("시력이 몇인 사람을 찾고 있나요?:");
		double vision = Double.parseDouble(br.readLine());
		int idx = Arrays.binarySearch(arr, new PhyscData("",0,vision));
		if(idx<0) {
			System.out.print("요소가 없습니다.");
		}else {
			System.out.print("arr["+idx+"]에 있습니다.");
			System.out.print("찾은 데이터:"+arr[idx]);
		}
		
	}
	
	static class PhyscData implements Comparable<PhyscData>{
		private String name; //이름
		private int height; //키
		private double vision; //시력
		
		public PhyscData(String name, int height, double vision) { //생성자
			super();
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		@Override
		public String toString() {
			return name+" "+height+" "+vision;
		}

		@Override
		public int compareTo(PhyscData o) {
			return Double.compare(this.vision, o.vision);
		}
	}
}
