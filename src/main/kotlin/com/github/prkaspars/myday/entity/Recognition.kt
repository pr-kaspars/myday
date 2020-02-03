package com.github.prkaspars.myday.entity

import org.springframework.data.annotation.Id

data class Recognition(
        @Id
        val id: Long? = null,
        val message: String,
        val author: String,
        val recipient: String
)
