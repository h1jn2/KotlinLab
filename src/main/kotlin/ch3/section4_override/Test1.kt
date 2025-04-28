package ch3.section4_override

open class Shape {
    open fun draw() {
        println("Shape draw")
    }
    open var name: String = "aaa"
}

open class Rect: Shape() {
    override fun draw() {
        println("Rect draw")
    }
    override var name: String = "bbb"
}

class RoundRect: Rect() {
    override fun draw() {
        println("RoundRect draw")
    }
}

fun drawing(obj: Shape) {
    obj.draw()
}

fun main() {
    drawing(Shape())
    drawing(Rect())
    drawing(RoundRect())
}