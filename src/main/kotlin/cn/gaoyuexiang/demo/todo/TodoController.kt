package cn.gaoyuexiang.demo.todo

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class TodoController(private val todoRepository: TodoRepository) {

  @PostMapping("/todos")
  fun createTodo(@RequestBody request: TodoRequest) {
    val todo = Todo(
      id = UUID.randomUUID(),
      title = request.title
    )
    todoRepository.save(todo)
  }
}

data class TodoRequest(val title: String)

data class Todo(val id: UUID, val title: String)
