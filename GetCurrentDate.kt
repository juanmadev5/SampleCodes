

import java.time.LocalDateTime
import java.util.*


    /*in an xml app you need to initialize main() in onCreate*/

    private val calendar = Calendar.getInstance()

    //to get current year
    /*val year = calendar.get(Calendar.YEAR)*/

    //to get current day
    private val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)

    private fun main() {

        date()
        month()
        val datetext = findViewById<TextView>(R.id.dateText)
        val dayOfWeek = date()
        val monthOfYear = month()

        //to show current hour in a TextView
        LocalDateTime.now() to findViewById<View>(R.id.clockText)
        //in format: Sat, December 24 *of 2022*
        datetext.text = "$dayOfWeek, $monthOfYear $dayOfMonth" /*of $year"*/

    }
    private fun date(): String {
        val dayOfWeekList = listOf(
            "Sun",
            "Mon",
            "Tue",
            "Wed",
            "Thu",
            "Fri",
            "Sat"
        )
        when(calendar.get(Calendar.DAY_OF_WEEK)) {
            1 -> {
                return dayOfWeekList[0]
            }
            2 -> {
                return dayOfWeekList[1]
            }
            3 -> {
                return dayOfWeekList[2]
            }
            4 -> {
                return dayOfWeekList[3]
            }
            5 -> {
                return dayOfWeekList[4]
            }
            6 -> {
                return dayOfWeekList[5]
            }
            7 -> {
                return dayOfWeekList[6]
            }
            else -> {
                return "error"
            }
        }
    }
    private fun month(): String {
        when(calendar.get(Calendar.MONTH)) {
            1 -> {
                return "January"
            }
            2 -> {
                return "February"
            }
            3 -> {
                return "March"
            }
            4 -> {
                return "April"
            }
            5 -> {
                return "May"
            }
            6 -> {
                return "June"
            }
            7 -> {
                return "July"
            }
            8 -> {
                return "August"
            }
            9 -> {
                return "September"
            }
            10 -> {
                return "October"
            }
            11 -> {
                return "November"
            }
            12 -> {
                return "December"
            }
            else -> {
                return "error"
            }
        }
    }