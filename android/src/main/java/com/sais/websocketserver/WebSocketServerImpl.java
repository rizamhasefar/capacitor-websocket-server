package com.sais.websocketserver;

import android.util.Log;

import org.java_websocket.server.WebSocketServer;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;

import java.net.InetSocketAddress;

public class WebSocketServerImpl extends WebSocketServer {

    public WebSocketServerImpl(InetSocketAddress address) {
        super(address);
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        Log.d("WebSocket", "New connection: " + conn.getRemoteSocketAddress());
        conn.send("Welcome to the WebSocket server!");
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        Log.d("WebSocket", "Connection closed: " + reason);
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        Log.d("WebSocket", "Message received: " + message);
        conn.send("Echo: " + message);
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        Log.e("WebSocket", "Error: ", ex);
    }

    @Override
    public void onStart() {
        Log.d("WebSocket", "Server started!");
    }
}
