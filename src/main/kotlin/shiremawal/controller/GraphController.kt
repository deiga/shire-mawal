package io.deiga.shiremawal.controller

import io.deiga.shiremawal.graph.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/graphs")
class GraphController {

    private fun createSimplestGraph(): Pair<List<Node>, Set<Edge>> {
      val root = Node(1, "root")
      val leaf = Node(2, "leaf")
      val edge = Edge(1, root, leaf)
      return Pair(listOf(root, leaf), setOf(edge))
    }

    @GetMapping
    fun findAll() = listOf(createSimplestGraph())
}