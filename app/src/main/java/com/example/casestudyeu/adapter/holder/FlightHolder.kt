package com.example.casestudyeu.adapter.holder

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.casestudyeu.databinding.FlightItemBinding
import com.example.casestudyeu.model.Flight
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import java.util.ArrayList
import javax.inject.Inject


class FlightHolder @Inject constructor(val glide: RequestManager, itemView: View) : RecyclerView.ViewHolder(itemView) {

    lateinit var binding: FlightItemBinding
    @SuppressLint("SetTextI18n")
    fun bind(flight: Flight) {
        binding = FlightItemBinding.bind(itemView)
        binding.companyName.text = flight.companyName
        binding.gelGit.text = "${flight.departurePlace} - ${flight.landingPlace}"
        binding.departureTime.text = flight.departureTime
        binding.landingTime.text = flight.landingTime
        binding.amount.text = flight.amount
        binding.flightType.text = flight.type
        glide.load(flight.companyLogoUrl).into(binding.logo)
    }
}