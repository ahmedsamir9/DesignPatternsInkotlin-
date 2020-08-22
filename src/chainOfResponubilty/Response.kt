package chainOfResponubilty

class Response (request :RequestHandler?) : RequestHandler(request) {
    override fun doHandle(httpRequest: HttpRequest): Boolean {
        println("hi hi  res is here")
        return false
    }

}