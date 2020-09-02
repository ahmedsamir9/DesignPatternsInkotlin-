package Composite

fun main(){
    val circle = Circle()
    val rectangle = Rectangle()
    val groupOne = GroupOfShapes("group 1")
    groupOne.addShape(circle)
    groupOne.addShape(rectangle)
    groupOne.render()
    println("**************************************************************")
    val square =Square()
    val groupTwo = GroupOfShapes("group 2")
    groupTwo.addShape(square)
    groupTwo.addShape(groupOne)
    groupTwo.render()

}