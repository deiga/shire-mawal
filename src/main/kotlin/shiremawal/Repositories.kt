package io.deiga.shiremawal

import java.util.UUID
import org.springframework.data.repository.CrudRepository

interface GraphRepository : CrudRepository<Graph, UUID> {
}