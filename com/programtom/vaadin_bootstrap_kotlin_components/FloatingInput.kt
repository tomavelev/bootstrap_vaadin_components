package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.html.Div
import com.vaadin.flow.dom.Style

class FloatingInput(
    id: String,
    type: String = "text",
    label: String = "",
    error: String = "",
    initialValue: String = "",

    ) : Div() {
    val input = Input(
        id = id,
        type = type,
        placeholder = label,
    )

    init {
        input.value = initialValue
        className = "mt-2 mb-4 form-floating"
        add(
            input,
            Label(
                text = label,
                forInput = id
            )
        )
        if (error.isNotEmpty()) {
            addError(error)
        }
    }

    private fun addError(error: String) {
        add(Div(error).apply {
            className = "invalid-feedback"
            style.setDisplay(Style.Display.BLOCK)
        })
        input.requestFocus()
        input.addValueChangeListener {
            clearError()
            it.unregisterListener()
        }
    }


    fun value(): String = this.input.value
    fun error(s: String) {
        clearError()
        addError(s)
    }

    private fun clearError() {
        element.children.forEach {
            if (it.classList.contains("invalid-feedback")) {
                it.removeFromParent()
            }
        }
    }
}