package com.amary.kalkulatorsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calculate.*

class CalculateActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)

        btnResult.setOnClickListener(this)
    }

    companion object{
        const val PARAM_ARG = "params_args"
    }

    override fun onClick(view: View) {
        if (view.id == R.id.btnResult){
            val firstInput = etFirstInput.text.toString().toInt()
            val secondInput = etSecondInput.text.toString().toInt()
            when (intent.getStringExtra(PARAM_ARG)) {
                "plus" -> {
                    val result = firstInput + secondInput
                    tvResult.text = result.toString()
                }
                "minus" -> {
                    val result = firstInput - secondInput
                    tvResult.text = result.toString()
                }
                "multiplied" -> {
                    val result = firstInput * secondInput
                    tvResult.text = result.toString()
                }
                "divided" -> {
                    val result = firstInput / secondInput
                    tvResult.text = result.toString()
                }
            }
        }
    }
}