package com.sq.image.shared.runtime

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RuntimeController(val runtimeInfo: RuntimeServerInformation) {

    @GetMapping("/info")
    fun serverInfo(): ServerInfo = runtimeInfo.getServerInfo()

    @GetMapping("/health")
    fun healthInfo(): String = "UP"
}
