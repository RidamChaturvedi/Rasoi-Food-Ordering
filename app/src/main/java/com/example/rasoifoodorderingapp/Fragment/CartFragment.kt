package com.example.rasoifoodorderingapp.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rasoifoodorderingapp.CongratsBottomSheet
import com.example.rasoifoodorderingapp.PayOutActivity
import com.example.rasoifoodorderingapp.R

import com.example.rasoifoodorderingapp.adapter.cartadapter
import com.example.rasoifoodorderingapp.databinding.FragmentCartBinding


class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCartBinding.inflate(inflater, container, false)
        val cartFoodName= listOf("Burgur","Sandwich", "momo","item","Sandwich","momo")
        val cartItemPrice = listOf("$5","$6","$8","$9", "$10","$10")
        val cartImage = listOf(

            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6,

        )






val adapter =cartadapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
binding.cardrecyclerview.layoutManager= LinearLayoutManager(requireContext())
binding.cardrecyclerview.adapter =adapter
binding.proceedButton.setOnClickListener {
    val intent = Intent(requireContext(), PayOutActivity::class.java)
    startActivity(intent)
}




        return binding.root
    }

    companion object {

     }
}