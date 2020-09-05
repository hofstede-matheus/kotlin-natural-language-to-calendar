package com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.year

import java.lang.Exception
import java.util.*

fun xYearsAgo(text: String): Calendar? {

    val pattern = "\\w+(?=\\s+years ago)".toRegex()

    try {
        pattern.find(text)?.groups?.first()?.let {
            return Calendar.getInstance().apply {
                add(Calendar.YEAR, - it.value.toInt())
            }
        }
    } catch (e: Exception) {
        return null
    }
    return null
}
