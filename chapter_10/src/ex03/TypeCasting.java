package ex03;

//Class A는 부모가 없는 것처럼 보이지만, 자동으로 extend Object가 붙으면서 최상의 클래스인
//Object의 자식이 된다
class A{
    int m=3;
    void abc() {
        System.out.println("A class");
    }

    //toString은 Class를 설명하는 용도로 사용
    @Override
    public String toString() {
        return "Hello! I'm A Class. I have field m and method abc().";
    }
}

class B extends A {
    int n=4;
    void bcd() {
        System.out.println("B class");
    }

    @Override
    void abc() {
        super.abc();
    }

    @Override
    public String toString() {
        return "I'm B class";
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        //작은 풍선을 만들고 작은 풍선을 가리키는 경우
        A aa = new A();
        //toString()은 Object Class로 부터 상속 받은 메서드이다.
        System.out.println(aa.toString());
        System.out.println(aa.m);
        aa.abc();

        //크고 작은 풍선을 만들고, 작은 풍선을 가리키는 경우
        A bb = new B();
        System.out.println(bb.toString());
        System.out.println(bb.m);
        bb.abc();
        //bb가 가리키는 작은 풍선 안에 n이 없기 때문에 사용 XX
        //System.out.println(bb.n);
        //A였던 bb를 B로 다운캐스팅했다. 즉 큰 풍선을 가리키는 것으로 바꿈
        System.out.println(((B)bb).n);
        ((B)bb).bcd();

        B cc = new B();
        System.out.println(cc.m);
        System.out.println(cc.n);
        cc.abc();
        cc.bcd();
    }
}
