package com.github.prkaspars.myday.repository

import com.github.prkaspars.myday.entity.Experiment
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface ExperimentRepository : ReactiveCrudRepository<Experiment, Long>
