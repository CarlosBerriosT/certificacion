package TestInstrumental

import android.widget.Button
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.certificacion.ui.view.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ButtonTest {

    @Rule
    @JvmField
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testButtonClick() {
        val scenario = activityRule.scenario

        scenario.onActivity { activity ->
            val button = activity.findViewById<Button>(activity.resources.getIdentifier("button_send_email", "id", activity.packageName))

            button.performClick()

            // Imprime que el botón fue clickeado
            println("Botón 'Enviar correo' clickeado")
        }
    }
}
