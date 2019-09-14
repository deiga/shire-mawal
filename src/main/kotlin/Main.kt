package io.deiga

import io.deiga.graph.*

fun createSimplestGraph(): Pair<List<Node>, Set<Edge>> {
  val root = Node(1, "root")
  val leaf = Node(2, "leaf")
  val edge = Edge(1, root, leaf)
  return Pair(listOf(root, leaf), setOf(edge))
}

fun main(args: Array<String>) {
  println(createSimplestGraph())
}
