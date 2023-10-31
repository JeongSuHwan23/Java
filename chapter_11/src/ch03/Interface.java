package ch03;
// abstract class = 하나 이상의 abstract method 포함
// interface = 모든 method가 abstract method

interface A{
    abstract void abc();
}
interface B{
    abstract void bcd();
}

class C{
    void abc() {};
}

class D extends C{} //상속할 때 override는 선택

class E implements A {
    @Override
    public void abc() {
        System.out.println("인터페이스를 상속 받은 클래스는 이런 식으로 오버라이팅을 필수로 해줘야 함");
    }
}

abstract class F implements B {}

class G extends F{
    @Override
    public void bcd() {
        System.out.println("결국 어떤 자식이 추상메서드에서 오버라이딩 시킴");
    }
}


//클래스인 내가 추상 메서드를 상속 받았다면 오버라이딩을 시켜줘야 한다 
//왜? 일반 클래스는 추상 메서드를 가지고 있을 수 없다
//오버라이딩 시키기 귀찮아서 자식한테 넘기고 싶으면 추상 클래스로 전환해야 한다 
public class Interface {
    public static void main(String[] args) {

    }
}
