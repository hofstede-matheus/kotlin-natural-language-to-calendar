import com.hofstedematheus.natural_language_to_date.NaturalLanguageToDate
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

object NaturalLanguageToDateTestSpec: Spek({
    describe("Date only strings") {

        val dateFormat = SimpleDateFormat("dd-MM-yyyy hh:mm")

        it("contains 'yesterday'") {
            val yesterday = Calendar.getInstance().apply {
                add(Calendar.DAY_OF_MONTH, -1)
            }

            assertEquals(
                dateFormat.format(yesterday.time),
                dateFormat.format(NaturalLanguageToDate().convert("It was yesterday")[0].time)
            )
        }

        it("contains 'x days ago'") {
            val days = (1..100).random()

            val xDaysAgo = Calendar.getInstance().apply {
                add(Calendar.DAY_OF_MONTH, -days)
            }
            assertEquals(
                dateFormat.format(xDaysAgo.time),
                dateFormat.format(NaturalLanguageToDate().convert("It was $days days ago")[0].time)
            )
        }

        it("contains 'last week'") {
            val lastWeek = Calendar.getInstance().apply {
                add(Calendar.WEEK_OF_MONTH, -1)
            }

            assertEquals(
                dateFormat.format(lastWeek.time),
                dateFormat.format(NaturalLanguageToDate().convert("It was last week")[0].time)
            )
        }

        it("contains 'x weeks ago'") {
            val weeks = (1..100).random()

            val xWeeksAgo = Calendar.getInstance().apply {
                add(Calendar.WEEK_OF_MONTH, -weeks)
            }
            assertEquals(
                dateFormat.format(xWeeksAgo.time),
                dateFormat.format(NaturalLanguageToDate().convert("It was $weeks weeks ago")[0].time)
            )
        }

        it("contains 'last month'") {
            val lastMonth = Calendar.getInstance().apply {
                add(Calendar.MONTH, -1)
            }

            assertEquals(
                dateFormat.format(lastMonth.time),
                dateFormat.format(NaturalLanguageToDate().convert("It was last month")[0].time)
            )
        }

        it("contains 'x months ago'") {
            val months = (1..100).random()

            val xMonthsAgo = Calendar.getInstance().apply {
                add(Calendar.MONTH, -months)
            }
            assertEquals(
                dateFormat.format(xMonthsAgo.time),
                dateFormat.format(NaturalLanguageToDate().convert("It was $months months ago")[0].time)
            )
        }

        it("contains 'last year'") {
            val lastYear = Calendar.getInstance().apply {
                add(Calendar.YEAR, -1)
            }

            assertEquals(
                dateFormat.format(lastYear.time),
                dateFormat.format(NaturalLanguageToDate().convert("It was last year")[0].time)
            )
        }

        it("contains 'x years ago'") {
            val years = (1..100).random()

            val xYearsAgo = Calendar.getInstance().apply {
                add(Calendar.YEAR, -years)
            }

            assertEquals(
                dateFormat.format(xYearsAgo.time),
                dateFormat.format(NaturalLanguageToDate().convert("It was $years years ago")[0].time)
            )
        }

        it("contains 'today'") {
            val now = Calendar.getInstance()

            assertEquals(
                dateFormat.format(now.time),
                dateFormat.format(NaturalLanguageToDate().convert("It it today")[0].time)
            )
        }

        it("contains 'next x days'") {
            val days = (1..100).random()

            val nextXDays = Calendar.getInstance().apply {
                add(Calendar.DAY_OF_MONTH, +days)
            }

            assertEquals(
                dateFormat.format(nextXDays.time),
                dateFormat.format(NaturalLanguageToDate().convert("It'm going in the next $days days")[0].time)
            )
        }

        it("contains 'tomorrow'") {
            val tomorrow = Calendar.getInstance().apply {
                add(Calendar.DAY_OF_MONTH, +1)
            }

            assertEquals(
                dateFormat.format(tomorrow.time),
                dateFormat.format(NaturalLanguageToDate().convert("It it tomorrow")[0].time)
            )
        }

        it("contains 'next x months'") {
            val months = (1..100).random()

            val nextXMonths = Calendar.getInstance().apply {
                add(Calendar.MONTH, +months)
            }

            assertEquals(
                dateFormat.format(nextXMonths.time),
                dateFormat.format(NaturalLanguageToDate().convert("It'm going in the next $months months")[0].time)
            )
        }

        it("contains 'next month'") {
            val nextMonth = Calendar.getInstance().apply {
                add(Calendar.MONTH, +1)
            }

            assertEquals(
                dateFormat.format(nextMonth.time),
                dateFormat.format(NaturalLanguageToDate().convert("It it next month")[0].time)
            )
        }

        it("contains 'next x weeks'") {
            val weeks = (1..100).random()

            val nextXWeeks = Calendar.getInstance().apply {
                add(Calendar.WEEK_OF_MONTH, +weeks)
            }

            assertEquals(
                dateFormat.format(nextXWeeks.time),
                dateFormat.format(NaturalLanguageToDate().convert("It'm going in the next $weeks weeks")[0].time)
            )
        }

        it("contains 'next week'") {
            val nextWeek = Calendar.getInstance().apply {
                add(Calendar.WEEK_OF_MONTH, +1)
            }

            assertEquals(
                dateFormat.format(nextWeek.time),
                dateFormat.format(NaturalLanguageToDate().convert("It it next week")[0].time)
            )
        }

        it("contains 'next x years'") {
            val years = (1..100).random()

            val nextXYears = Calendar.getInstance().apply {
                add(Calendar.YEAR, +years)
            }

            assertEquals(
                dateFormat.format(nextXYears.time),
                dateFormat.format(NaturalLanguageToDate().convert("It'm going in the next $years years")[0].time)
            )
        }

        it("contains 'next year'") {
            val nextYear = Calendar.getInstance().apply {
                add(Calendar.YEAR, +1)
            }

            assertEquals(
                dateFormat.format(nextYear.time),
                dateFormat.format(NaturalLanguageToDate().convert("It it next year")[0].time)
            )
        }









        it("word days ago") {
            assertEquals(
                0,
                NaturalLanguageToDate().convert("It was WORD days ago").size
            )
        }




        it("example") {
            val now = Calendar.getInstance()

            println("Now: " + dateFormat.format(now.time))

            val example1 = NaturalLanguageToDate().convert("Remind to go shopping next week")
            println("Remind to go shopping next week " + dateFormat.format(example1[0].time))

            val example2 = NaturalLanguageToDate().convert("It rained a lot yesterday")
            println("It rained a lot yesterday " + dateFormat.format(example2[0].time))

            val example3 = NaturalLanguageToDate().convert("I'm finishing the college in the next 2 years")
            println("I'm finishing the college in the next two years " + dateFormat.format(example3[0].time))
        }

    }
})