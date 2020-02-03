package com.github.prkaspars.myday.controller

import com.github.prkaspars.myday.entity.Recognition
import com.github.prkaspars.myday.repository.RecognitionRepository
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/recognitions")
class RecognitionController(private val repository: RecognitionRepository) {

    @GetMapping("/")
    @Transactional
    fun find(): Flux<Recognition> {
        return repository.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Mono<Recognition> {
        return repository.findById(id)
    }
}
