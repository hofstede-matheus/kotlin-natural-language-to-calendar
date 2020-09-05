package com.hofstedematheus.natural_language_to_date.helpers.date.relative.present

import java.util.*

fun today(text: String): Calendar? {
    return if ("today".toRegex().containsMatchIn(text))
        Calendar.getInstance() else null
}