pluginManagement {

  repositories {
    gradlePluginPortal()
    jcenter()
    maven("https://dl.bintray.com/gradle/gradle-plugins")
  }

}

include(
  ":avro",
  ":common",
  ":processor",
  ":kafka-streams",
  ":connectors:sources:exchanges",
  ":connectors:sources:eth-tokens-list",
  ":connectors:sources:web3"
)
