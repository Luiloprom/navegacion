package es.etg.dam.navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var etNombre: EditText
    private lateinit var etApellido: EditText
    private lateinit var etEdad: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val boton : Button = findViewById(R.id.btnMostrar)

        etNombre = findViewById<EditText>(R.id.etNombre)
        etApellido = findViewById<EditText>(R.id.etApellido)
        etEdad = findViewById<EditText>(R.id.etEdad)

        boton.setOnClickListener { view ->
            val intent = Intent(this, SegundaActivity::class.java)
            addExtras(intent)
            startActivity(intent)
        }
    }
    fun addExtras(intent: Intent) {
        intent.putExtra(Constantes.EXTRA_NOMBRE, etNombre.text.toString())
        intent.putExtra(Constantes.EXTRA_APELLIDO, etApellido.text.toString())
        intent.putExtra(Constantes.EXTRA_EDAD, etEdad.text.toString())
    }
}