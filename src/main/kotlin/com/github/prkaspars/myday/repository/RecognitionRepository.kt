package com.github.prkaspars.myday.repository

import com.github.prkaspars.myday.entity.Recognition
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface RecognitionRepository : ReactiveCrudRepository<Recognition, Long>
