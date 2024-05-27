package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.Tag
import com.vaadin.flow.component.html.Anchor
import com.vaadin.flow.component.html.Div

@Tag("nav")
class Nav(title: String = "", titleHref: String = "#") : Component(), HasComponents {
    init {
        className = "navbar shadow-sm"

        add(Div(
            Anchor(titleHref, title).apply {
                className = "navbar-brand "
            }
        ).apply {
            className = "container-fluid"
        })
    }
}