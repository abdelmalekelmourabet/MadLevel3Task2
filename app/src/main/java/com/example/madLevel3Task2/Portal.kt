package com.example.madLevel3Task2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Portal (
    var websiteName: String,
    var url: String
) : Parcelable