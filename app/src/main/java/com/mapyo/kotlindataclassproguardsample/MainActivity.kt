package com.mapyo.kotlindataclassproguardsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("わんこ", 10, "おとなしい性格")
        val cat = Cat("にゃんこ", 13, "名前はまだない")

        Toast.makeText(this, dog.name, Toast.LENGTH_LONG).show()
        Toast.makeText(this, cat.name, Toast.LENGTH_LONG).show()
    }
}
