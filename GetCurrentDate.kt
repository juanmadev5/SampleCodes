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
        return when(calendar.get(Calendar.DAY_OF_WEEK)) {
            1 -> dayOfWeekList[0]
            2 -> dayOfWeekList[1]
            3 -> dayOfWeekList[2]
            4 -> dayOfWeekList[3]
            5 -> dayOfWeekList[4]
            6 -> dayOfWeekList[5]
            7 -> dayOfWeekList[6]
            else -> "error"
        }
    }
    private fun month(): String {
        return when(calendar.get(Calendar.MONTH)) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> "error"
        }
    }
