package com.example.lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.lab1.databinding.ActivityMainBinding

class  MainActivity : AppCompatActivity() {
    private lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.button1.setOnClickListener() {

            if (bindingClass.button1.text == "Показать") {
                bindingClass.button1.text = "Скрыть"
                bindingClass.textView1.isVisible = true
            }
            else {
                bindingClass.button1.text = "Показать"
                bindingClass.textView1.isVisible = false
            }
        }
    }
}
