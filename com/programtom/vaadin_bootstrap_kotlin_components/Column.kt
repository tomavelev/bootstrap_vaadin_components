package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.html.Div

class Column(
    col: Int = 6,
    vararg components: Component,
) : Div() {
    init {
        components.forEach { add(it) }
        className = "col-$col"
    }
}