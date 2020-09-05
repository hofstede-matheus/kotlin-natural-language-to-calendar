package com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.year

import java.util.*

fun nextYear(text: String): Calendar? {
    return if ("next year".toRegex().containsMatchIn(text))
        Calendar.getInstance().apply {
            add(Calendar.YEAR, +1)
        } else null
}