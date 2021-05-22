package intents.y.Bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        suma.setOnClickListener{
            val intent: Intent = Intent(this,SumaActivity:: class.java)
            startActivityForResult(intent,1)
        }
        resta.setOnClickListener{
            val intent: Intent = Intent(this,RestaActivity:: class.java)
            startActivityForResult(intent,1)
        }
        multiplicacion.setOnClickListener{
            val intent: Intent = Intent(this,MultiplicacionActivity:: class.java)
            startActivityForResult(intent,1)
        }
        division.setOnClickListener{
            val intent: Intent = Intent(this,DivisionActivity:: class.java)
            startActivityForResult(intent,1)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var respuesta = ""
        if(resultCode == RESULT_OK){
            if (requestCode == 1){
                val bundle = data?.extras
                if (bundle !=null){
                    respuesta = bundle.getString("resultado").toString()
                }
            }
        }
        val resultado = findViewById<TextView>(R.id.answer)
        resultado.text = respuesta
        Toast.makeText(this,respuesta,Toast.LENGTH_SHORT).show()
    }
}