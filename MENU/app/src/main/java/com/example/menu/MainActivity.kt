package com.example.menu

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onCreateOptionsMenu(menu: Menu):Boolean {
        menuInflater.inflate(R.menu.actionbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id. menu_search -> {
                Toast.makeText(this, "Menu search sélectionné" , Toast.LENGTH_LONG).show()
                true
            }
            R.id.menu_exit ->
            {
                this@MainActivity.finish()
                exitProcess(0)
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}