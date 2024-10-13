package com.example.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Toast.makeText(this,"onCreate Called",Toast.LENGTH_SHORT).show()
        Log.d("TAG","onCreate: Activity")

        //add FirstFragment when activity is created
        if (savedInstanceState == null){

            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, FirstFragment(), "firstFragment")
                .commit()

        }



    }


    override fun onStart() {
        super.onStart()
        //Toast.makeText(this,"onStart Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","A onStart Called")
    }

    override fun onResume() {
        super.onResume()
        //Toast.makeText(this,"onResume Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA"," A onResume Called")
    }

    override fun onPause() {
        super.onPause()
        //Toast.makeText(this,"onPause Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","A onPause Called")
    }

    override fun onStop() {
        super.onStop()
        //Toast.makeText(this,"onStop Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","A onStop Called")
    }

    override fun onRestart() {
        super.onRestart()
        //Toast.makeText(this,"onRestart Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","A onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        //Toast.makeText(this,"onDestroy Called",Toast.LENGTH_SHORT).show()
        Log.d("ActivityA","A onDestroy Called")


    }
}