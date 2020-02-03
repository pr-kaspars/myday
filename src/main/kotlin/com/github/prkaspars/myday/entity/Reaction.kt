package com.github.prkaspars.myday.entity

import org.springframework.data.annotation.Id

data class Reaction(
        @Id
        val id: Long = 0,
        val recognitionId: Long,
        val author: String,
        val kind: String,
        val message: String
)
