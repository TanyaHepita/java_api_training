package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServerSimple {

    private final HttpServer server;

    public HttpServerSimple(int port, String url) throws IOException, InterruptedException {
        this.server = HttpServer.create(new InetSocketAddress(port), 0);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        this.server.setExecutor(executorService);
        ManageBattle manageBattle = new ManageBattle();
        Cell cell = new Cell();
        if (!url.equals("")) {
            HttpClientSimple client = new HttpClientSimple(port);
            client.SendPost(url);
            manageBattle.addClient(port, url, manageBattle);}
        else {
            this.server.createContext("/api/game/start", new HttpHandlerPost(port, cell, manageBattle));}
        this.server.createContext("/ping", new HttpHandlerPing());
        this.server.createContext("/api/game/fire", new HttpHandlerGet(port, cell, manageBattle));}
    public void start() {
        this.server.start();
    }
}
