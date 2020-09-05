package com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.day

import java.util.*

fun yesterday(text: String): Calendar? {
    return if ("yesterday".toRegex().containsMatchIn(text))
        Calendar.getInstance().apply {
            add(Calendar.DAY_OF_MONTH, -1)
        } else null
}