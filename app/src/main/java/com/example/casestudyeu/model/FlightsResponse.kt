package com.example.casestudyeu.model

import java.util.ArrayList

class FlightsResponse {
    lateinit var departurePlace: String
    lateinit var landingPlace: String
    lateinit var flights : ArrayList<Flight>
}