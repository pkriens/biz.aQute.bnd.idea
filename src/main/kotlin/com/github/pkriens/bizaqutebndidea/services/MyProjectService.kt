package com.github.pkriens.bizaqutebndidea.services

import com.intellij.openapi.project.Project
import com.github.pkriens.bizaqutebndidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
