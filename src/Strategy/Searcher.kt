package Strategy

import SearchingAlgorithm
import java.awt.image.BufferStrategy

data class Searcher(var searchStrategy: SearchingAlgorithm) {

    fun isFoundInList(elementList:List<Int>,target:Int):Boolean{
        return searchStrategy.search(elementList,target)
    }
}