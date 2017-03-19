package nl.dionsegijn.steppertouchdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import nl.dionsegijn.steppertouch.OnStepCallback
import nl.dionsegijn.steppertouch.StepperTouch


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stepperTouch = findViewById(R.id.stepperTouch) as StepperTouch
        stepperTouch.stepper.setMin(0)
        stepperTouch.stepper.setMax(3)
        stepperTouch.stepper.addStepCallback(object : OnStepCallback {
            override fun onStep(value: Int, positive: Boolean) {
                Toast.makeText(applicationContext, value.toString(), Toast.LENGTH_SHORT).show()
            }
        })
    }
}
