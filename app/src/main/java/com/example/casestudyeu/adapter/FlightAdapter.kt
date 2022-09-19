package com.example.casestudyeu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.casestudyeu.R
import com.example.casestudyeu.adapter.holder.FlightHolder
import com.example.casestudyeu.model.FlightsResponse

class FlightAdapter(val flightsResponse: FlightsResponse) : RecyclerView.Adapter<FlightHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.flight_item, parent, false)
        return FlightHolder(view)
    }

    override fun onBindViewHolder(holder: FlightHolder, position: Int) {
        holder.bind(flightsResponse.flights[position])
    }

    override fun getItemCount(): Int {
        return flightsResponse.flights.size
    }
}