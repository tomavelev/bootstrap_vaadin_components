package com.programtom.vaadin_bootstrap_kotlin_components


open class Input() : com.vaadin.flow.component.html.Input() {
    fun requestFocus() {
        focus()
    }


    constructor(
        type: String = "text",
        id: String? = null,
        placeholder: String = ""
    ) : this() {
        this.type = type
        this.className = "form-control"
        this.placeholder = placeholder

        if (id != null) {
            this.element.setAttribute("id", id)
        }

    }
}