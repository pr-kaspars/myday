package com.github.prkaspars.myday.entity

import org.springframework.data.annotation.Id

data class Experiment(
        @Id
        val id: Long? = null,
        val things: Map<String, Any>
)
