package com.example.wikeapiapp.api.data.data

data class ResponseWiki(
    val batchcomplete: Boolean,
    val `continue`: Continue,
    val query: Query
)