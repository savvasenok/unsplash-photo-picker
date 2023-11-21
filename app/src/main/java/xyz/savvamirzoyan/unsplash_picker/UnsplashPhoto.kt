package xyz.savvamirzoyan.unsplash_picker

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UnsplashPhoto(
    val id: String,
    val thumb: String,
    val full: String
) : Parcelable
