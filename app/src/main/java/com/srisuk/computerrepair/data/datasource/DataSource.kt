package com.srisuk.computerrepair.data.datasource

import com.srisuk.computerrepair.data.models.Profile
import com.srisuk.computerrepair.data.request.LoginRequest
import com.srisuk.computerrepair.data.response.LoginResponse

interface DataSource {
    fun login(req: LoginRequest): LoginResponse
    fun profile(userId:Int): Profile
}