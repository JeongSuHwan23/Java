package ch02;

class A{
    //다양한 필드 정의 (초기화 X)
    //과연 어떤 값이 들어있을까?
    boolean n1;
    int n2;
    double n3;
    String n4;

    //초기화 안 시킨 필드 출력하는 메서드
    void printFieldValue(){
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }

    void printLocalVariable() {
        //k는 지역 변수 (필드 X)
        int k=10;
        System.out.println(k);
    }
}


public class InitialValue {

    public static void main(String[] args){
        A a = new A();
        a.printFieldValue();
        //출력이 잘 된다
        //필드는 컴파일러가 자동으로 초기화 시켜준다.

        a.printLocalVariable();
        //지역 변수는 출력 X
        //지역 변수는 필드와 다르게 초기화를 반드시 시켜줘야 한다.
    }
}
