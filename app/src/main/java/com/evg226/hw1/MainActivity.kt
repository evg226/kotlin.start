package com.evg226.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.evg226.hw1.R

class MainActivity : AppCompatActivity() {
    private lateinit var helloTextView: TextView
    private var count: Int = 0
    private var myCar: Car? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.helloTextView);
    }

    fun handleClickButton(view: View) {
        count++
        helloTextView.text = "You clicked on Button " + count.toString() + " times"
    }

    fun handleCreateCar(view: View) {
        myCar = Car(1, "Porsche", 380);
        helloTextView.text = "You car is:\n" + myCar.toString();
    }

    fun handleCreateObject(view: View) {
        val modifiedCar = object {
            fun modifyCar(): String {
                return myCar?.copy(power = 600).toString()
            }
        }
        helloTextView.text = "You modified car is:\n" + modifiedCar.modifyCar();
    }

    fun handleTestLoops(view: View) {
        val garage = arrayOf<Car>(
            Car(1, "BMW", 270),
            Car(2, "VW", 190),
            Car(3, "Audi", 260)
        )
        var result = "You array is:"
        for (car: Car in garage)
            result += "\n" + car.toString()
        helloTextView.text=result

    }
}