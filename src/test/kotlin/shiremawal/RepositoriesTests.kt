package io.deiga.shiremawal

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.beans.factory.annotation.Autowired
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.springframework.data.repository.findByIdOrNull


@DataJpaTest
class RepositoriesTests @Autowired constructor(
    val entityManager: TestEntityManager,
    val graphRepository: GraphRepository) {

  @Test
  fun `When findByIdOrNull then return Graph`() {
    val testGraph = Graph.createSimplestGraph()
    entityManager.persist(testGraph.root)
    testGraph.edges.forEach { edge ->
      entityManager.persist(edge.to)
      entityManager.persist(edge.from)
      entityManager.persist(edge)
    }
    entityManager.persist(testGraph)
    entityManager.flush()
    val found = graphRepository.findByIdOrNull(testGraph.id!!)
    assertThat(found).isEqualTo(testGraph)
  }
}