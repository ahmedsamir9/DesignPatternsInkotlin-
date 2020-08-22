package chainOfResponubilty

class WebServer(_requestHandler: RequestHandler?) {
    private val requestHandler = _requestHandler

    fun excute(httpRequest: HttpRequest){
        requestHandler?.handle(httpRequest)
    }
}