package cn.gaoyuexiang.demo.todo

import cn.gaoyuexiang.demo.todo.jooq.tables.Todo.TODO
import io.kotest.matchers.shouldBe
import org.jooq.DSLContext
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.testcontainers.junit.jupiter.Testcontainers
import java.util.*

@SpringBootTest
@Testcontainers
class TodoRepositoryTest {

  @Autowired
  lateinit var todoRepository: TodoRepository

  @Autowired
  lateinit var dslContext: DSLContext

  @Test
  fun `should save todo success`() {
    // given
    val todo = Todo(id = UUID.randomUUID(), title = "Save me")
    // when
    todoRepository.save(todo)
    // then
    val todoRecord = dslContext.selectFrom(TODO).where(TODO.ID.eq(todo.id)).fetchOne()!!
    todoRecord.title shouldBe "Save me"
  }
}