package com.example.test;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0018\u00010\b\u00a2\u0006\u0002\b\t0\u00070\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/test/JobService;", "", "getCertain", "jobId", "", "handler", "Lio/vertx/core/Handler;", "Lio/vertx/core/AsyncResult;", "Lcom/example/test/Job;", "Lio/vertx/codegen/annotations/Nullable;", "maybe"})
@io.vertx.codegen.annotations.VertxGen()
@io.vertx.codegen.annotations.ProxyGen()
public abstract interface JobService {
    
    @org.jetbrains.annotations.NotNull()
    @io.vertx.codegen.annotations.Fluent()
    public abstract com.example.test.JobService getCertain(int jobId, @org.jetbrains.annotations.NotNull()
    io.vertx.core.Handler<io.vertx.core.AsyncResult<com.example.test.Job>> handler);
}