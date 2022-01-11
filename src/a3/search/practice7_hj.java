package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class practice7_hj {
    /*
        특정 시력을 가진 사람을 검색하는 것으로 변경
    */
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            super();
            this.name=name;
            this.height=height;
            this.vision=vision;
        }

        @Override
        public String toString() {
            return "name="+name+", height="+height+", vision="+vision;
        }

        public static final Comparator<PhyscData> VISION_ORDER=new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.vision>d2.vision) ? 1:(d1.vision<d2.vision) ? -1:0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        PhyscData[] x= {
                new PhyscData("이나령", 162, 0.3),
                new PhyscData("유지훈", 168, 0.4),
                new PhyscData("김한결", 169, 0.7),
                new PhyscData("홍준기", 171, 0.8),
                new PhyscData("전서현", 173, 1.2),
                new PhyscData("이호연", 174, 1.5),
                new PhyscData("이수민", 175, 2.0),
        };
        System.out.println("시력이 몇인 사람을 찾고있나요! : ");
        double vision=sc.nextDouble();

        int idx= Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);

        for(int i=0; i<7; i++) {
            System.out.println(x[i]);
        }

        if(idx<0) {
            System.out.println("요소가 없습니다!");
        }
        else {
            System.out.println("x["+idx+"] 에 있습니다!");
            System.out.println("찾은 데이터 : "+x[idx]);
        }
    }
}
