package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.Tag
import com.vaadin.flow.component.html.Div
import com.vaadin.flow.dom.Style

@Tag("div")
class FloatingTextArea(
    label: String = "",
    id: String? = null,
    initialValue: String = "",
) : Component(), HasComponents {

    var textArea: TextArea = TextArea(
        id = id,
        label = label
    )

    fun minTextAreaHeight(minHeight: String) {
        textArea.element.style.setMinHeight(minHeight)
    }

    fun value(): String = this.textArea.value()

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

    private fun addError(error: String) {
        add(Div(error).apply {
            className = "invalid-feedback"
            style.setDisplay(Style.Display.BLOCK)
        })
    }


    init {
        textArea.setCustomValue(initialValue)
        textArea.apply {
            className = "form-control"
        }
        add(textArea)
        add(
            Label(
                forInput = id,
                text = label
            )
        )
        className = "form-floating"
    }
}