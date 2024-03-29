package com.example.places.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.places.R
import com.example.places.ui.fragment.BaseFragment

class MainActivity : AppCompatActivity() {

    private val fragment = BaseFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        addFragment(fragment)
        showMapsActivity()
    }

    private fun addFragment(fragment: Fragment){
        val manager = supportFragmentManager.beginTransaction()
        manager.add(R.id.activity_container, fragment)
        manager.commit()
    }

    private fun showMapsActivity(){
        val intent = Intent(baseContext, MapsActivity::class.java)
        startActivity(intent)
    }

}
