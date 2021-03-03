package com.trimestre2.bottomnavigation.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.trimestre2.bottomnavigation.R
import com.trimestre2.bottomnavigation.ui.favorites.FavsFragment
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    private lateinit var user:FirebaseUser

    private lateinit var profileViewModel: ProfileViewModel

    var cantidad = 0

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        profileViewModel =
                ViewModelProvider(this).get(ProfileViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_profile, container, false)
        val email:TextView = root.findViewById(R.id.tvEmail)
        profileViewModel.text.observe(viewLifecycleOwner, Observer {

            user = FirebaseAuth.getInstance().currentUser!!

            email.text = user.email

            profileView.setImageResource(R.drawable.profile)

        })
        return root
    }

    fun cantidad(cant:Int){

        cantidad = cant

    }

}