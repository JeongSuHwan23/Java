package ex04;

class Animal{
      void cry() {}
}

class Bird extends Animal{
    @Override
    void cry() {
        System.out.println("짹짹");
    }
}

class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //animal.cry();
        Animal bird = new Bird();
        //bird.cry();
        Animal cat = new Cat();
        //cat.cry();
        Animal dog = new Dog();
        //dog.cry();

        //1개의 객체로 3개의 객체를 모두 관리 하고 싶을 때
        //컴파일러가  Animal class로 upcasting을 시켜줌
        Animal[] animals = {bird, cat, dog};
        for (Animal animal1 : animals) {
            animal.cry();
        }
    }
}
