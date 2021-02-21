package com.github.ravaelamanov.myplugin.services

import com.github.ravaelamanov.myplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
