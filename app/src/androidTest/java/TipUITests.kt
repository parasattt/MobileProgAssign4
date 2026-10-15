import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.tiptime.TipTimeLayout
import com.example.tiptime.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test
import org.junit.experimental.theories.suppliers.TestedOn

class TipUITests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculateTwentyPercentTip() {
        composeTestRule.setContent {
            TipTimeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    TipTimeLayout()
                }
            }
        }
    }
}