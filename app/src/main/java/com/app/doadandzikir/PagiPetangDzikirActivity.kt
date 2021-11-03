package com.app.doadandzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class PagiPetangDzikirActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_pagi_petang_dzikir)

        val cvDzikirPagi: CardView = findViewById(R.id.cv_dzikir_pagi)
        cvDzikirPagi.setOnClickListener(this)
        val btnDzikirPagi: ImageButton = findViewById(R.id.img_btn_dzikir_pagi)
        btnDzikirPagi.setOnClickListener(this)

        val cdDzikirPagi: CardView = findViewById(R.id.cv_dzikir_petang)
        cdDzikirPagi.setOnClickListener(this)
        val btnDzikirPetang: ImageButton = findViewById(R.id.img_btn_dzikir_petang)
        btnDzikirPetang.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){

            //Menjalankan activity dzikir pagi jika user memilih dzikir pagi
            R.id.cv_dzikir_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))
            R.id.img_btn_dzikir_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))

            //Menjalankan activity dzikir petang jika user memilih dzikir petang
            R.id.cv_dzikir_petang -> startActivity(Intent(this, DzikirPetangActivity::class.java))
            R.id.img_btn_dzikir_petang -> startActivity(Intent(this, DzikirPetangActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}