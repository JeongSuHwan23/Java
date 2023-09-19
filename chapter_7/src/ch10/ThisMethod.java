package ch10;

class A{
    A() {
         this(10);
        System.out.println("first");
    }
    //또 다른 생성자 추가 가능
    A(int a) {
        System.out.println("second");
    }
    //this() : 자신 외의 또 다른 생성자를 호출할 때 사용 <- 자주 사용 XX
    //this. : 지역 변수가 아닌 필드를 가리킬 때 사용  <- 자주 사용
}

public class ThisMethod {
    public static void main(String[] args){
        A a = new A(); //생성자 호출
    }
}
