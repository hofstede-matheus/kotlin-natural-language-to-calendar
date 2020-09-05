package com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.day

import java.lang.Exception
import java.util.*

fun xDaysAgo(text: String): Calendar? {

    val pattern = "\\w+(?=\\s+days ago)".toRegex()

    try {
        pattern.find(text)?.groups?.first()?.let {
            return Calendar.getInstance().apply {
                add(Calendar.DAY_OF_MONTH, - it.value.toInt())
            }
        }
    } catch (e: Exception) {
        return null
    }
    return null
}
