package com.example.pomodorotimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView

private const val WORK_TIME_IN_MILLIS = 1500000
private const val BREAK_TIME_IN_MILLIS = 300000

private var timerRunning : Boolean = false
private var timeLeft = 0

class MainActivity : AppCompatActivity() {

    private lateinit var tvTimer: TextView
    private lateinit var startPauseButton: Button
    private lateinit var resetButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTimer = findViewById(R.id.tvTimer)
        startPauseButton = findViewById(R.id.startPauseButton)
        resetButton = findViewById(R.id.resetButton)

        startPauseButton.setOnClickListener {
            if (timerRunning) {
                pauseTimer()
            }
            else {
                startTimer()
            }
        }

        resetButton.setOnClickListener {
            resetTimer()
        }
    }

    private fun resetTimer() {
        TODO("Not yet implemented")
    }

    private fun startTimer() {
        var timer = object: CountDownTimer(WORK_TIME_IN_MILLIS.toLong(), 1000) {
            override fun onTick(p0: Long) {
                timeLeft -= 1000
                tvTimer.setText(timeLeft)
            }

            override fun onFinish() {
                TODO("Not yet implemented")
            }

        }

    }

    private fun pauseTimer() {
        TODO("Not yet implemented")
    }
}