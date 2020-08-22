package vistor

class HelightOperation:Operation {
    override fun apply(eraser: Eraser) {
        println("eraser is colored")
    }

    override fun apply(selection: Selection) {
        println("Selection is colored")
    }
}