package cn.gaoyuexiang.demo.config

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.springframework.context.annotation.Bean
import org.testcontainers.containers.PostgreSQLContainer

@TestConfiguration
class ContainersConfig {

  @Bean
  @ServiceConnection
  fun postgres() = PostgreSQLContainer("postgres:latest")
}