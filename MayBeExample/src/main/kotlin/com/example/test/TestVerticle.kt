package com.example.test

import io.vertx.reactivex.core.AbstractVerticle

class TestVerticle : AbstractVerticle() {

    override fun start() {


        println("Verticle Started")
    }
}