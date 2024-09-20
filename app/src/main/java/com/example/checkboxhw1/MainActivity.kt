package com.example.checkboxhw1

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.checkboxhw1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.saveButtonBTN.setOnClickListener(::onClick)
        binding.clearButtonBTN.setOnClickListener(::onClick)



    }

    private fun onClick(view: View){
        when(view){
            binding.saveButtonBTN -> {
                binding.textResultTv.text = binding.textInput.text
            }
            binding.clearButtonBTN -> {
                val snackbar = Snackbar.make(
                    view,
                    "Подтвердить удаление?",
                    Snackbar.LENGTH_LONG

                ).setAction("Подтвердить"){

                    binding.textResultTv.text = "Результат"
                    binding.textInput.text.clear()
                    Snackbar.make(
                        view,
                        "Данные удалены",
                        Snackbar.LENGTH_LONG
                    ).show()
                } 
            snackbar.show()
            }

        }
    }
}