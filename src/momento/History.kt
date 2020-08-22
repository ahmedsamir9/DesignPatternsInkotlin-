package momento

import java.util.*

class History {
//Take care in diagram
   companion object{
      private val history:Stack<EditorStates> = Stack()
      fun push(state: EditorStates){
         history.push(state)
      }
      fun pop(): EditorStates {
         return history.pop()
      }
   }
}