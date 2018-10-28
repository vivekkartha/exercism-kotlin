class Triangle(x: Double, y: Double, z: Double){
    constructor(x: Int,y: Int,z: Int) : this(x.toDouble(),y.toDouble(),z.toDouble())
    
    init {
        require(x > 0.0 || y>0.0 || z>0.0)
        require(x+y > z && y+z > x && x+z > y)
    }

    val sides = listOf(x,y,z)
    val count = sides.groupingBy{ it }.eachCount().maxBy{ it.value }!!.value
    
    val isEquilateral = count == 3
    val isIsosceles = count == 2 || isEquilateral
    val isScalene = count == 1
}