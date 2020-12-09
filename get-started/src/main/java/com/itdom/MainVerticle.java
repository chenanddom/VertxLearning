package com.itdom;

import io.vertx.core.AbstractVerticle;

/**
 * 我们也可以使用Launcher来替代Main类，这也是官方推荐的方式，在pom.xml中加入main.verticle属性，
 * 并将该属性值设置为maven-shade-plugin插件的manifestEntries的Main-Verticle对应的值，
 * 最后修改main.class为io.vertx.core.Launcher
 */
public class MainVerticle extends AbstractVerticle {
    @Override
    public void start() throws Exception {
        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }
}
