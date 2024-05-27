package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.html.Div

class Row(vararg components: Component) : Div() {
    init {
        components.forEach { add(it) }
    }


    init {
        className = "row"
    }
}