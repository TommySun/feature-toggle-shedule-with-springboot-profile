package featuretoggle

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class FeatureService (
    @Value("\${feature-toggles.features.test}")
    val testFeature: String = ""
    )