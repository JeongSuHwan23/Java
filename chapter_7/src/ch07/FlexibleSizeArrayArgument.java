package ch07;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
    public static void main(String[] args) {
        //메서드 오버로딩을 이용해서 동일한 이름의 메서드를 다양하게 호출
        method1(1, 2);
        method1(1, 2, 3);
        method1();

        method2("안녕", "방가");
        method2("안녕", "방가", "감사");
        method2();
    }

    //가변길이 배열 매개함수
    public static void method1(int...array) {
        for(int k:array) {
            System.out.print(k+" ");
        }
        System.out.println();
    }
    public static void method2(String...array) {
        System.out.println(Arrays.toString(array));

    }
}
