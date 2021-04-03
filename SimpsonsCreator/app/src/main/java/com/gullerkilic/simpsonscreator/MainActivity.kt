package com.gullerkilic.simpsonscreator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gullerkilic.simpsonscreator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var name =""
    var age = null
    var job = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun createSimpson(view : View){

        val name = binding.nameText.text.toString()
        var age = binding.ageText.text.toString().toIntOrNull()
        if ( age == null){
          age = 0
        }
        val job = binding.jobText.text.toString()

        val simpsons = Simpsons(name,age,job)

        binding.textView.text = "Name : ${simpsons.name}, Age : ${simpsons.age}, Job : ${simpsons.job}"

    }

}