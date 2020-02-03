package com.github.prkaspars.myday.controller

import com.github.prkaspars.myday.entity.Reaction
import com.github.prkaspars.myday.repository.ReactionRepository
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono
import java.time.Instant

@RestController
@RequestMapping("/reactions")
class ReactionController(private val repository: ReactionRepository) {

    @PostMapping
    fun create(@RequestBody body: ReactionRequest): Mono<Reaction> {
        println(body)
//        val reaction = body.let { Reaction(0, it.recognitionId, it.author, it.kind, it.message) }
//        return repository.save(reaction)
        return Mono.empty()
    }

    @GetMapping
    fun read(): Flux<Reaction> {
        return repository.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Mono<Reaction> {
        return repository.findById(id)
    }

    @DeleteMapping("/{id}")
    fun remove(@PathVariable id: Long): Mono<Reaction> {
        return repository.findById(id)
    }
}

data class ReactionRequest(
        val recognitionId: Long,
        val author: String,
        val kind: String,
        val message: String
)