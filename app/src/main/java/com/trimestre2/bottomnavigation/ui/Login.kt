package com.trimestre2.bottomnavigation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.trimestre2.bottomnavigation.MainActivity
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.favorites.FavsFragment
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setup()

    }

    private fun setup() {

        register.setOnClickListener {

            var intent = Intent(this,Register::class.java)
            startActivity(intent)

        }

        login.setOnClickListener {

            if (email.text.isEmpty() || pass.text.isEmpty()){

                Toast.makeText(this, "Rellene todos los campos",Toast.LENGTH_LONG).show()

            } else {

                FirebaseAuth.getInstance().signInWithEmailAndPassword(email.text.toString(),pass.text.toString()).addOnCompleteListener {

                    if (it.isSuccessful){

                        var intent = Intent(this,MainActivity::class.java)
                        startActivity(intent)

                    } else {
                        
                        Toast.makeText(this,"Correo o contraseña incorrectos",Toast.LENGTH_LONG).show()

                    }

                }

            }

        }

    }
}