package com.example.rasoifoodorderingapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rasoifoodorderingapp.R
import com.example.rasoifoodorderingapp.adapter.BuyAgainAdapter
import com.example.rasoifoodorderingapp.databinding.FragmentHistoryBinding


class HistoryFragment : Fragment() {
  private lateinit var binding: FragmentHistoryBinding
   private lateinit var buyAgainAdapter: BuyAgainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        setuprecyclerView()
        return binding.root


    }
private fun setuprecyclerView(){
    val buyAgainFoodName= arrayListOf("Food 2", "Food 2" , "Food 3")
    val buyAgainFoodPrice= arrayListOf("$5", "$7" , "$9")
    val buyAgainFoodImage= arrayListOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3)

    buyAgainAdapter = BuyAgainAdapter(buyAgainFoodName, buyAgainFoodPrice, buyAgainFoodImage)

    buyAgainAdapter.also { binding.buyAgainRecyclerView.adapter = it }
    binding.buyAgainRecyclerView.layoutManager=LinearLayoutManager(requireContext())

}
    companion object {


    }
}