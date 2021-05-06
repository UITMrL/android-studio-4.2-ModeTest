package com.github.uitmrl.androidstudio42modetest.services

import com.github.uitmrl.androidstudio42modetest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
