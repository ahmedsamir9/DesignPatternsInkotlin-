package Iterative

import java.util.*
/*
 important notes  iterative pattern is used to traverse collection
 used 3 main steps
 hasnext()
 getCurrent()
 getnext()
 which was simulated in .foreach{} in kotlin <3
*/
fun main (){
    val array = arrayOf(1,2,3,4,5)
    array.forEach {
        element -> println("array -> $element")
    }
    println("************************")
    val list = LinkedList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.add(5)
    list.forEach { element->
        println("LinkendList -> $element")
    }

}