package chap03;

import java.util.Scanner;

public class practice3_hj {
    /*
        요솟수가 n인 배열 a에서
        key와 일치하는 인덱스
        배열 idx에 저장
        일치한 요솟수 반환
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("요소수 : ");
        int num=sc.nextInt();
        int[] a=new int[num+1];
        int[] idxArr=new int[num];

        for(int i=0; i<num; i++){
            System.out.println("a["+i+"] : ");
            a[i]=sc.nextInt();
        }

        System.out.println("key : ");
        int ky=sc.nextInt();

        int idx=searchIdx(a, num, ky, idxArr);

        if(idx==0){
            System.out.println("일치 하는 값이 없습니다!");
        }
        else{
            System.out.println(idx+" 개 일치!");
        }
    }

    static int searchIdx(int[] a, int n, int key, int[] idx){
        int cnt=0;
        for(int i=0; i<n; i++){
            if (a[i] == key) {
                idx[cnt]=i;
                cnt++;
            }
        }
        for(int i=0; i<cnt; i++){
            System.out.println(idx[i]);
        }

        return cnt;
    }
}