package se.ntz.re.appddebug

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(android.R.layout.activity_list_item) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "Hello world", Toast.LENGTH_LONG).show()
    }
}
