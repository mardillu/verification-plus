package co.farmerline.verification.utils.face.classifier.configs

import co.farmerline.verification.utils.face.classifier.FaceClassifierConfig

object OracleFaceClassifierConfig : FaceClassifierConfig {
    override val modelPath: String = "oracle/oracle.tflite"
    override val labelsPath: String = "oracle/oracle.names"

    override val dataInputShape: IntArray = intArrayOf(1, 62, 47, 3)
    override val dataOutputShape: IntArray = intArrayOf(1, 1680)
}