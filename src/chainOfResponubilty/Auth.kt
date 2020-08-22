package chainOfResponubilty

class Auth(request: RequestHandler?) :RequestHandler(request) {

    override fun doHandle(httpRequest: HttpRequest): Boolean{
        println("Auth")
        if (httpRequest.number == 1)return true
        return false
    }
}