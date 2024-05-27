package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.Tag
import com.vaadin.flow.dom.DomEventListener

@Tag("select")
class Select(
    list: List<Option>,
    id: String? = null,
    initialSelectedIndex: Int? = null,
    onChange: ((id: Int) -> Unit)? = null,
) : Component(), HasComponents {
    fun selectedIndex(): Int = selectedIndex

    private var selectedIndex = 0

    init {
        className = "form-select"
        add(list)

        if (id != null) {
            element.setAttribute("id", id)
        }

        if (initialSelectedIndex != null) {
            selectedIndex = initialSelectedIndex
            (element.executeJs(" this.selectedIndex = $0", initialSelectedIndex));
        }

        element.addEventListener("change", DomEventListener {
            (element.executeJs("return this.selectedIndex").then {
                selectedIndex = it.asString().toInt()
                onChange?.let { it1 -> it1(selectedIndex) }
            })
        })

    }
}