package com.example.pop_up

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuInflater
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var root : ConstraintLayout
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        root = findViewById(R.id.root)
        button= findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            showPopup()
        }
    }

    fun showPopup() {
        val popup = PopupMenu(this, button)
        menuInflater.inflate(R.menu.menupop,popup.menu)
        popup.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.blue -> {
                    root.setBackgroundColor(Color.BLUE)
                    true
                }
                R.id.red -> {
                    root.setBackgroundColor(Color.RED)
                    true
                }
                R.id.green -> {
                    root.setBackgroundColor(Color.GREEN)
                    true
                }
                else -> true
            }
        }
        popup.show()
    }

}