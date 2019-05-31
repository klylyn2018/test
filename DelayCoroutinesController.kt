package com.example.delaycoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DelayCoroutinesController {

    @GetMapping("/delay")
    suspend fun delayRouter(): String? {
            delay(1000)
        return "OK"
    }

    @GetMapping("flow")
    fun delayFlow(): Flow<Int?> = flow()
            .delayFlow(1000)
            .take(5)
            .map{i -> "test $1"}
}