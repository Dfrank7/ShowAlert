package com.example.librarytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sweetalert.OnClickListener
import com.example.sweetalert.ShowAlert

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dialog = ShowAlert()
        dialog.showSuccessAlert(this, "Success", "jelel", object: OnClickListener{
            override fun setCancelButton(view: View) {
                TODO("Not yet implemented")
            }

            override fun setOkayButton(view: View) {
                TODO("Not yet implemented")
            }

        }, "Yes")

    }
}
