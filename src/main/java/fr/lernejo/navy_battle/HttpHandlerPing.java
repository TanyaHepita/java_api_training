package fr.lernejo.navy_battle;

import com.sun.net.httpserver.HttpExchange;

import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;


import java.io.OutputStream;

public class HttpHandlerPing implements HttpHandler
{
    private static final int HTTP_OK_STATUS = 200;

    private static final int HTTP_NOT_FOUND_STATUS = 404;

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String body = "body OK";
        exchange.sendResponseHeaders(HTTP_OK_STATUS, body.length());
        try (OutputStream os = exchange.getResponseBody())
        {

            os.write(body.getBytes());

        }

    }

}