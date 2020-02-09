package com.github.prkaspars.myday.converter

import com.fasterxml.jackson.databind.ObjectMapper
import io.r2dbc.postgresql.codec.Json
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.WritingConverter

@WritingConverter
class MapToJsonWriteConverter(private val objectMapper: ObjectMapper) : Converter<Map<String, Any>, Json> {

    override fun convert(map: Map<String, Any>): Json {
        return objectMapper.writeValueAsBytes(map).let(Json::of)
    }
}