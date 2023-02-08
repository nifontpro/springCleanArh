package ru.nifontbus.db

import org.springframework.beans.factory.annotation.Value
import ru.nifontbus.domain.MainService

class MainServiceImpl : MainService {
	@Value("\${value.test}")
	var testString: String? = null

	override fun getProperties(): String? = testString
}