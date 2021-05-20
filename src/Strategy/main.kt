package Strategy

import SearchTypes.BinarySearch

fun main(){
    val elements = listOf<Int>(1,2,3,4,6)
    val searcher = Searcher(BinarySearch())
    println(searcher.isFoundInList(elements,0))
}