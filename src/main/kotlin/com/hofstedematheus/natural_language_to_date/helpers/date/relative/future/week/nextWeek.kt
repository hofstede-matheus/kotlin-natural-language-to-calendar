package com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.week

import java.util.*

fun nextWeek(text: String): Calendar? {
    return if ("next week".toRegex().containsMatchIn(text))
        Calendar.getInstance().apply {
            add(Calendar.WEEK_OF_MONTH, +1)
        } else null
}