package com.example.testactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        Log.d("Testing", "Activity2 onCreate")

        buttonAlertDialog.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Alert Dialog")
            builder.setMessage("Это AlertDialog")
            builder.setIcon(R.drawable.ic_launcher_background)
            builder.setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog = builder.create()
            dialog.show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Testing", "Activity2 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Testing", "Activity2 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Testing", "Activity2 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Testing", "Activity2 onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Testing", "Activity2 onDestroy")
    }
}