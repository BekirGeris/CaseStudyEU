package com.example.casestudyeu.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.casestudyeu.R
import com.example.casestudyeu.adapter.FlightAdapter
import com.example.casestudyeu.databinding.FragmentFlightListBinding
import com.example.casestudyeu.databinding.FragmentHomeBinding
import com.example.casestudyeu.model.Flight
import com.example.casestudyeu.model.FlightsResponse
import java.util.ArrayList

class FlightListFragment : Fragment(R.layout.fragment_flight_list) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentFlightListBinding.bind(view)

        val flights = ArrayList<Flight>()
        flights.add(Flight("https://airhex.com/images/airline-logos/pegasus-airlines.png", "Pegasus", "ank", "saw", "08:22", "11:25", "20", "1.452,99 TL", "Direkt Uçuş"))
        flights.add(Flight("https://icdn.ensonhaber.com/resimler/diger/thy_4265.jpg", "Türk Hava Yolları", "ank", "saw", "08:22", "11:25", "20", "1.452,99 TL", "Direkt Uçuş"))
        flights.add(Flight("https://airhex.com/images/airline-logos/pegasus-airlines.png", "Pegasus", "ank", "saw", "08:22", "11:25", "20", "1.452,99 TL", "Direkt Uçuş"))
        flights.add(Flight("https://icdn.ensonhaber.com/resimler/diger/thy_4265.jpg", "Türk Hava Yolları", "ank", "saw", "08:22", "11:25", "20", "1.452,99 TL", "Direkt Uçuş"))
        flights.add(Flight("https://icdn.ensonhaber.com/resimler/diger/thy_4265.jpg", "Türk Hava Yolları", "ank", "saw", "08:22", "11:25", "20", "1.452,99 TL", "Direkt Uçuş"))
        flights.add(Flight("https://airhex.com/images/airline-logos/pegasus-airlines.png", "Pegasus", "ank", "saw", "08:22", "11:25", "20", "1.452,99 TL", "Direkt Uçuş"))
        flights.add(Flight("https://icdn.ensonhaber.com/resimler/diger/thy_4265.jpg", "Türk Hava Yolları", "ank", "saw", "08:22", "11:25", "20", "1.452,99 TL", "Direkt Uçuş"))

        val response = FlightsResponse()
        response.flights = flights
        val flighAdapter = FlightAdapter(response)


        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        binding.rv.adapter = flighAdapter
    }
}