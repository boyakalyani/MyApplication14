package com.example.myapplication

import android.app.AlertDialog
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {


//    private val sharedPrefFile = "kotlinsharedpreference"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//val bt=findViewById<Button>(R.id.btn)
//        bt.setOnClickListener() {
//            val builder=AlertDialog.Builder(this)
//            builder.setTitle(R.string.kalyani)
//            builder.setMessage(R.string.title)
//            builder.setIcon(android.R.drawable.ic_menu_delete)
//            builder.setPositiveButton("yes"){dialogInterface,which->
//                Toast.makeText(this, "click yes", Toast.LENGTH_SHORT).show()
//            }
//            builder.setNegativeButton("no"){
//                    dialogInterface, which ->
//                Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()
//            }
//            val alertDialog:AlertDialog=builder.create()
//            alertDialog.setCancelable(false)
//            alertDialog.show()
//        }
//    }
//}



//        val inputId = findViewById<EditText>(R.id.editId)
//        val inputName = findViewById<EditText>(R.id.editName)
//        val outputId = findViewById<TextView>(R.id.textViewShowId)
//        val outputName = findViewById<TextView>(R.id.textViewShowName)
//
//        val btnSave = findViewById<Button>(R.id.save)
//        val btnView = findViewById<Button>(R.id.view)
//        val btnClear = findViewById<Button>(R.id.clear)
//        val sharedPreferences: SharedPreferences = this.getSharedPreferences(sharedPrefFile,
//            Context.MODE_PRIVATE)
//        btnSave.setOnClickListener(View.OnClickListener {
//            val id:Int = Integer.parseInt(inputId.text.toString())
//            val name:String = inputName.text.toString()
//            val editor:SharedPreferences.Editor =  sharedPreferences.edit()
//            editor.putInt("id_key",id)
//            editor.putString("name_key",name)
//            editor.apply()
//            editor.commit()
//        })
//        btnView.setOnClickListener {
//            val sharedIdValue = sharedPreferences.getInt("id_key",0)
//            val sharedNameValue = sharedPreferences.getString("name_key","defaultname")
//            if(sharedIdValue.equals(0) && sharedNameValue.equals("defaultname")){
//                outputName.setText("default name: ${sharedNameValue}").toString()
//                outputId.setText("default id: ${sharedIdValue.toString()}")
//            }else{
//                outputName.setText(sharedNameValue).toString()
//                outputId.setText(sharedIdValue.toString())
//            }
//
//        }
//        btnClear.setOnClickListener(View.OnClickListener {
//            val editor = sharedPreferences.edit()
//            editor.clear()
//            editor.apply()
//            outputName.setText("").toString()
//            outputId.setText("".toString())
//        })
//    }
//}