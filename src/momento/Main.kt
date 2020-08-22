package momento

fun main() {
    val editor = Editor("a")
    History.push(editor.createState())
    editor.state="b"
    History.push(editor.createState())
    editor.state ="C"
    editor.restor(History.pop())
    println(editor.state)
}