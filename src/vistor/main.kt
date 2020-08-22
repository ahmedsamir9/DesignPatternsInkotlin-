package vistor

fun main() {
    val selection = Selection()
    val eraser =Eraser()
    val photoshoptools = Photoshoptools()
    photoshoptools.addExcuter(eraser)
    photoshoptools.addExcuter(selection)
    photoshoptools.invokeOperations(HelightOperation())
}