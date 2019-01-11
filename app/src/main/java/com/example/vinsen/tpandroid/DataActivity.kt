package com.example.vinsen.tpandroid


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.vinsen.tpandroid.fragment.DataFragment
import com.marcoscg.materialtoast.MaterialToast


class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        // Verifie si une valeur est bien envoyé
        if (intent.hasExtra("nom")) {
            var nom = intent.getStringExtra("nom")
            MaterialToast.makeText(this, "Bonjour "+nom, R.mipmap.ic_launcher, Toast.LENGTH_SHORT).show();
            //Toast.makeText(this,"Bonjour "+nom,Toast.LENGTH_SHORT).show()
        }
    }


    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .commit()
    }


    fun menuClick(view: View){
        when (view.id){
            R.id.btnAfficher -> replaceFragment(DataFragment())
        }
    }
}
