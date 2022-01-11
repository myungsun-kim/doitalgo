package chap03;

import java.util.Scanner;

public class practice5_hj {
    /*
        이진 검색 알고리즘에서 맨 앞의 요소를 찾는 binSearchX 메서드 작성
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("요소수 : ");
        int num=sc.nextInt();
        int[] a=new int[num];

        System.out.println("오름차순으로 입력!");

        System.out.println("x[0] : ");
        a[0]=sc.nextInt();

        for(int i=1; i<num; i++){
            do{
                System.out.println("a["+i+"] : ");
                a[i]=sc.nextInt();
            }while(a[i]<a[i-1]);
        }

        System.out.println("key : ");
        int ky=sc.nextInt();

        int idx=binSearchX(a, num, ky);

        if(idx==0) {
            System.out.println("일치하는 값이 없습니다!");
        }
        else {
            System.out.println(ky+" 은(는) x["+idx+"] 에 있습니다!");
        }
    }

    static int binSearchX(int[] a, int n, int key){
        int pl=0;
        int pr=n-1;

        do{
            int pc=(pl+pr)/2;
            if(a[pc]==key) {
                for (int i = pc; i > 0; i--) {
                    if (a[i] == key) {
                        pc = i;
                    }
                }
                return pc;
            }
            else if(a[pc]<key){
                pl=pc+1;
            }
            else {
                pr = pc - 1;
            }
        } while(pl<=pr);

        return -1;
    }
}
