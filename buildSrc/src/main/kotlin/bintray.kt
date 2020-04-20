import com.jfrog.bintray.gradle.BintrayExtension
import org.gradle.api.Project
import java.util.*

fun BintrayExtension.configureBintray(project: Project) {
    val props = Properties().apply {
        load(project.rootProject.file("local.properties").inputStream())
    }
    user = props["bintray.user"] as String
    key = props["bintray.key"] as String
    publish = true
    setPublications("kotlinMultiplatform", "metadata", "androidRelease", "jvm", "js")
    pkg = PackageConfig().apply {
        repo = "core"
        name = project.name
        userOrg = "asofttz"
        setLicenses("WTFPL")
        vcsUrl = "https://github.com/andylamax/${project.name}.git"
        version = VersionConfig().apply {
            name = project.version as String
            vcsTag = name
        }
    }
}