package ex06;

public class ToString {
    //외부에서 m과 n을 직접적으로 접근하지 못 하도록 방어적인 코드를 작성할 필요가 있다
    private int m;
    private int n;
    //간접적으로 메서드를 통해서 필드(데이터)에 접근하도록 코드를 짜야 안전한 코드


    //m에서 값을 가져오는 메서드
    public int getM(){
        return m;
    }

    //n 필드에서 값을 가져오는 메서드
    public void setM(int m){
        this.m = m;
    }

    //n에서 값을 가져오는 메서드
    public int getN(){
        return n;
    }

    //n 필드에서 값을 가져오는 메서드
    public void setN(int n){
         this.n = n;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }

    //간접적으로 메서드를 통해서 필드(데이터)에 접근하도록 코드를 짜야 안전
    public static void main(String[] args) {
    }
}
