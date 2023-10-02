package com.example.simplelertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            var dialog  = AlertDialog.Builder(this)
            dialog.setTitle(R.string.title)
            dialog.setMessage("Are you sure")

           dialog.setPositiveButton("ok"){ dialog, which ->
               Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show()
           }
        dialog.setNegativeButton("No"){dialog,which ->
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
        }
            dialog.setNeutralButton("cance"){dialog,which ->
                Toast.makeText(this, "cance", Toast.LENGTH_SHORT).show()
                onBackPressed()
            }
            dialog.create()
            dialog.show()
            dialog.setCancelable(false)
        }
    }
}