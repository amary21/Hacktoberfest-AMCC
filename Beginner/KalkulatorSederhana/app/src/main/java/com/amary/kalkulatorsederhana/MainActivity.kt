package com.amary.kalkulatorsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction
import com.amary.kalkulatorsederhana.CalculateActivity.Companion.PARAM_ARG
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener(this)
        btnMinus.setOnClickListener(this)
        btnMultiplied.setOnClickListener(this)
        btnDivided.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = Intent(this, CalculateActivity::class.java)
        when(view.id){
            R.id.btnPlus->{
                intent.putExtra(PARAM_ARG, "plus")
                startActivity(intent)
            }
            R.id.btnMinus->{
                intent.putExtra(PARAM_ARG, "minus")
                startActivity(intent)
            }
            R.id.btnMultiplied->{
                intent.putExtra(PARAM_ARG, "multiplied")
                startActivity(intent)
            }
            R.id.btnDivided->{
                intent.putExtra(PARAM_ARG, "divided")
                startActivity(intent)
            }
        }
    }
}