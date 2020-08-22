package momento

data class Editor (var state :String) {
    fun createState(): EditorStates {
        return EditorStates(state)
    }
    fun restor(currentState :EditorStates){
        state =currentState.name
    }
}