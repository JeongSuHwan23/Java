package ch02;
//abstract = 추상적인
//클래스 안 메서드 중에서 하나라도 abstract가 존재한다 -> 'abstract class 0'로 선언

//abstract method = 아직 기능 정의 X
//자식이 상속할 때 선언

import java.sql.SQLOutput;

abstract class Animal {
    abstract void cry(); //cry를 완성시키지 않은 것은 아니다. 역활 : 아무 것도 안 하는 것
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");;
    }
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");;
    }
}

public class AbstractModifier {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.cry();
        Animal dog = new Dog();
        dog.cry();
    }
}
