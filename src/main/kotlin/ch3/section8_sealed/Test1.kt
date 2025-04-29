package ch3.section8_sealed

sealed class Shape(val x: Int, val y: Int) {
    class Circle(x: Int, y: Int, val radius: Int) : Shape(x, y)
}

class Rect(x: Int, y: Int, val width: Int, val height: Int): Shape(x, y)

fun main() {
    // 일반 클래스와 다르게 sealed 클래스는 직접 생성해서 이용 불가 -> 서브 클래스만 가능
//    val obj1 = Shape(10, 10)  // error
    val obj2: Shape = Shape.Circle(10, 10, 5)
    val obj3: Shape = Rect(10, 10, 20, 20)

}

// 추상클래스도 직접 생성이 안됨 -> 서브 클래스의 객체만 생성 가능 => sealed 와 동일
// 추상클래스의 생성자는 public 가능 -> 아무곳에서나 하위 클래스를 생성할 수 있다는 의미
abstract class AbstractClass public constructor() {

}

// public 생성자를 추가할 수 없음 -> 동일 파일, 동일 패키지에서만 하위 클래스를 생성할 수 있음
// sealed 클래스의 생성자는 private 로 고정되어 동일 파일 내에서만 하위 클래스를 만들 수 있는데
// 컴파일러 기법으로 동일 패키지까지 확장되었음
sealed class SealedClass private constructor() {

}