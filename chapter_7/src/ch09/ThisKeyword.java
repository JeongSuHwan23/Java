package ch09;

class A{
    int n;
    int m;
    void init(int n, int m){
        this.m = m;
        this.n = n;
        //'this.'을 사용하면 지역 변수가 아닌 필드를 가리키게 된다.
    }
}

public class ThisKeyword {

    public static void main(String[] args){
        A a = new A(); //A class 정의
        a.init(2, 3);
        System.out.println(a.n);
        System.out.println(a.m);
    }
}
