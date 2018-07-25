package com.example.test

import io.vertx.codegen.annotations.Fluent
import io.vertx.codegen.annotations.Nullable
import io.vertx.codegen.annotations.ProxyGen
import io.vertx.codegen.annotations.VertxGen
import io.vertx.core.AsyncResult
import io.vertx.core.Handler

@ProxyGen
@VertxGen
interface JobService {



    @Fluent
    fun getCertain(jobId: Int, handler: Handler<AsyncResult<@Nullable Job?>>): JobService

}