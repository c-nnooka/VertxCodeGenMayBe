package com.example.test

import io.vertx.codegen.annotations.Nullable
import io.vertx.core.AsyncResult
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.json.JsonObject

class JobServiceImpl: JobService {
    override fun getCertain(jobId: Int, handler: Handler<AsyncResult<@Nullable Job?>>): JobService {
        handler.handle(Future.succeededFuture(Job(JsonObject())))

        return this;
    }
}