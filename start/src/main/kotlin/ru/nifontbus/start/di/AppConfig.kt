package ru.nifontbus.start.di

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.nifontbus.db.MainServiceImpl
import ru.nifontbus.domain.MainService

@Configuration
class AppConfig {

	@Bean
	fun store(): MainService {
		return MainServiceImpl()
	}
}