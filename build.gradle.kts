plugins {
    id("java")
}

group = "com.learn.first"
version = "1.0-SNAPSHOT"

val lwjglVersion = "3.3.6"
val jomlVersion = "1.10.7"
val lwjglNatives = "natives-macos-arm64"
//val lwjglNatives = Pair(
//    System.getProperty("os.name")!!,
//    System.getProperty("os.arch")!!
//).let { (name, arch) ->
//    when {
//        arrayOf("Linux", "SunOS", "Unit").any { name.startsWith(it) } ->
//            if (arrayOf("arm", "aarch64").any { arch.startsWith(it) })
//                "natives-linux${if (arch.contains("64") || arch.startsWith("armv8")) "-arm64" else "-arm32"}"
//            else if (arch.startsWith("ppc"))
//                "natives-linux-ppc64le"
//            else if (arch.startsWith("riscv"))
//                "natives-linux-riscv64"
//            else
//                "natives-linux"
//        arrayOf("Mac OS X", "Darwin").any { name.startsWith(it) }     ->
//            "natives-macos-arm64"
//        arrayOf("Windows").any { name.startsWith(it) }                ->
//            "natives-windows"
//        else                                                                            ->
//            throw Error("Unrecognized or unsupported platform. Please set \"lwjglNatives\" manually")
//    }
//}

repositories {
    mavenCentral()
//    maven("https://repo.clojars.org/")
}

dependencies {
    implementation(platform("org.lwjgl:lwjgl-bom:$lwjglVersion"))

    implementation("org.lwjgl", "lwjgl")
    implementation("org.lwjgl", "lwjgl-assimp")
    implementation("org.lwjgl", "lwjgl-bgfx")
    implementation("org.lwjgl", "lwjgl-glfw")
    implementation("org.lwjgl", "lwjgl-nanovg")
    implementation("org.lwjgl", "lwjgl-nfd")
    implementation("org.lwjgl", "lwjgl-nuklear")
    implementation("org.lwjgl", "lwjgl-openal")
    implementation("org.lwjgl", "lwjgl-opengl")
    implementation("org.lwjgl", "lwjgl-par")
    implementation("org.lwjgl", "lwjgl-stb")
    runtimeOnly("org.lwjgl", "lwjgl", classifier = lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-assimp", classifier = lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-bgfx", classifier = lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-glfw", classifier = lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-nanovg", classifier = lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-nfd", classifier = lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-nuklear", classifier = lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-openal", classifier = lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-opengl", classifier = lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-par", classifier = lwjglNatives)
    runtimeOnly("org.lwjgl", "lwjgl-stb", classifier = lwjglNatives)
    implementation("org.joml", "joml", jomlVersion)
//    implementation("kephale:slick-util:1.0.1")


//    testImplementation(platform("org.junit:junit-bom:5.10.0"))
//    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}