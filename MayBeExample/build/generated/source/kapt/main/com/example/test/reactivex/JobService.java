/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.example.test.reactivex;

import java.util.Map;
import io.reactivex.Observable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import com.example.test.Job;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;


@io.vertx.lang.reactivex.RxGen(com.example.test.JobService.class)
public class JobService {

  @Override
  public String toString() {
    return delegate.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobService that = (JobService) o;
    return delegate.equals(that.delegate);
  }
  
  @Override
  public int hashCode() {
    return delegate.hashCode();
  }

  public static final io.vertx.lang.reactivex.TypeArg<JobService> __TYPE_ARG = new io.vertx.lang.reactivex.TypeArg<>(
    obj -> new JobService((com.example.test.JobService) obj),
    JobService::getDelegate
  );

  private final com.example.test.JobService delegate;
  
  public JobService(com.example.test.JobService delegate) {
    this.delegate = delegate;
  }

  public com.example.test.JobService getDelegate() {
    return delegate;
  }

  public JobService getCertain(int jobId, Handler<AsyncResult<Job>> handler) { 
    delegate.getCertain(jobId, handler);
    return this;
  }

  public Single<Job> rxGetCertain(int jobId) { 
    return new io.vertx.reactivex.core.impl.AsyncResultSingle<Job>(handler -> {
      getCertain(jobId, handler);
    });
  }


  public static  JobService newInstance(com.example.test.JobService arg) {
    return arg != null ? new JobService(arg) : null;
  }
}
