package vistor

class Eraser:Excuter {
    override fun execute(operation: Operation) {
        operation.apply(this)
    }
}