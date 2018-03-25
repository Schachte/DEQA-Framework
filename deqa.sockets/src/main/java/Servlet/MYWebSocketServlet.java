package Servlet;

import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

public class MYWebSocketServlet extends WebSocketServlet {
    @Override
    public void configure(WebSocketServletFactory arg0) {
        arg0.register(MyWebSocket.class);
    }
}
