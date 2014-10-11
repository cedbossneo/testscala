import java.text.DateFormat
import java.util.Date
import java.util.Locale

/**
 * Created by cedric on 11/10/14.
 */
object Hi extends App{
  val now = new Date
  val df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE)
  println(df format now)
}
