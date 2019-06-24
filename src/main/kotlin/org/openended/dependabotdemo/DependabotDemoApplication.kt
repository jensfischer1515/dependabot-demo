package org.openended.dependabotdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DependabotDemoApplication

fun main(args: Array<String>) {
	runApplication<DependabotDemoApplication>(*args)
}
