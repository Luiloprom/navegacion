package es.etg.dam.navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda)

        val boton : Button = findViewById(R.id.btnVolver)

        val extras = intent.extras
        val nombre = extras!!.getString(Constantes.EXTRA_NOMBRE)
        val apellido = extras!!.getString(Constantes.EXTRA_APELLIDO)
        val edad = extras!!.getString(Constantes.EXTRA_EDAD)

        val etNombre: EditText = findViewById(R.id.etNombre2)
        val etApellido: EditText = findViewById(R.id.etApellido2)
        val etEdad: EditText = findViewById(R.id.etEdad2)

        etNombre.setText(nombre)
        etApellido.setText(apellido)
        etEdad.setText(edad)

        boton.setOnClickListener { view ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}