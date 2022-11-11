package com.example.menu_contextuel

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private val TAG_LOG  = MainActivity2::class.java.simpleName
    private lateinit var email : EditText
    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email =findViewById(R.id.email)
        registerForContextMenu(email)
        button= findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            Log.d(TAG_LOG , "Button clicked!");
            switchActivities()
        }
    }

     fun switchActivities() {
        val intent  = Intent(this, MainActivity2::class.java)
         startActivity(intent)
     }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    )
    {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.contextmenu,menu)
        menu?.setHeaderTitle("ContextMenu")
    }
}