package es.etg.dam.navegacion

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.etg.dam.navegacion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun addExtras(intent: Intent, persona: Persona) {
        intent.putExtra(Constantes.EXTRA_PERSONA, persona)
    }

    fun crearPersona(): Persona{
        val nombre = binding.etNombre.text.toString()
        val apellido = binding.etApellido.text.toString()
        val edad = binding.etEdad.text.toString().toInt()

        return Persona(nombre, apellido, edad)
    }

    fun mostrar(view: View){
        val intent = Intent(this, SegundaActivity::class.java)
        val persona = crearPersona()
        addExtras(intent,persona)
        startActivity(intent)
    }
}