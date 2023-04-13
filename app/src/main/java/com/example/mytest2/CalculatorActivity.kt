package com.example.mytest2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var mAnswer: TextView
    lateinit var mFnum: EditText
    lateinit var mSnum: EditText
    lateinit var mAdd: Button
    lateinit var mSub: Button
    lateinit var mDiv: Button
    lateinit var mMul: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        mAnswer = findViewById(R.id.mMainText)
        mFnum = findViewById(R.id.mTvfirst)
        mSnum = findViewById(R.id.mTvSecond)
        mAdd = findViewById(R.id.mAdd)
        mSub = findViewById(R.id.mSub)
        mDiv = findViewById(R.id.mDiv)
        mMul = findViewById(R.id.mMult)

        // Set Onclick Listeners
        mAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{//Proceed to compute the number
                var jibu = firstNumber.toDouble()+secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{//Proceed to compute the number
                var jibu = firstNumber.toDouble()-secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{//Proceed to compute the number
                var jibu = firstNumber.toDouble()*secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{//Proceed to compute the number
                var jibu = firstNumber.toDouble()/secondNumber.toDouble()
                //Display the answer on the textview answer
                mAnswer.text = jibu.toString()
            }
        }

    }

}
