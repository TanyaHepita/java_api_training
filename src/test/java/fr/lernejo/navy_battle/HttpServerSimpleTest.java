package fr.lernejo.navy_battle;


import com.sun.net.httpserver.HttpExchange;

import com.sun.net.httpserver.HttpHandler;

import com.sun.net.httpserver.HttpServer;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;

import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;

import java.net.InetSocketAddress;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

class HttpServerSimpleTest {


    private HttpServer server;
    @Test
    void ping() throws IOException {    }
}
