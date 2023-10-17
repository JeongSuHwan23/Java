package ex06;

public class CallGetterAndSetter {
    public static void main(String[] args) {
        ToString a = new ToString();
        a.setM(4);
        //m을 직접적으로 접근이 불가능. 반드시 get or set을 통해서 접근
        //System.out.println(a.m); XX
        System.out.println(a.getM());

        a.setN(5);
        System.out.println(a.getN());

        System.out.println(a.toString());
    }
}
