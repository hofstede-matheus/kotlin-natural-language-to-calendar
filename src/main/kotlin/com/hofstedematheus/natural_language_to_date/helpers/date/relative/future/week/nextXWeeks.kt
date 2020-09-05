package com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.week

import java.lang.Exception
import java.util.*

fun nextXWeeks(text: String): Calendar? {

    val pattern = "(?<=next\\s).*(?=\\ weeks)".toRegex()

    try {
        pattern.find(text)?.groups?.first()?.let {
            return Calendar.getInstance().apply {
                add(Calendar.WEEK_OF_MONTH, + it.value.toInt())
            }
        }
    } catch (e: Exception) {
        return null
    }
    return null
}
