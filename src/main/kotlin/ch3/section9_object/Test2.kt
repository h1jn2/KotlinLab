package ch3.section9_object.two

class Outer {
    private var no = 10

    // 클래스 선언과 동시에 객체 생성 (익명클래스)
    val myInner = object {
        var innerData = 0
        fun innerFun() {
            innerData++
            no++    // outer 멤버 이용 가능
        }
    }

    fun outerFun() {
        // Any 타입의 객체로 인지하기 때문에 innerData 가 없음
//        myInner.innerData++   // error
//        myInner.innerFun()    // error
    }
}

class Outer2 {
    private var no = 10

    // private 으로 선언하면 outer 에서 익명 객체 멤버 참조가 가능
    // 컴파일러가 내부적으로 이름을 가지는 새로운 클래스를 만들고 그 클래스 내에
    // 포함시켜 타입으로 표현되기 코드를 구성해주기 때문
    private val myInner = object {
        var innerData = 0
        fun innerFun() {
            innerData++
            no++
        }
    }

    fun outerFun() {
        myInner.innerData++
        myInner.innerFun()
    }
}