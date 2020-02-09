package com.github.prkaspars.myday.controller

import com.github.prkaspars.myday.entity.Recognition
import com.github.prkaspars.myday.repository.RecognitionRepository
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/recognitions")
class RecognitionController(private val repository: RecognitionRepository) {

    @GetMapping
    fun find(): Flux<Recognition> {
        return repository.findAll()
    }

    @PostMapping
    fun create(@RequestBody body: Recognition) {
        repository.save(body).subscribe()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Mono<Recognition> {
        return repository.findById(id)
    }
}

