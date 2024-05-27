package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.Tag

@Tag("label")
class Label(text: String = "", forInput: String? = "") : Component() {

    init {
        element.text = text
        element.style.setBackgroundColor("transparent")
        if (forInput != null) {
            element.setAttribute("for", forInput)
        }
    }
}