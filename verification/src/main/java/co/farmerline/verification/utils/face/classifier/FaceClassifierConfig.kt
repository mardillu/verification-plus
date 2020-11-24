package co.farmerline.verification.utils.face.classifier

import com.google.firebase.ml.custom.FirebaseModelDataType
import co.farmerline.verification.utils.bitmap.ImageType

// TODO : Support Different Image Types and Input Types

interface FaceClassifierConfig {
    val modelPath: String
    val labelsPath: String

    val dataImageType: ImageType
        get() = ImageType.RGB

    val dataInputType: Int
        get() = FirebaseModelDataType.FLOAT32
    val dataOutputType: Int
        get() = FirebaseModelDataType.FLOAT32

    val dataInputShape: IntArray
    val dataOutputShape: IntArray
}