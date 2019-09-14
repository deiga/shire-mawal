package io.deiga.shiremawal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.Banner


@SpringBootApplication
class ShireMawalApplication

fun main(args: Array<String>) {
  runApplication<ShireMawalApplication>(*args) {
    setBannerMode(Banner.Mode.OFF)
  }
}
