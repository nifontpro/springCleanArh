package ru.nifontbus.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nifontbus.domain.bussines.Processor

@RestController
@RequestMapping("api")
class TestController(
	private val processor: Processor
) {

	@GetMapping("test")
	fun test(): String? {
		return processor.getData()
	}

}