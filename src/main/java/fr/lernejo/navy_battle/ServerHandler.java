package fr.lernejo.navy_battle;


import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

import java.net.InetSocketAddress;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServerSimple 
{
    private final HttpServer server;
    public HttpServerSimple(int port, String handler) throws IOException
    {
        this.server = HttpServer.create(new InetSocketAddress(port), 0);
    
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        this.server.setExecutor(executorService);
        
        this.server.createContext("", new HttpHandlerSimple());
    }

    public void start() 
    {

        this.server.start();
    }
}


