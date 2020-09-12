package @packageName@

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    val ctx = SpringApplicationBuilder(Application::class.java).run(*args)
}
