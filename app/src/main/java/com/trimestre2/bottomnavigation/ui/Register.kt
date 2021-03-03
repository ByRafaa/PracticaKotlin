package com.trimestre2.bottomnavigation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.trimestre2.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setup()

    }

    private fun setup() {

        accept.setOnClickListener {

            if (email.text.isEmpty() || pass.text.isEmpty()){

                Toast.makeText(this,"Rellene todos los campos",Toast.LENGTH_LONG).show()

            } else {

                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(email.text.toString(),pass.text.toString()).addOnCompleteListener {

                        if (it.isSuccessful){

                            onBackPressed()
                            Toast.makeText(this,"Registrado correctamente",Toast.LENGTH_LONG).show()

                        } else {

                            Toast.makeText(this,"Su cuenta ya está registrada",Toast.LENGTH_LONG).show()

                        }

                    }

            }

        }

        back.setOnClickListener {

            onBackPressed()

        }


    }
}