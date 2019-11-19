plugins {
    java
    application
}

application {
    mainClassName = "greeter.Greeter"
}

dependencies {
    implementation(project(":greeting-library"))
}

tasks.distZip {
    from(project(":docs").tasks["asciidoctor"]) { 
        into("${project.name}-$version")
    }
}
tasks.distTar {
    from(project(":docs").tasks["asciidoctor"]) {
        into("${project.name}-$version")
    }
}