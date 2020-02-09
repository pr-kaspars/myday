package com.github.prkaspars.myday.config

import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.github.prkaspars.myday.converter.JsonToMapReadConverter
import com.github.prkaspars.myday.converter.MapToJsonWriteConverter
import io.r2dbc.spi.ConnectionFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.converter.Converter
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.convert.R2dbcCustomConversions

@Configuration
class ReactivePostgresConfig : AbstractR2dbcConfiguration() {
    override fun connectionFactory(): ConnectionFactory {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Bean
    override fun r2dbcCustomConversions(): R2dbcCustomConversions {
        val typeReference = object : TypeReference<Map<String, Any>>() {}
        val objectMapper = ObjectMapper()
        val factory = JsonFactory()
        factory.codec = objectMapper

        val converters = ArrayList<Converter<*, *>>()
        converters.add(JsonToMapReadConverter(factory, typeReference))
        converters.add(MapToJsonWriteConverter(objectMapper))
        return R2dbcCustomConversions(storeConversions, converters);
    }
}