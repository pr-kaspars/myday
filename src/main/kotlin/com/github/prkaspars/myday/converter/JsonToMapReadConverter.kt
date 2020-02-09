package com.github.prkaspars.myday.converter

import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.core.type.TypeReference
import io.r2dbc.postgresql.codec.Json
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter
import java.io.InputStream

@ReadingConverter
class JsonToMapReadConverter(private val jsonFactory: JsonFactory, private val typeReference: TypeReference<Map<String, Any>>) : Converter<Json, Map<String, Any>> {

    override fun convert(json: Json): Map<String, Any> {
        return json.mapInputStream(::doStuff) ?: emptyMap()
    }

    private fun doStuff(inputStream: InputStream): Map<String, Any> {
        return jsonFactory.createParser(inputStream).readValueAs(typeReference)
    }
}