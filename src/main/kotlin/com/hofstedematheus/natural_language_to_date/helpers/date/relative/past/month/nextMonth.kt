package com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.month

import java.util.*

fun lastMonth(text: String): Calendar? {
    return if ("last month".toRegex().containsMatchIn(text))
        Calendar.getInstance().apply {
            add(Calendar.MONTH, -1)
        } else null
}