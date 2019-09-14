plugins {
  application
  kotlin("jvm") version "1.3.50"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib-jdk8"))
}

application {
  mainClassName = "io.deiga.MainKt"
}
