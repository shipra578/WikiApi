package com.example.wikeapiapp.api.data.data

data class Page(
    val index: Int,
    val ns: Int,
    val pageid: Int,
    val terms: Terms,
    val thumbnail: Thumbnail,
    val title: String
)