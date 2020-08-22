package chainOfResponubilty

class Logger (request: RequestHandler?) :RequestHandler(request) {
    override fun doHandle(httpRequest: HttpRequest): Boolean {
        println("logged")
        return true
    }


}