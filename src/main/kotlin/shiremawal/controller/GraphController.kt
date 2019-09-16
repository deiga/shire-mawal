package io.deiga.shiremawal.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import java.util.UUID
import io.deiga.shiremawal.Graph

@RestController
@RequestMapping("/graphs")
class GraphController {

    @GetMapping
    fun findAll() = listOf(Graph.createSimplestGraph())
    
    @GetMapping("/{id}")
    fun findOne(@PathVariable id: String): Graph {
      println(UUID.fromString(id))
      return Graph.createSimplestGraph()
    }
}