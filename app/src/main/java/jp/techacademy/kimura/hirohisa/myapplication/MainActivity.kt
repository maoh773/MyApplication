package jp.techacademy.kimura.hirohisa.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var human1 = Human("human 1", 25, "盆栽")
        var human2 = Human("human 2", 55, "掃除")

        human1.say()
        human1.think()

        human2.say()
        human2.think()


    }

}
