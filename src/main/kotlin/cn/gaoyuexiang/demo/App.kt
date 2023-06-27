package cn.gaoyuexiang.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoApplication {
  companion object {
    fun main(args: Array<String>) {
      runApplication<TodoApplication>(*args)
    }
  }
}
