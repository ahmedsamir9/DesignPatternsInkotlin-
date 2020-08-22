package vistor

class Selection :Excuter {
    override fun execute(operation: Operation) {
        operation.apply(this)
    }
}