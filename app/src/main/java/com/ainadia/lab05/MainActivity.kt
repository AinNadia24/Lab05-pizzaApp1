package com.ainadia.lab05

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ainadia.lab05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_main)

        binding.button.setOnClickListener {
            var pizzaSizePrice = 0.0
            var toppingsPrize = 0.0

            when {

                binding.smallRadioBtn.isChecked -> pizzaSizePrice = 5.0;
                binding.mediumRadioBtn.isChecked -> pizzaSizePrice = 7.0;
                binding.largeRadioBtn.isChecked -> pizzaSizePrice = 10.0;
            }

            if (binding.onionsBox.isChecked) {
                toppingsPrize += 2.0;
            }
            if (binding.oliveBox.isChecked){
                toppingsPrize += 1.0;
            }
            if (binding.tomatoesBox.isChecked){
                toppingsPrize +=3.0;
            }

            binding.totalTextView.text = "Total Price is RM ${pizzaSizePrice + toppingsPrize}"
        }

    }
}