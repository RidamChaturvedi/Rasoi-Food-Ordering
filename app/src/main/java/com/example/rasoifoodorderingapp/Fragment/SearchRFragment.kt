package com.example.rasoifoodorderingapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rasoifoodorderingapp.R
import com.example.rasoifoodorderingapp.adapter.MenuAdapter
import com.example.rasoifoodorderingapp.databinding.FragmentSearchRBinding


class SearchRFragment : Fragment() {
   private lateinit var binding: FragmentSearchRBinding
 private lateinit var   adapter: MenuAdapter
   private val originalMenuFoodName = listOf("Burgur","Sandwich", "momo","item","Sandwich","momo")
   private val originalMenuItemPrice = listOf("$5","$6","$8","$9", "$10","$10")
 private   val originalMenuImage = listOf(

        R.drawable.menu1,
        R.drawable.menu2,
        R.drawable.menu3,
        R.drawable.menu4,
        R.drawable.menu5,
        R.drawable.menu6,

        )
    private val filteredMenuFoodName = mutableListOf<String>()
    private val filteredMenuItemPrice = mutableListOf<String>()
    private val filteredMenuImage = mutableListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchRBinding.inflate(inflater,container,false)

        adapter = MenuAdapter(filteredMenuFoodName,filteredMenuItemPrice,filteredMenuImage)
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter= adapter

        // setup for search view
        setupSearchView()

        showAllMenu()
        return binding.root
    }

    private fun showAllMenu() {
        filteredMenuFoodName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()


        filteredMenuFoodName.addAll(originalMenuFoodName)
        filteredMenuItemPrice.addAll(originalMenuItemPrice)
        filteredMenuImage.addAll(originalMenuImage)
        adapter.notifyDataSetChanged()
    }

    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                filterMenuItems(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                filterMenuItems(newText)
                return true
            }
        })


    }

    private fun filterMenuItems(query: String) {


        originalMenuFoodName.forEachIndexed{ index,foodname ->
            if(foodname.contains(query.toString(),ignoreCase =true)) {
                filteredMenuFoodName.add(foodname)
                filteredMenuItemPrice.add(originalMenuItemPrice[index])
                filteredMenuImage.add(originalMenuImage[index])
            }

        }
        adapter.notifyDataSetChanged()
    }

    companion object {

    }
}