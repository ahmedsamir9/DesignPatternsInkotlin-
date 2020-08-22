package vistor

class WorkOperation:Operation {
    override fun apply(eraser: Eraser) {
        println("erase")
    }

    override fun apply(selection: Selection) {
        println("selection")
    }
}