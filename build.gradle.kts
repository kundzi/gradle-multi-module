plugins {
    id("org.asciidoctor.convert") version "1.5.6" apply false
}

allprojects {
    repositories {
        jcenter()
    }
}

subprojects {
    version = "0.0.1"
}

configure(subprojects.filter { it.name == "greeter" || it.name == "greeting-library" }) { 

    apply(plugin = "groovy")

    dependencies {
        "testCompile"("org.spockframework:spock-core:1.0-groovy-2.4") {
            exclude(module = "groovy-all")
        }
    }
}