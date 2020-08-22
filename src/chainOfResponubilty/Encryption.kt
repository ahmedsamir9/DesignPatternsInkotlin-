package chainOfResponubilty

class Encryption(request :RequestHandler?) : RequestHandler(request) {
    override fun doHandle(httpRequest: HttpRequest): Boolean {
        println("enc")
        return true
    }

}