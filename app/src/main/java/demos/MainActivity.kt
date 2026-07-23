package demos.android.button.press.and.release.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.MotionEvent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val button by lazy<Button> { findViewById(R.id.button) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnTouchListener { _, event ->
            when (event!!.action) {
                MotionEvent.ACTION_DOWN -> button.text = "Pressing"
                MotionEvent.ACTION_UP -> button.text = "Released"
            }
            true
        }
    }

}
