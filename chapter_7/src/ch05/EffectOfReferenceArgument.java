package ch05;

import java.util.Arrays;

public class EffectOfReferenceArgument {

    public static void main(String[] args){
        int[] a = new int[] {1, 2, 3};
        System.out.println(Arrays.toString(a));
        twice(a);
        System.out.println(Arrays.toString(a));
        //call by reference 예시 : 값이 아닌 주소를 전달
        //main 메서드의 a와 twice 메서드의 a는 같은 배열이므로 같이 값이 바뀐다
    }

    public static void twice(int[] a){
        for(int i=0; i<a.length; i++){
            a[i] = a[i] * 2;
        }
    }
}
