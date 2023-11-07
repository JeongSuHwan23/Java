package ch01;

//class가 class를 구현-> extends
//class가 interface를 구현 -> implements

interface A{}
interface B{}

class C implements A{}
class D implements A, B{}; // 다중 인터페이스 상속은 지원

//JAVA는 다중 상속 지원 XX
//class E extends C, D{}

//class AND interface 동시에 상속 OO
class F extends C implements A, B{}

public class InheritanceOfInterface {
}
