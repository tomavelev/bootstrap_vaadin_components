package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.Tag

@Tag("option")
class Option(
    text: String = "",
    value: String = "",
    selected: Boolean = false,
) : Component() {
    init {

        element.text = text
        element.setAttribute("value", value)
        if (selected) {
            element.setAttribute("selected", "selected")
        }
    }
}