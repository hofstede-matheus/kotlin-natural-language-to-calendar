package com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.year

import java.lang.Exception
import java.util.*

fun nextXYears(text: String): Calendar? {

    val pattern = "(?<=next\\s).*(?=\\ years)".toRegex()

    try {
        pattern.find(text)?.groups?.first()?.let {
            return Calendar.getInstance().apply {
                add(Calendar.YEAR, + it.value.toInt())
            }
        }
    } catch (e: Exception) {
        return null
    }
    return null
}
