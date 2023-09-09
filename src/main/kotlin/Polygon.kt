class Polygon(vararg _points: Point): Line() {
    var points: Array<Point>

    init {
        points = _points as Array<Point>
    }

    fun moveOx(dx: Double){
        for (i in points){
            i.x = i.x?.plus(dx)
        }
    }

    fun moveOy(dy: Double){
        for (i in points){
            i.y = i.y?.plus(dy)
        }
    }

    fun move(dx: Double, dy: Double){
        for (i in points){
            i.x = i.x?.plus(dx)
            i.y = i.y?.plus(dy)
        }
    }

    override fun info() {
        println("Многоугольник с координатами точек: ")
        for (i in points){
            print("(${i.x},${i.y}) ")
        }
    }
}