package com.example.constraintlayout_learn

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.constraintlayout_learn.databinding.ActivityProfileViewBinding

class ProfileViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityProfileViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerVieww.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.steve_job, "Steve Jobs \n Apple", "68" ))
            data.add(ItemsViewModel(R.drawable.bill_gates, "Bill Gates \n Microsoft ", "42"))
        }

        val adapter = BooksAdapter(data)

        binding.recyclerVieww.adapter = adapter
    }

    fun onClickMenu2(view: View) {}
    data class ItemsViewModel(val image: Int, val text: String , val percentage: String) {
    }

}