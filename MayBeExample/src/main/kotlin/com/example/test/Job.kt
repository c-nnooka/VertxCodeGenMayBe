package com.example.test

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import io.vertx.codegen.annotations.DataObject
import io.vertx.core.json.JsonObject

@DataObject
@JsonIgnoreProperties(ignoreUnknown = true)
class Job (jsonObject: JsonObject?){


    var i: Int? = null


    fun toJson() = JsonObject.mapFrom(this);

}