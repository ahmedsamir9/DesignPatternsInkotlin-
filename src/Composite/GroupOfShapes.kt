package Composite

class GroupOfShapes (val groupName: String): Shape {
    private  val list = ArrayList<Shape>()
    fun addShape(shape: Shape){
        list.add(shape)
    }
    override fun render() {

        println("this is $groupName")
        for (shape in list){
            shape.render()
        }
    }
}