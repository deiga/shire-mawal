package io.deiga.shiremawal

import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.OneToMany
import javax.persistence.OneToOne
import javax.persistence.JoinColumn
import javax.persistence.Transient

@Entity
class Graph(
  @OneToOne val root: Node, 
  @Transient val nodes: List<Node>, 
  @OneToMany val edges: List<Edge>,
  @Id @GeneratedValue val id: UUID? = null
) {
  companion object {
    fun createSimplestGraph(): Graph {
      val root = Node( "root")
      val leaf = Node( "leaf")
      val edge = Edge( root, leaf)
      val graph = Graph( root, listOf(root, leaf), listOf(edge))
      return graph
    }
  }
}

@Entity
class Node(
  val name: String? = null,
  @Id @GeneratedValue val id: UUID? = null
)

@Entity
class Edge(
  @OneToOne val from: Node, 
  @OneToOne val to: Node,
  @Id @GeneratedValue val id: UUID? = null
)
