package com.example.appreactive

import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono
import reactor.core.publisher.Mono
import java.time.Duration

@RestController
class AppReactive {

    val client = WebClient.create("http://localhost:8081/delay")

    @GetMapping("/react")
    fun react(): Mono<String> =
        client.get()
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToMono<String>()

}