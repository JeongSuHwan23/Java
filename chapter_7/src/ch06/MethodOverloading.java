package ch06;

public class MethodOverloading {
    public static void main(String[] args){
        print(); //1번 출력
        print(5); //2번 출력
        print(3.44); //3번 출력
        print(0, 1);
    }

    //서로 메소드 시그니쳐가 다르면 이름이 같아도 OK
    public static void print(){
        String data1 = new String("데이터가 없습니다");
        System.out.println(data1);
    }

    public static void print(int a){
        System.out.println(a);
    }

    public static void print(double a){
        System.out.println(a);
    }

    /* 바로 위에 것과 메서드 시그니쳐가 똑같기 때문에 정의 X
    public static void print(double b){
    }*/

    public static void print(int n, int m){
        System.out.print(n + " " + m);
    }

    //메서드 시그니쳐가 다르다는 것은 이름은 똑같지만 매게변수의 종류나 숫자가 다름을 의미
}
