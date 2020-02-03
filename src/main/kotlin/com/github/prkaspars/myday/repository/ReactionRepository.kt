package com.github.prkaspars.myday.repository

import com.github.prkaspars.myday.entity.Reaction
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface ReactionRepository : ReactiveCrudRepository<Reaction, Long>
