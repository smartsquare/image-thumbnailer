package com.sq.image

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.nio.file.Files
import java.nio.file.Paths

@SpringBootApplication
class GalleryApp

fun main(args: Array<String>) {
    SpringApplication.run(GalleryApp::class.java, *args)
}
