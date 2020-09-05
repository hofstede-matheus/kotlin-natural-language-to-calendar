package com.hofstedematheus.natural_language_to_date

import com.hofstedematheus.natural_language_to_date.helpers.date.DateChecker
import java.util.*

class NaturalLanguageToDate {
    fun convert(text: String): ArrayList<Calendar> {
        DateChecker.check(text).let {
            return it
        }
    }
}