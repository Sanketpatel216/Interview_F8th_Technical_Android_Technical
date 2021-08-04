package com.example.visibalityapp

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
       // setContentView(R.layout.activity_main)

    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

        counter++
        if(keyCode == KeyEvent.KEYCODE_VOLUME_DOWN)
        {
            if(counter == 3)
            {
               
                setContentView(R.layout.activity_main);
               //setContentView(R.layout.activity_main.)
               // View.setvisibility(view.invisible);
                //if(visibility == visible)
                //{
                   //visibility("invisible)
                    //counter = 0
                //}
                // else if(visibility == invisible)
                {
                    //visibility("visible");
                    //counter = 0;
                }
                Toast.makeText(this,"Volume Down pressed 3 times", Toast.LENGTH_SHORT).show()


            }
        }
        return true
    }
}