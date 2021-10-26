package com.murallaromana.proyectorecyclesview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.murallaromana.proyectorecyclesview.R
import com.murallaromana.proyectorecyclesview.databinding.ActivityMainBinding
import com.murallaromana.proyectorecyclesview.model.entities.Personaje

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)

       binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val layoutManager=LinearLayoutManager(this)

        val p= Personaje(4,"jonh","nieve","pringao","bastardo","https://thronesapi.com/assets/images/jon-snow.jpg")
        println(p.muestraNombre())
    }
}