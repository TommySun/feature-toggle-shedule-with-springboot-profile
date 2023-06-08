package featuretoggle

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class FeatureToggleApplication


fun main(vararg args: String) {
	runApplication<FeatureToggleApplication>(*args)
}

@Component
class FeatureToggleCmdApp (val featureService: FeatureService) : CommandLineRunner {
	override fun run(vararg args: String) {
		println("The test feature is : ${featureService.testFeature}")
	}
}
