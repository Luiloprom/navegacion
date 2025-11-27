package es.etg.dam.navegacion

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.etg.dam.navegacion.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val persona = recuperarPersona()
        cargarDatos(persona)

    }

    private fun recuperarPersona(): Persona? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(Constantes.EXTRA_PERSONA, Persona::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Persona>(Constantes.EXTRA_PERSONA)
        }
    }

    private fun cargarDatos(persona: Persona?){
        binding.etNombre2.setText(persona?.nombre)
        binding.etApellido2.setText(persona?.apellido)
        binding.etEdad2.setText(persona?.edad.toString())
    }
    fun volver(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}