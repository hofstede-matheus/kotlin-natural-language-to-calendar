package com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.day

import java.util.*

fun tomorrow(text: String): Calendar? {
    return if ("tomorrow".toRegex().containsMatchIn(text))
        Calendar.getInstance().apply {
            add(Calendar.DAY_OF_MONTH, +1)
        } else null
}