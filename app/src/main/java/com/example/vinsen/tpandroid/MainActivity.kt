package com.example.vinsen.tpandroid

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOk.setOnClickListener {
            var editText = findViewById(R.id.txtNom) as EditText
            val nom = editText.text.toString()
            val intent = Intent(applicationContext,DataActivity::class.java)
            intent.putExtra("nom",nom)
            startActivity(intent)
        }

    }



        /*var editText = findViewById(R.id.txtNom) as EditText
        val intent = Intent(this,DataActivity::class.java)
        val nom = editText.text.toString()
        intent.putExtra("Nom",nom)
        startActivity(intent) */



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
