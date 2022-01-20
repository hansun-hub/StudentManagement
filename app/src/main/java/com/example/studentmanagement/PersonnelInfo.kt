package com.example.studentmanagement

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PersonnelInfo : AppCompatActivity() {

    lateinit var dbManager: DBManager
    lateinit var sqlitedb: SQLiteDatabase

    lateinit var tvName:TextView
    lateinit var tvGender: TextView
    lateinit var tvAge:TextView
    lateinit var tvTel:TextView

    lateinit var str_name:String
    lateinit var str_gender: String
    var age: Int = 0
    lateinit var str_tel: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personnel_info)

        tvName = findViewById(R.id.edtName)
        tvAge = findViewById(R.id.edtAge)
        tvGender = findViewById(R.id.gender)
        tvTel = findViewById(R.id.edtTel)

        val intent = intent
        str_name = intent.getStringExtra("intent_name").toString()

        dbManager 
    }

}