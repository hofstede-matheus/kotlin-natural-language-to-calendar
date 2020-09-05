package com.hofstedematheus.natural_language_to_date.helpers.date

import com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.day.nextXDays
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.day.tomorrow
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.month.nextMonth
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.month.nextXMonths
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.week.nextWeek
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.week.nextXWeeks
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.year.nextXYears
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.future.year.nextYear
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.present.today
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.day.xDaysAgo
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.day.yesterday
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.month.lastMonth
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.month.xMonthsAgo
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.week.lastWeek
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.week.xWeeksAgo
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.year.lastYear
import com.hofstedematheus.natural_language_to_date.helpers.date.relative.past.year.xYearsAgo
import java.util.*
import kotlin.collections.ArrayList

object DateChecker {
    fun check(text: String): ArrayList<Calendar> {
        val dateOccurrences = ArrayList<Calendar>()

        yesterday(text)?.let {
            dateOccurrences.add(it)
        }

        xDaysAgo(text)?.let {
            dateOccurrences.add(it)
        }

        lastWeek(text)?.let {
            dateOccurrences.add(it)
        }

        xWeeksAgo(text)?.let {
            dateOccurrences.add(it)
        }

        lastMonth(text)?.let {
            dateOccurrences.add(it)
        }

        xMonthsAgo(text)?.let {
            dateOccurrences.add(it)
        }

        lastYear(text)?.let {
            dateOccurrences.add(it)
        }

        xYearsAgo(text)?.let {
            dateOccurrences.add(it)
        }

        today(text)?.let {
            dateOccurrences.add(it)
        }

        nextXDays(text)?.let {
            dateOccurrences.add(it)
        }

        tomorrow(text)?.let {
            dateOccurrences.add(it)
        }

        nextXMonths(text)?.let {
            dateOccurrences.add(it)
        }

        nextMonth(text)?.let {
            dateOccurrences.add(it)
        }

        nextXWeeks(text)?.let {
            dateOccurrences.add(it)
        }

        nextWeek(text)?.let {
            dateOccurrences.add(it)
        }

        nextXYears(text)?.let {
            dateOccurrences.add(it)
        }

        nextYear(text)?.let {
            dateOccurrences.add(it)
        }

        return dateOccurrences
    }
}