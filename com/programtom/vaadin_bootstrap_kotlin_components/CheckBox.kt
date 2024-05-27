package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.html.Div


class CheckBox(id: String, text: String = "", initialValue: Boolean = false) : Div() {

    var input: Input
    fun value(): Boolean {
        return input.value == "on"
    }

    init {
        className = "form-check"

        input = Input(
            id = id,
            type = "checkbox"
        ).apply {
            className = "form-check-input"
        }
        if(initialValue)
        input.element.setAttribute("checked", "checked")

        add(input,
            Label(
                text,
                forInput = id
            ).apply {
                className = "form-check-label"
            }
        )
    }
}