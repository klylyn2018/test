package com.example.delaycoroutines

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DelayCoroutinesApplication

fun main(args: Array<String>) {
	runApplication<DelayCoroutinesApplication>(*args)
}
