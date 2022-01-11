package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class practice6_hj {
    /*
        실습 3-5를 수정하여 검색 실패 시 삽입 포인트 값 출력하도록
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("요소수 : ");
        int num=sc.nextInt();
        int[] x=new int[num];

        System.out.println("오름차순으로 입력하세요!");

        System.out.println("x[0] : ");
        x[0]=sc.nextInt();

        for(int i=1; i<num; i++) {
            do {
                System.out.println("x["+i+"] : ");
                x[i]=sc.nextInt();
            } while(x[i]<x[i-1]);
        }

        System.out.println("검색할 값 : ");
        int ky=sc.nextInt();

        int idx= Arrays.binarySearch(x, ky);

        if(idx<0) {
            System.out.println("그 값의 요소가 없습니다!");
            if((idx+1)*-1>num) {
                System.out.println("쓰레기 값!");
            }
            else {
                System.out.println(x[(idx+1)*-1]);
            }
        }
        else {
            System.out.println(ky+" 은(는) x["+idx+"] 에 있습니다!");
        }
    }
}
