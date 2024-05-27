package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.Tag

@Tag("form")
class Form(vararg components: Component) : Component(), HasComponents {
    init {
        components.forEach { add(it) }
    }
}