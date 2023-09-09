open class Point(_x:Double, _y: Double): Figure() {
    var x: Double? = null
        set(value) {field = value}
        get() {return field}
    var y: Double? = null
        set(value) {field = value}
        get() {return field}

    init {
        x = _x
        y = _y
    }

    constructor(): this(0.0,0.0)
    constructor(_x: Double): this(_x, 0.0)

    override fun info() {
        println("($x,$y)")
    }
}