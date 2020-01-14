package me.marcelschr.cardgame

import me.marcelschr.cardgame.ExampleServer
import org.java_websocket.server.WebSocketServer
import java.net.InetSocketAddress

/**
 * Starts the application and blocks.
 */
class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val host = "localhost"
            val port = 8887
            val server: WebSocketServer =
                ExampleServer(InetSocketAddress(host, port))
            server.run()
        }
    }
}