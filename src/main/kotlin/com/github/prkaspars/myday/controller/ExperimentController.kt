package com.github.prkaspars.myday.controller

import com.github.prkaspars.myday.entity.Experiment
import com.github.prkaspars.myday.repository.ExperimentRepository
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/experiments")
class ExperimentController(private val repository: ExperimentRepository) {

    @GetMapping
    fun find(): Flux<Experiment> {
        return repository.findAll()
    }

    @PostMapping
    fun create(@RequestBody data: Map<String, Any>) {
        repository.save(Experiment(null, data)).subscribe()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Mono<Experiment> {
        return repository.findById(id)
    }
}
