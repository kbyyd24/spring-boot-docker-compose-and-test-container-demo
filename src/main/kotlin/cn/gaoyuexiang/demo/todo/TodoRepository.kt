package cn.gaoyuexiang.demo.todo

import cn.gaoyuexiang.demo.todo.jooq.tables.Todo.TODO
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class TodoRepository(
  private val dslContext: DSLContext
) {
  fun save(todo: Todo) {
    dslContext.newRecord(TODO)
      .apply { this.from(todo) }
      .merge()
  }
}
