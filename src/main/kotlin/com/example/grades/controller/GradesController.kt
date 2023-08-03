package com.example.grades.controller

import com.example.grades.model.Grades
import com.example.grades.service.GradesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/grades")
class GradesController {
    @Autowired
    lateinit var gradesService: GradesService
    @GetMapping
    fun list():List<Grades>{
        return gradesService.list()
    }
}