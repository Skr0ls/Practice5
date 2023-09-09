class ColoredPoint(): Point() {
    var color: Color? = null
    var point: Point = Point()
    //Вторичные конструкторы класса
    constructor(_x: Double, _y: Double, _color: Color): this() {
        point = Point(_x, _y)
        color = _color
    }
    constructor(_x: Double, _color: Color): this(_x, 0.0, _color)
    //
    override fun info() {
        println("Точка с координатами ($x,$y), имеет цвет $color")
    }
}