package chainOfResponubilty

fun main(){
    // auth - log - encri - res
    val response =Response(null)
    val encryption =Encryption(response)
    val logger = Logger(encryption)
    val auth = Auth(logger)
    val webServer =WebServer(auth)
    webServer.excute(HttpRequest(2))
}