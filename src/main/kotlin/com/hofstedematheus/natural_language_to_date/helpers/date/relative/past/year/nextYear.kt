package com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.year

import java.util.*

fun lastYear(text: String): Calendar? {
    return if ("last year".toRegex().containsMatchIn(text))
        Calendar.getInstance().apply {
            add(Calendar.YEAR, -1)
        } else null
}