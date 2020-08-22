package chainOfResponubilty

abstract class RequestHandler (requestHandler: RequestHandler?){
    val next :RequestHandler? = requestHandler
    fun handle (httpRequest: HttpRequest){
        if(!doHandle(httpRequest))
            return
        next?.handle(httpRequest)
    }
    abstract fun doHandle(httpRequest: HttpRequest):Boolean
}