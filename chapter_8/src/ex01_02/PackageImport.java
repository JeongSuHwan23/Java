package ex01_02;

import ex01_01.A;

public class PackageImport {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        System.out.println(a.n);
    }
}
