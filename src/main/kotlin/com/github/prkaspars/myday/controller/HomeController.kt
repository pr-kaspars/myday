package com.github.prkaspars.myday.controller

import com.github.prkaspars.myday.entity.Recognition
import com.github.prkaspars.myday.repository.RecognitionRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable

@Controller
class HomeController(private val repository: RecognitionRepository) {

    @GetMapping("/")
    fun index(model: Model): String {
        val recognitions = ReactiveDataDriverContextVariable(repository.findAll())
        model.addAttribute("recognitions", recognitions)
        return "index"
    }

    @GetMapping("/create-recognition")
    fun createRecognition(model: Model): String {
        model.addAttribute("recognition", Recognition(null, "Lorem ipsum", "Kaspars", "Someone"))
        return "create-recognition"
    }

    @PostMapping("/create-recognition")
    fun createRecognitionForm(@ModelAttribute recognition: Recognition): String {
        repository.save(recognition).subscribe()
        return "redirect:/"
    }
}
