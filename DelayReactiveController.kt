package com.example.delayreactive

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

@RestController
class DelayReactiveController {

    @GetMapping("/delay")
    fun delay(): Mono<String> =
            Mono.just("OK")
                    .delayElement(Duration.ofMillis(1000));

    @GetMapping("/flow")
    fun delayFlow (): Flux<Int> =
            Flux.range(0,10).delayElements(Duration.ofSeconds(1)).
}