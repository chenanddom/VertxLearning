package com.itdom;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class MyFirstVerticle extends AbstractVerticle {
    public void start(){
        vertx.createHttpServer().requestHandler(req->{
            req.response()
                    .putHeader("Content-type","text/plain")
                    .end("Hello World!");

        }).listen(8089);
    }
}
