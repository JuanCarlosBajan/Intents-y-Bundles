package intents.y.Bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resta.*

class RestaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resta)
        var resultado = 0

        Return.setOnClickListener{
            val intent: Intent = Intent()
            intent.putExtra("resultado",resultado.toString())
            setResult(RESULT_OK,intent)
            finish()
        }

        Igual.setOnClickListener{
            val Number1 = findViewById<EditText>(R.id.Number1)
            val Number2 = findViewById<EditText>(R.id.Number2)
            val Respuesta = findViewById<TextView>(R.id.Answer)

            resultado =  (Number1.text.toString()).toInt() - (Number2.text.toString()).toInt()
            Respuesta.text = resultado.toString()
        }

    }
}