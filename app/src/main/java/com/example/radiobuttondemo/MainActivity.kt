package com.example.radiobuttondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.radiobuttondemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rgroup.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option1 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option2 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option3 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option4 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}