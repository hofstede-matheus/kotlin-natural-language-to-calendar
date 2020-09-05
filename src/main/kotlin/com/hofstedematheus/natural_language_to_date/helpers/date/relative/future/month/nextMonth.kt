package com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.month

import java.util.*

fun nextMonth(text: String): Calendar? {
    return if ("next month".toRegex().containsMatchIn(text))
        Calendar.getInstance().apply {
            add(Calendar.MONTH, +1)
        } else null
}