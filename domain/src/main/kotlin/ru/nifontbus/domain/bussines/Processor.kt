package ru.nifontbus.domain.bussines

import org.springframework.stereotype.Component
import ru.nifontbus.domain.MainService

@Component
class Processor(
	val mainService: MainService
) {

	fun getData(): String? {
		return "From processor: " + mainService.getProperties()
	}

}