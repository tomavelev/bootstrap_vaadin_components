package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.Tag

@Tag("textarea")
class TextArea(
    id: String? = null,
    label: String = "",
) : Component(), HasComponents {

    private var internalValue = ""

    fun value(): String = this.internalValue

    fun setCustomValue(initialValue: String) {
        element.executeJs("this.value = $0", initialValue)
        internalValue = initialValue
    }

    init {
        if (id != null) {
            element.setAttribute("id", id)
            element.setAttribute("placeholder", label)
        }
        element.addEventListener("change") {
            (element.executeJs("return this.value").then {
                internalValue = it.asString()
            })
        }
    }

}
