rootProject.name = "cleanArh"

pluginManagement {
	plugins {
		val kotlinVersion: String by settings
		val springBootVersion: String by settings
		val springDependencyVersion: String by settings

		kotlin("jvm") version kotlinVersion apply false
		kotlin("plugin.spring") version kotlinVersion apply false
		id("org.springframework.boot") version springBootVersion apply false
		id("io.spring.dependency-management") version springDependencyVersion apply false
	}
}

include("start")
include("domain")
include("db")
include("rest")
