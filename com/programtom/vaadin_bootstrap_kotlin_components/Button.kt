package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Tag
import com.vaadin.flow.component.button.Button

@Tag("button")
class Button() : Button() {

    constructor(
        text: String = "",
        type: ButtonType = ButtonType.PRIMARY,
    ) : this() {
        this.className = type.className()
        setText(text)
    }
}

enum class ButtonType {
    PRIMARY,
    SECONDARY,
    SUCCESS,
    DANGER,
    WARNING,
    INFO,
    LIGHT,
    DARK,
    LINK;

    fun className() = when (this) {
        PRIMARY -> "btn btn-primary"
        SECONDARY -> "btn btn-secondary"
        SUCCESS -> "btn btn-success"
        DANGER -> "btn btn-danger"
        WARNING -> "btn btn-warning"
        INFO -> "btn btn-info"
        LIGHT -> "btn btn-light"
        DARK -> "btn btn-dark"
        LINK -> "btn btn-link"
    }
}