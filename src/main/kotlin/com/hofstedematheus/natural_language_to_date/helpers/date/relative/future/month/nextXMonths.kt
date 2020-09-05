package com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.month

import java.lang.Exception
import java.util.*

fun nextXMonths(text: String): Calendar? {

    val pattern = "(?<=next\\s).*(?=\\ months)".toRegex()

    try {
        pattern.find(text)?.groups?.first()?.let {
            return Calendar.getInstance().apply {
                add(Calendar.MONTH, + it.value.toInt())
            }
        }
    } catch (e: Exception) {
        return null
    }
    return null
}
