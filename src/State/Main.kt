package State

fun main(){
val mouse = Mouse(SelectionTool())
    mouse.doAction()
    mouse.tool=EraseTool()
    mouse.doAction()
}