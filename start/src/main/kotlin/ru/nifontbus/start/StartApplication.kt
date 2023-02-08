package ru.nifontbus.start

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["ru.nifontbus"])
class StartApplication

fun main(args: Array<String>) {
	val ctx = runApplication<StartApplication>(*args)

	println(
		"""
		count = ${ctx.beanDefinitionCount}
	""".trimIndent()
	)
}
