package ch08;

//class에는 필드와 메서드뿐만 아니라 생성자라는 것이 존재한다
//생성자는 new를 통해서 객체 생성을 가능하게 해주는 존재이다
//필수 요소이기 때문에 없어서는 안되며, 개발자가 생성자를 넣지 않았다면 컴파일러가 대신 넣어준다
class A {
    int n;
    void work(){
        System.out.println(n);
    }
    //이게 바로 (디폴트) 생성자이다.
    //생성자의 이름은 클래스 이름과 반드시 동일해야 한다.
    A(){}
}

class B {
    int n;
    void work(){
        System.out.println(n);
    }
}

class C{
    int n;
    void work(){
        System.out.println(n);
    }
    //매개변수가 들어간 형태의 생성자도 정의 가능
    //단 이런 경우에 컴파일러가 디폴트 생성자를 생성 X
    C(int a){
        n=a;
    }
}

public class DefaultConstructor {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C(0);
    }
}
