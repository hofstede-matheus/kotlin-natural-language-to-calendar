package com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.month

import java.lang.Exception
import java.util.*

fun xMonthsAgo(text: String): Calendar? {

    val pattern = "\\w+(?=\\s+months ago)".toRegex()

    try {
        pattern.find(text)?.groups?.first()?.let {
            return Calendar.getInstance().apply {
                add(Calendar.MONTH, - it.value.toInt())
            }
        }
    } catch (e: Exception) {
        return null
    }
    return null
}
