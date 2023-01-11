package com.luo.router.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class RouterPlugin implements Plugin<Project>{

    //实现apply方法，注入插件的逻辑
    @Override
    void apply(Project project) {
        println("I am from RouterPlugin. apply from ${project.name}")
        project.getExtensions().create("router", RouterExtension)
        //配置阶段结束
        project.afterEvaluate {
            RouterExtension extension = project["router"]
            println("用户设置的wiki路径为：${extension.wikiDir}")
        }
    }
}