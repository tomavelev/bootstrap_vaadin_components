package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.html.Div

class Card(vararg components: Component) : Div() {

    init {
        className = "card"

        add(Div().apply {
            className = "card-body"
            components.forEach {
                add(it)
            }
        })
    }
}