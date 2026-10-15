import com.example.tiptime.calculateTip
import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    fun calculateTipTwentyPercent() {
        val amount = 10.00
        val tipPercent = 20.00
        val tip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, tipPercent, false)

        assertEquals(tip, actualTip)
    }

    @Test
    fun calculateTipFifteenPercent() {
        val amount = 10.00
        val tipPercent = 15.00
        val tip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, tipPercent, true)

        assertEquals(tip, actualTip)
    }
}