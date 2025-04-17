package com.sais.websocketserver;

import android.util.Log;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.JSObject;

import java.net.InetSocketAddress;

@CapacitorPlugin(name = "WebSocketServer")
public class WebSocketServerPlugin extends Plugin {

    private WebSocketServerImpl server;

    @PluginMethod
    public void startServer(PluginCall call) {
        Integer portValue = call.getInt("port");
        int port = portValue != null ? portValue : 3000;

        if (server != null && server.isAlive()) {
            JSObject result = new JSObject();
            result.put("status", "already running");
            call.resolve(result);
            return;
        }

        try {
            server = new WebSocketServerImpl(new InetSocketAddress(port));
            server.start();
            JSObject result = new JSObject();
            result.put("status", "started");
            call.resolve(result);
        } catch (Exception e) {
            call.reject("Failed to start server: " + e.getMessage());
        }
    }

    @PluginMethod
    public void stopServer(PluginCall call) {
        try {
            if (server != null) {
                server.stop();
                server = null;
                JSObject result = new JSObject();
                result.put("status", "stopped");
                call.resolve(result);
            } else {
                JSObject result = new JSObject();
                result.put("status", "not running");
                call.resolve(result);
            }
        } catch (Exception e) {
            call.reject("Failed to stop server: " + e.getMessage());
        }
    }

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value", "");
        JSObject result = new JSObject();
        result.put("value", value);
        call.resolve(result);
    }
}
