package pl.segmar.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firebase : DatabaseReference = FirebaseDatabase.getInstance().getReference()


        val showNewAccLayout = findViewById<Button>(R.id.newaccountbutton)
        showNewAccLayout.setOnClickListener{
            val intent = Intent(this, CreateAccActivity::class.java)
            startActivity(intent)
        }


    }
}