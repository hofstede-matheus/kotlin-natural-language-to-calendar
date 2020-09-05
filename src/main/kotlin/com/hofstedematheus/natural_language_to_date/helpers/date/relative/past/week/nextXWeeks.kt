package com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.week

import java.lang.Exception
import java.util.*

fun xWeeksAgo(text: String): Calendar? {

    val pattern = "\\w+(?=\\s+weeks ago)".toRegex()

    try {
        pattern.find(text)?.groups?.first()?.let {
            return Calendar.getInstance().apply {
                add(Calendar.WEEK_OF_MONTH, - it.value.toInt())
            }
        }
    } catch (e: Exception) {
        return null
    }
    return null
}
