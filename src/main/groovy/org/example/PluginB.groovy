package org.example

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginB implements Plugin<Project> {

    private Project project

    @Override
    void apply(Project project) {
        this.project = project
    }

}