package com.ajaychauhan4310.nearbybusiness

import com.ajaychauhan4310.nearbybusiness.Model.Results
import com.ajaychauhan4310.nearbybusiness.Remote.IGoogleAPIService
import com.ajaychauhan4310.nearbybusiness.Remote.RetrofitClient


object Common {
    var currentResult: Results? = null

    private val GOOGLE_API_URL="https://maps.googleapis.com/"
    val googleApiService:IGoogleAPIService
    get()=RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}