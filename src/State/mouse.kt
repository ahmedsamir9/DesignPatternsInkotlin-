package State

data class Mouse(var tool: Tool){
    fun doAction(){
        tool.action()
    }
}