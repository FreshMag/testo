import io.github.gciatto.kt.mpp.Plugins
import io.github.gciatto.kt.mpp.helpers.ProjectType
import io.github.gciatto.kt.mpp.utils.log
import io.github.gciatto.kt.mpp.utils.nodeVersion

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.gitSemVer)
    alias(libs.plugins.ktMpp.multiProjectHelper)
}

group = "io.github.freshmag"

gitSemVer {
    excludeLightweightTags()
    assignGitSemanticVersion()
}

log("version: $version", LogLevel.LIFECYCLE)

multiProjectHelper {
    defaultProjectType = ProjectType.KOTLIN // default project type for all projects which are not explicitly marked

    ktProjects = subprojects.toSet()
    jvmProjects = emptySet()
    jsProjects = emptySet()
    otherProjects = emptySet()

    val baseProjectTemplate = buildSet {
        add(Plugins.documentation)
        add(Plugins.linter)
        add(Plugins.bugFinder)
        add(Plugins.versions)
    }

    ktProjectTemplate = buildSet {
        addAll(baseProjectTemplate)
        add(Plugins.multiplatform)
        add(Plugins.npmPublish)
    }

    jvmProjectTemplate = buildSet {
        addAll(baseProjectTemplate)
        add(Plugins.jvmOnly)
    }

    jsProjectTemplate = buildSet {
        addAll(baseProjectTemplate)
        add(Plugins.jsOnly)
    }

    otherProjectTemplate = buildSet {
        add(Plugins.versions)
    }

    applyProjectTemplates()
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

project.findProperty("nodeVersion")?.toString()?.takeIf { it.isNotBlank() }?.let {
    nodeVersion(it)
    log("override NodeJS version: $it", LogLevel.LIFECYCLE)
}