package com.sais.websocketserver;

import android.util.Log;

public class WebSocketServer {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
