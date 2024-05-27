package com.programtom.vaadin_bootstrap_kotlin_components

import com.vaadin.flow.component.Component
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.Tag

@Tag("div")
class FloatingSelect(list: List<Option>,
                     label: String,
                     id: String? = null,
                     initialSelectedIndex: Int? = null,
                     onChange: ((id: Int) -> Unit)? = null,
    ) : Component(),
    HasComponents {

    private val select: Select
    fun selectedIndex(): Int = select.selectedIndex()

    init {
        className = "form-floating"

        select = Select(
            list,
            id,
            initialSelectedIndex = initialSelectedIndex,
            onChange = onChange
        )
        select.element.setAttribute("aria-label", label)
        add(select)
        add(
            Label(
                text = label,
                forInput = id,
            )
        )
    }
}