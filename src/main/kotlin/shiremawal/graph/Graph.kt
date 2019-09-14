package io.deiga.shiremawal.graph

data class Node(val id: Int, val name: String)

data class Edge(val id: Int, val from: Node, val to: Node)
