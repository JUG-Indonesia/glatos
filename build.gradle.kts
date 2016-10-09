buildscript {

    repositories {
        gradleScriptKotlin()
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin"))
    }
}

apply {
    plugin("kotlin")
    plugin<ApplicationPlugin>()
}

configure<ApplicationPluginConvention> {
    mainClassName = "com.glatos.HelloWorldKt"
}

repositories {
    gradleScriptKotlin()
}

dependencies {
    compile(kotlinModule("stdlib"))
}
