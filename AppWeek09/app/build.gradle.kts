plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.appweek09"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.appweek09"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    // ViewBinding Activate
    // 장점
    // 1. 타입 안정성 , 2. Null 안정성(존재하는 view만 보여줌),
    // 3. findViewById 반복 제거 4. 성능 향상
    // 단점
    // 1. 빌드 시간 증가(이후에는 좋아짐), 2. 바이딩 객체 생성 필요,
    // 3. 학습 곡선(배우기 위한 진입 장벽이 높음)
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.4.0")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}