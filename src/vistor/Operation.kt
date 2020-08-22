package vistor

interface Operation {
    fun apply (eraser: Eraser)
    fun apply (selection: Selection)
}