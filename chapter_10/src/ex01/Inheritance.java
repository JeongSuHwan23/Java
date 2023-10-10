package ex01;

class Human {
    String name;
    int age;
    void eat() {
        System.out.println("먹음");
    };
    void sleep() {
        System.out.println("잠");
    };
}

class Student extends Human{
    int studentID;
    void goToSchool() {
        System.out.println("등교");
    };
}

class Worker extends Human{
    int workerID;
    void goToWork() {
        System.out.println("출근");
    };
}

public class Inheritance {
    public static void main(String[] args) {
        //Human 객체
        Human h = new Human();
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        //Student 객체
        Student s = new Student();
        s.name = "김민성";
        s.age = 16;
        s.studentID = 121;
        s.eat();
        s.sleep();
        s.goToSchool();

        //Student 객체
        Worker w = new Worker();
        w.name = "정수환";
        w.age = 23;
        w.workerID = 7548;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}
