package com.example.threadcoroutineproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    val tag = "coroutines"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorldText = findViewById<Button>(R.id.helloworld)
        val btn = findViewById<Button>(R.id.btn)


//        CoroutineScope(Dispatchers.IO).launch {
//            showUsers()
//            showAdmin()
//        }

//        coroutines is work as a asynchronous(means work at one to many at a time)

//        fun coroutinesFun() {
//        coroutines uses as this such type ex  given below

//            CoroutineScope(Dispatchers.IO).launch {
//                Log.d("coroutines"," running on "+Thread.currentThread().name)
//            }
//            CoroutineScope(Dispatchers.Main).launch {
//                Log.d("coroutines"," running on "+Thread.currentThread().name)
//            }
//            CoroutineScope(Dispatchers.Default).launch {
//                Log.d("coroutines"," running on "+Thread.currentThread().name)
//            }
//        }
//


//        thread is work as a synchronous(means work at one to one at a time)

//        helloWorldText.setOnClickListener {
//            thread(start = true) {
//                Log.d("coroutines", "Thread name " + Thread.currentThread().name)
//                for (i in 1..1000000000) {
//                    print(i);
//                }
//            }
//
//        }

        val abhi=Thread.currentThread().name
        thread(start= true){
            Log.d("coroutines","Thread name "+abhi)
        }

    }
    suspend fun showUsers() {
        Log.d(tag, " first work is done ")
        yield()
        Log.d(tag, " second work is done ")
    }

    suspend fun showAdmin() {
        Log.d(tag, " admin work is done ")
        yield()
        Log.d(tag, " second admin work is done ")
    }
}