package com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.week

import java.util.*

fun lastWeek(text: String): Calendar? {
    return if ("last week".toRegex().containsMatchIn(text))
        Calendar.getInstance().apply {
            add(Calendar.WEEK_OF_MONTH, -1)
        } else null
}